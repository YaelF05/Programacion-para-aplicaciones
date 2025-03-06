import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int resultado = 0;
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el simbolo de la operacion a relizar: ");
        String operacion = sc.next();

        try {
            System.out.print("Ingresa el primer numero: ");
            num1 = sc.nextInt();
            System.out.print("Ingresa el segundo numero: ");
            num2 = sc.nextInt();
        }catch (java.util.InputMismatchException e) {
            System.out.println("Entrada incorrecta");
            System.exit(0);
        }

        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                try {
                    resultado = num1 / num2;
                }catch(ArithmeticException e) {
                    System.out.println("No se puede dividir entre 0");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Opcion incorrecta");
                System.exit(0);
                break;
        }

        System.out.println(num1 + " " + operacion + " " + num2 + " = " + resultado);

    }
}