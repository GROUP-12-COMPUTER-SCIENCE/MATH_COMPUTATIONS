public class Division {



    double firstNumber;
    double secondNumber;
    double div;

    public Division(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        div = firstNumber/secondNumber;
    }

    public void printDivision() {
        System.out.println(div);
    }
}