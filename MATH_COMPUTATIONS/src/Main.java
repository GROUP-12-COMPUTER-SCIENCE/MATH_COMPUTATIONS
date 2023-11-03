import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double product;
        double firstNumber;
        double secondNumber;
        while(true){
            displayMenu();
            choice = scanner.nextInt();
            if(choice == 6){
                break;
            }
            System.out.print("ENTER FIRST NUMBER:");
            Scanner input = new Scanner(System.in);
            firstNumber = input.nextDouble();
            System.out.print("ENTER SECOND NUMBER:");
            secondNumber = input.nextDouble();
            product = compute(choice, firstNumber, secondNumber);
            System.out.println();
            System.out.println("THE ANSWER IS " + product);
            System.out.println();
        }

    }

    public static void displayMenu() {
        System.out.println("WHICH OPERATION DOU YOU WANT TO CARRY OUT");
        System.out.println("1)MULTIPLICATION");
        System.out.println("2)DIVISION");
        System.out.println("3)ADDITION");
        System.out.println("4)SUBTRACTION");
        System.out.println("5)MODULUS");
        System.out.println("6)EXIT");
        System.out.println();
        System.out.print("CHOICE:");
    }

    public static double compute(int choice , double firstNumber, double secondNumber){
        switch( choice ){
            case 1 :
                Multiplication mult = new Multiplication();
                return mult.multiply(firstNumber, secondNumber);
            case 2 :
                Division div = new Division();
                return div.divide(firstNumber, secondNumber);
            case 3 :
                Addition add = new Addition();
                return add.add(firstNumber, secondNumber);
            case 4 :
                Subtraction sub = new Subtraction();
                return sub.subract(firstNumber, secondNumber);
            case 5 :
                Modulus mod = new Modulus();
                return mod.modulus(firstNumber, secondNumber);
            default :
                System.out.println("INVALID CHOICE");
                return 0.0;
        }
    }
}


