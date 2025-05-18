USE sqlassignment;

-- 1.Display snum,sname,city and comm of all salespeople.
SELECT * FROM salespeople;

-- 2.Display all snum without duplicates from all orders. 
SELECT DISTINCT Snum FROM Orders;

-- 3.Display names and commissions of all salespeople in london.
SELECT Sname AS `Name`, Comm AS `Commission` FROM salespeople WHERE City = "london";

-- 4.All customers with rating of 100.
SELECT * FROM Customers WHERE Rating = 100;

-- 5.Produce orderno, amount and date form all rows in the order table.
SELECT Onum AS `Oreder number`, AMT AS `Amount`, Odate as `Order date` from Orders;

-- 6.All customers in San Jose, who have rating more than 200
SELECT * FROM Customers WHERE City = "San Jose" AND Rating>200;

-- 7.All customers who were either located in San Jose or had a rating above 200
SELECT * FROM Customers WHERE City = "San Jose" OR Rating>200;


-- 8.All orders for more than $1000.
SELECT * FROM Orders WHERE AMT>1000;


-- 9.Names and cites of all salespeople in london with commission above 0.10.
SELECT Sname AS `Name`, City FROM salespeople WHERE City="london" AND Comm>0.10;

-- 10.All customers excluding those with rating <= 100 unless they are located in Rome
SELECT * FROM customers WHERE Rating<=100 OR City='Rome';

-- 11. All salespeople either in Barcelona or in london.
SELECT * FROM salespeople WHERE City IN ('Barcelona','london');

-- 12.All salespeople with commission between 0.10 and 0.12. (Boundary values should be excluded)
SELECT * FROM salespeople WHERE Comm > 0.10 AND Comm < 0.12;

-- 13.All customers with NULL values in city column.
SELECT * FROM customers WHERE City is null;

-- 14.All orders taken on Oct 3Rd   and Oct 4th  1994.
SELECT * FROM orders WHERE Odate IN ('1994-10-03','1994-10-04');

-- 15.All customers serviced by peel or Motika.
SELECT Distinct c.Cnum, c.Cname, c.City FROM customers c JOIN orders o ON c.Cnum = o.Cnum JOIN salespeople s ON s.Snum = o.Snum WHERE s.Sname='peel' OR s.Sname='Motika';

-- 16.All customers whose names begin with a letter from A to B.
SELECT *
FROM Customers
WHERE Cname LIKE 'A%' OR Cname LIKE 'B%';


-- 17.All orders except those with 0 or NULL value in amt field.
SELECT *
FROM Orders
WHERE AMT != 0 OR AMT IS NOT NULL;


-- 18.Count the number of salespeople currently listing orders in the order table.
SELECT COUNT(DISTINCT Snum) AS 'salespeople currently listing orders'
FROM Orders;


-- 19.Largest order taken by each salesperson, datewise
SELECT s.Sname As `Name`,o.Snum, o.Odate, MAX(o.AMT) AS 'Largest order'
FROM Orders o
JOIN salespeople s ON s.Snum = o.Snum 
GROUP BY Odate, Snum,Sname
ORDER BY Odate,Snum;


-- 20.Largest order taken by each salesperson with order value more than $3000.
SELECT s.Sname As `Sales Person Name`,o.Snum, o.Odate, MAX(o.AMT) AS 'Largest order'
FROM Orders o
JOIN salespeople s ON s.Snum = o.Snum
WHERE o.AMT > 3000
GROUP BY o.Odate, o.Snum, s.Sname
ORDER BY o.Odate, o.Snum;


-- 21.Which day had the hightest total amount ordered.
SELECT Odate as Date , AMT as Amount, Snum, Cnum
FROM Orders
WHERE AMT = ( SELECT MAX(AMT) FROM Orders);


-- 22.Count all orders for Oct 3rd.
SELECT COUNT(*) AS 'Orders on Oct 3rd'
FROM Orders
WHERE Odate = '1994-10-03';


-- 23.Count the number of different non NULL city values in customers table.
SELECT COUNT(DISTINCT City)
FROM Customers
WHERE City IS NOT NULL;


-- 24.Select each customer’s smallest order.
SELECT Cnum, MIN(AMT)
FROM Orders
GROUP BY Cnum;


-- 25.First customer in alphabetical order whose name begins with G.
SELECT MIN(Cname)
FROM Customers
WHERE Cname LIKE 'G%';


-- 26.Get the output like “ For dd/mm/yy there are ___ orders.
SELECT concat('For ', DATE_FORMAT(Odate,'%d/%m/%y'), ' there are ',COUNT(*), ' Orders ') As Message
FROM Orders
GROUP BY Odate;


-- 27.Assume that each salesperson has a 12% commission. Produce order no., salesperson no., 
-- and amount of salesperson’s commission for that order.
SELECT Onum, Snum, AMT, round(AMT * 0.12,2) AS 'Commission'
FROM Orders
ORDER BY Snum;


-- 28. Find highest rating in each city. Put the output in this form. For the city (city), 
-- the highest rating is : (rating).
SELECT 
    CONCAT('For the City ( ', City, ' ) the highest rating is: ( ', MAX(Rating), ' )') AS Message
FROM Customers
GROUP BY City;

-- 29.Display the totals of orders for each day and place the results in descending order.
SELECT Odate, COUNT(Onum) AS 'Total No of Orders'
FROM Orders
GROUP BY Odate
ORDER BY COUNT(Onum) DESC;


-- 30.All combinations of salespeople and customers who shared a city. (ie same city).
SELECT s.Sname, c.Cname, s.City AS City
FROM SalesPeople  s JOIN Customers  c ON  s.City = c.City
WHERE s.City = c.City;


-- 31.Name of all customers matched with the salespeople serving them
SELECT c.Cname AS Customer, s.Sname AS Salesperson
FROM Customers c
JOIN SalesPeople s ON c.Snum = s.Snum;


-- 32.List each order number followed by the name of the customer who made the order.
SELECT Onum as `Order Number`, Cname as `Customer Name`
FROM Customers c join Orders o on o.Cnum = c.Cnum;



-- 33.Names of salesperson and customer for each order after the order number.
SELECT o.Onum, s.Sname, c.Cname
FROM Orders o join Customers c on c.Cnum = o.Cnum join SalesPeople s on o.Snum = s.Snum;

-- 34.Produce all customer serviced by salespeople with a commission above 12%.
SELECT c.Cname, s.Sname, s.Comm
FROM Customers c join salespeople s on s.Snum = c.Snum
WHERE s.Comm > 0.12;


-- 35.Calculate the amount of the salesperson’s commission on each order with a rating above 100.
SELECT s.Sname, ROUND(o.AMT*s.Comm,2) as 'saplesperson Amount', c.Rating
FROM Customers c join SalesPeople s on s.Snum = c.Snum join orders o on o.Cnum = c.Cnum
WHERE Rating > 100;


-- 36.Find all pairs of customers having the same rating.
SELECT a.Cname, b.Cname, a.Rating
FROM Customers a Join Customers b on a.Rating = b.Rating
WHERE a.Cnum != b.Cnum;
 

-- 37.Find all pairs of customers having the same rating, each pair coming once only.
SELECT a.Cname AS Customer1, b.Cname AS Customer2, a.Rating
FROM Customers a 
JOIN Customers b ON a.Rating = b.Rating AND a.Cnum < b.Cnum;


-- 38.Policy is to assign three salesperson to each customers. Display all such combinations.
SELECT c.Cname, s.Sname
FROM Customers c
CROSS JOIN (
    SELECT Sname
    FROM SalesPeople
    LIMIT 3
) s
ORDER BY c.Cname, s.Sname;



-- 39.Display all customers located in cities where salesman serres has customer.
SELECT Cname
FROM Customers
WHERE City IN (
    SELECT DISTINCT c.City
    FROM Customers c
    JOIN Orders o ON c.Cnum = o.Cnum
    WHERE o.Snum = (
        SELECT Snum FROM SalesPeople WHERE Sname = 'Serres'
    )
);



-- 40.Find all pairs of customers served by single salesperson.
SELECT DISTINCT a.Cname AS Customer1, b.Cname AS Customer2
FROM Customers a
JOIN Customers b ON a.Snum = b.Snum AND a.Cnum < b.Cnum;



-- 41.Produce all pairs of salespeople which are living in the same city. 
-- Exclude combinations of salespeople with themselves as well as duplicates with the order reversed.
SELECT a.Sname AS Salesperson1, b.Sname AS Salesperson2, a.City
FROM SalesPeople a
JOIN SalesPeople b ON a.City = b.City AND a.Snum < b.Snum;



-- 42.Produce all pairs of orders by given customer, names that customers and eliminates duplicates.
SELECT c.Cname, a.Onum AS Order1, b.Onum AS Order2
FROM Orders a
JOIN Orders b ON a.Cnum = b.Cnum AND a.Onum > b.Onum
JOIN Customers c ON c.Cnum = a.Cnum;


-- 43.Produce names and cities of all customers with the same rating as Hoffman.
SELECT Cname, City
FROM Customers
WHERE Rating = (SELECT Rating FROM Customers WHERE Cname = 'Hoffman') AND Cname != 'Hoffman';


-- 44.Extract all the orders of Motika.
SELECT Onum
FROM Orders
WHERE Snum = ( SELECT Snum FROM SalesPeople WHERE Sname = 'Motika');


-- 45.All orders credited to the same salesperson who services Hoffman
SELECT O.Onum, S.Sname, C.Cname, O.AMT
FROM Orders O
JOIN SalesPeople S ON O.Snum = S.Snum
JOIN Customers C ON O.Cnum = C.Cnum
WHERE O.Snum IN (
    SELECT Snum 
    FROM Orders 
    WHERE Cnum = (SELECT Cnum FROM Customers WHERE Cname = 'Hoffman')
);



SELECT *
FROM Orders
WHERE AMT > (
    SELECT AVG(AMT)
    FROM Orders
    WHERE Odate = '1994-10-04'
);

 

-- 47.Find average commission of salespeople in london.
SELECT ROUND(AVG(Comm),4) as 'Average Comminssion'
FROM SalesPeople
WHERE City = 'London';


-- 48.Find all orders attributed to salespeople servicing customers in london.
SELECT Snum, Cnum
FROM Orders
WHERE Cnum IN (SELECT Cnum FROM Customers WHERE City = 'London');

-- 49.Extract commissions of all salespeople servicing customers in London.
SELECT Comm
FROM SalesPeople
WHERE Snum IN (SELECT Snum FROM Customers WHERE City = 'London');


-- 50.Find all customers whose cnum is 1000 above the snum of serres.
SELECT Cnum, Cname from Customers
where Cnum > ( SELECT Snum + 1000
                FROM SalesPeople
                WHERE Sname = 'Serres');
