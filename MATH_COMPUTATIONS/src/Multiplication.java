class Multiplication {
    private double firstNumber;
    private double secondNumber;

    public Multiplication()
    {
    }
    public Multiplication(double firstNumber, double secondNumber)

    {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public  void setFirstNumber(double firstNumber)
    {
        this.firstNumber = firstNumber;
    }
    public void  setSecondNumber(double secondNumber)
    {
        this.secondNumber = secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }
}

