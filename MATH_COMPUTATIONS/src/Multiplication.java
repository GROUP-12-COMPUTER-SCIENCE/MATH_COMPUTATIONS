public class Multiplication {
    double firstNumber;
    double secondNumber;
    double mult;

    public Multiplication(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        mult = firstNumber*secondNumber;
    }

    public void printMultiplication() {
        System.out.println(mult);
    }
}

