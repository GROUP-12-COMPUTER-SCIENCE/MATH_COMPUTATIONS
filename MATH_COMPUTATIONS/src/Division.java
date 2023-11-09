public class Division {
    double firstNumber;
    double secondNumber;
    double div;
// Constructor to initialize the two numbers when an object is created
    public Division(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
// Method to perform division and return the result
    public double divide() {
// Perform the division and return the result
        return firstNumber/secondNumber;
    }
}
