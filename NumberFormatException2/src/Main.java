import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int resultado = 0;
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el simbolo de la operacion a relizar: ");
        String operacion = sc.next();

        // validacion del tipo de entrada mediante hasNextInt
        System.out.print("Ingresa el primer numero: ");
        if(!sc.hasNextInt()) {
            System.out.println("La entrada debe ser un entero");
            System.exit(0);
        }
        num1 = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        if(!sc.hasNextInt()) {
            System.out.println("La entrada debe ser un entero");
            System.exit(0);
        }
        num2 = sc.nextInt();

        //switch para realizar las operaciones
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
                if (num2 == 0){
                    System.out.println("No se puede dividir entre 0");
                    System.exit(0);
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("La operacion no existe");
                System.exit(0);
                break;
        }

        System.out.println(num1 + " " + operacion + " " + num2 + " = " + resultado);

    }
}