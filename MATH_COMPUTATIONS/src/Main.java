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
            System.out.println("7)Circumference of a circle");
            System.out.println("8)Area of a Triangle");
            System.out.println("9)EXIT");
            System.out.print("CHOICE:");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            double rad = 0;

            double firstNumber = 0;
            double secondNumber = 0;
            double radius = 5;
            if (choice == 6) {
                System.out.println("Enter radius");
                rad = input.nextDouble();

            }
//            radius = rad;
            else if (choice == 7) {
                System.out.println("Enter radius");
                rad = input.nextDouble();

            }
                else if(choice ==8){
                    System.out.println("Enter base");
                    base=input.nextDouble();
                    System.out.println("Enter height");
                    height =input.nextDouble();
                }
            else if (choice == 9) {
                System.out.println("EXITING................");
                break;
            } else {
                System.out.println("Enter the first number");
                firstNumber = input.nextDouble();

                System.out.println("Enter the second number");
                secondNumber = input.nextDouble();
            }


            Multiplication multiplication = new Multiplication();
            multiplication.setFirstNumber(firstNumber);
            multiplication.setSecondNumber(secondNumber);
            double product = multiplication.multiply();

            Division division = new Division(firstNumber, secondNumber);
            double div = division.divide();

            Addition addition = new Addition(firstNumber, secondNumber);
            double sum = addition.add();

            Subtraction sub = new Subtraction(firstNumber, secondNumber);
            double diff = sub.Subtr();

            modulus Modulus = new modulus(firstNumber, secondNumber);
            double mod = Modulus.mod();


            AreaCircle areaCircle = new AreaCircle(radius);
            areaCircle.setRadius(rad);
            double aCircle = areaCircle.Area();

            CircumferenceOfCircle Circumference = new CircumferenceOfCircle(rad);
            double circum = Circumference.circumference();

            AreaTriangle areaTriangle =new AreaTriangle(base,height);
            double aTriangle= areaTriangle.Area();
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
            } else if (choice == 6) {
                System.out.println("The area of the circle is " + aCircle);
            }
            else if (choice == 7) {
                System.out.println("The circumference of the circle is " + circum);
            }
            else if (choice ==8) {
                System.out.println("The area of the Triangle is "+ aTriangle);
            }
        }
    }
}


