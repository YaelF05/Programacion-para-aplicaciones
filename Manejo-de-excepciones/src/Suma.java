public class Suma {

    public void sumarNumeros(int number1, int number2) {
        try{
            if(number1 < 0 || number2 < 0) {
                throw new Exception("El número debe ser mayor o igual que 0");
            }
            System.out.println(number1 + number2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fin");
        }
    }

}
