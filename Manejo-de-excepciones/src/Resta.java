public class Resta {

    public void restarNumeros(int number1, int number2)throws Exception {

        if (number1 - number2 >= 100) {
            throw new numeroMayorA100("El resultado es mayor a 100");
        }
        System.out.println("El resultado es: " + (number1 - number2));

    }

}
