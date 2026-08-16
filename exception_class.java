class MyException extends Exception {

    @Override
    public String getMessage() {
        return "Age is greater than 9";
    }
}

public class exception_class {
    public static void main(String[] args) {

        int a = 10;

        if (a > 9) {

            // using the throw keyword
            // throw new ArithmeticException("You are not eligible");

            try {
                throw new MyException();
            }
            catch (Exception e) {

                System.out.println(e.getMessage());

                System.out.println(e.toString());

                e.printStackTrace();

                System.out.println("Finished");
            }
        }

        System.out.println("Yes Finished");
    }

}