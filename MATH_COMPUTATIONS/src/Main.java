import java.util.Scanner;

public class Main
{
    public  static void main(String[] args) {

        while (true) {
            int choice;
            System.out.println("WHICH OPERATION DOU YOU WANT TO CARRY OUT");
            System.out.println("1)MULTIPLICATION");
            System.out.println("2)DIVISION");
            System.out.println("3)ADDITION");
            System.out.println("4)SUBTRACTION");
            System.out.println("5)MODULUS");
            System.out.println("6)Area of a circle");
            System.out.println("7)EXIT");
            System.out.print("CHOICE:");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            if (choice == 6){
                System.out.println("Enter radius");
                double rad = input.nextDouble();
            }
            else if (choice == 7) {
            System.out.println("EXITING................");
            break;
            }

            System.out.println("Enter the first number");
            double firstNumber = input.nextDouble();

            System.out.println("Enter the second number");
            double secondNumber = input.nextDouble();

            Multiplication multiplication = new Multiplication();
            multiplication.setFirstNumber(firstNumber);
            multiplication.setSecondNumber(secondNumber);
            double product = multiplication.multiply();

            Division division = new Division(firstNumber,secondNumber);
            double div = division.divide();

            Addition addition = new Addition(firstNumber, secondNumber);
            double sum = addition.add();

            Subtraction sub =new Subtraction(firstNumber,secondNumber);
            double diff =sub.Subtr();

            modulus Modulus = new modulus(firstNumber, secondNumber);
            double mod = Modulus.mod();


            AreaCircle areaCircle = new AreaCircle(rad);
            areaCircle.setRadius(rad);
            double aCircle = areaCircle.Area();
            if (choice == 1) {
                System.out.println("The product is " + product);
            } else if (choice == 2) {
                System.out.println("The division is " + div);
            } else if (choice == 3) {
                System.out.println("The addition is " + sum);
            } else if (choice == 4) {
                System.out.println("The subtraction is " + diff);
            } else if (choice == 5) {
                System.out.println("The modulus is " + mod);
            } else if (choice==6) {
                System.out.println("The area of the circle is " + mod);
            }
        }
    }
}


