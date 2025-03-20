public class Main {
    public static void main(String[] args) {

        Suma suma = new Suma();
        Resta resta = new Resta();

        suma.sumarNumeros(-1,1);

        try {
            resta.restarNumeros(101,1);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            Multiplicacion multiplicacion = null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}