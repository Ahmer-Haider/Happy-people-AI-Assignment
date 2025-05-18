//6. Use this() and super() in methods not in constructor

package Assignment.ThisAndSuperKeyword;

class Parents {
    void showMessage() {
        System.out.println("Used this() and super() in methods");
    }

    void callMessage() {
        this.showMessage();
    }
}

class Children extends Parents {
    void execute() {
        super.callMessage();
    }
}

public class ThisSuperInMethods {
    public static void main(String[] args) {
        Children obj = new Children();
        obj.execute();
    }
}
