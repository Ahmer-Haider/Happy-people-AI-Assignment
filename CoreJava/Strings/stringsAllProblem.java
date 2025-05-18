// Strings Assignment 01 - 14 Problems

package Assignment.Strings;

public class stringsAllProblem {

    public static void main(String[] args) {

        // 1. String creation Different ways
        String s1 = "This is a string";
        System.out.println(s1);
        String s2 = new String("Created using new keyword");
        System.out.println(s2);

        // 2. String concatenation
        String sc1 = "This String is ";
        String sc2 = "Concatenated";
        String con = sc1 + sc2;
        System.out.println(con);

        // 3. String length
        String sl = "String Length";
        System.out.println("Length : " + sl.length());

        // 4. Substring
        String es = "Extracting string";
        String sub = es.substring(2, 10);
        System.out.println("Substring : " + sub);

        // 5. indexOf
        String si = "Searching index";
        System.out.println("Index of 'index' : " + si.indexOf("index"));
        System.out.println("Index of 'h' from 3 : " + si.indexOf("h", 3));

        // 6. Regex match
        String ms = "Matching a String";
        System.out.println("Matches regex : " + ms.matches("(.*)String(.*)"));

        // 7. String comparisons
        String cs1 = "Comparing strings";
        String cs2 = "Comparing strings";
        System.out.println("Equals : " + cs1.equals(cs2));
        System.out.println("Equals Ignore Case : " + cs1.equalsIgnoreCase(cs2));
        System.out.println("Starts with 'Comp' : " + cs1.startsWith("Comp"));
        System.out.println("Ends with 'ings' : " + cs1.endsWith("ings"));
        System.out.println("compareTo : " + cs1.compareTo(cs2));

        // 9. Trim string
        String ts = "   Trimming String  ";
        System.out.println("Trimmed : " + ts.trim());

        // 10. Replace character
        String rs = "Replacing string";
        System.out.println("Replaced : " + rs.replace("g", "n"));

        // 11. Split string
        String ss = "Splitting String";
        for (String i : ss.split(" ")) {
            System.out.println("Split part : " + i);
        }

        // 12. Convert number to string
        int ns = 11;
        String nTs = String.valueOf(ns);
        System.out.println("Number to String : " + nTs + 22);

        // 13. int to string
        int is = 11;
        String iTs = Integer.toString(is);
        System.out.println("Int to String : " + iTs + 33);

        // 14. Case conversion
        String a = "upper case";
        String b = "LOWER CASE";
        System.out.println("To Upper : " + a.toUpperCase());
        System.out.println("To Lower : " + b.toLowerCase());
    }
}
