public class Main {
    public static void main(String[] args) {

        Suma suma = new Suma();
        Resta resta = new Resta();
        Division division = new Division();

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

        try {
            division.metodoB();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}