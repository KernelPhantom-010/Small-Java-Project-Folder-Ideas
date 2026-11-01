//Basic Calculator
//Made by me at 1st. November 2026

public class Main{
    public static void main(String[] args) {
        String firstNumber = args[0];
        String operation = args[1];
        String scndNumber = args[2];
        char operationChar = operation.charAt(0);

        if (operationChar == '-'){
            System.out.print("Minus!");
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(scndNumber);

            System.out.print("\nResult: "+ Integer.toString(num1 - num2));
        }
        else if (operationChar == '+'){
            System.out.print("Plus!");
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(scndNumber);

            System.out.print("\nResult: "+ Integer.toString(num1 + num2));
        }
        else if (operationChar == '*'){
            System.out.print("Multi.!");
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(scndNumber);

            System.out.print("\nResult: "+ Integer.toString(num1 * num2));
        }
        else if (operationChar == '/'){
            System.out.print("Devide!");
            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(scndNumber);
            if (num2 > 0){
                System.out.print("\nResult: "+ Integer.toString(num1 - num2));     
            }else{
                System.out.print("Cannot device through 0!");
                return;
            }
        }
        else
        {
            System.out.print("Unknown operation!");
        }

    }
}
