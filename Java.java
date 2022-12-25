public class Java {
    static void calc(double param1, double param2, String operation) {
        switch (operation) {
            case "+":
                System.out.println(param1 + param2);
                break;
            case "-":
                System.out.println(param1 - param2);
                break;
            case "*":
                System.out.println(param1*param2);
                break;
            case "/":
                System.out.println(param1/param2);
                break;
        }
    }
    public static void main(String[] args) {
            calc(30, 10, "+");
            calc(32, 10, "-");
            calc(25, 10, "*");
            calc(110, 10, "/");
        }
    }

