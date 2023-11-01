public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Create a new Multiplication object.
        Multiplication multiplication = new Multiplication(10.0, 20.0);

        // Call the printMultiplication() method on the Multiplication object.
        multiplication.printMultiplication();
        Division division = new Division(50.0, 10.0);
        division.printDivision();
    }
}


