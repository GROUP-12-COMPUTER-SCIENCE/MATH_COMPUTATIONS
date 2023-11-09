public class Division {
    double firstNumber;
    double secondNumber;
    double div;
// Constructor to initialize the two numbers when an object is created
    public Division(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double divide() {

        return firstNumber/secondNumber;
    }
}
