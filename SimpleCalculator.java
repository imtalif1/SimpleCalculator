import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        double a = scanner.nextDouble();

        System.out.println("Choose the Calculation to perform : ");
        System.out.println("1. Add + ");
        System.out.println("2. Subract - ");
        System.out.println("3. Multiply * ");
        System.out.println("4. Divide / ");
        int choice = scanner.nextInt();

        System.out.println("Enter the second number : ");
        double b = scanner.nextDouble();
        
        double A = 0;
        double S = 0;
        double M = 0;
        double D = 0;
        

        switch (choice) {
            case 1:
                A = a + b;
                System.out.println("The Addition of "+ a +" and "+ b +" is :"+ A);
                break;
            case 2:
                S = a - b;
                System.out.println("The Subraction of "+ a +" and "+ b +" is :"+ S);
                break;
            case 3:
                M = a * b;
                System.out.println("The Multiplication of "+ a +" and "+ b +" is :"+ M);
                break;
            case 4:
                if (b != 0){
                D = a / b;
                System.out.println("The Division of "+ a +" and "+ b +" is :"+ D);
                }else{
                    System.out.println("Number cannot be divided by 0 (undefined)");
                }
                break;
            }
                        
            scanner.close();
            
        }
        

}

