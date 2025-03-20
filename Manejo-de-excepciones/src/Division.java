public class Division {

    public void metodoA() throws numeroMayorA100 {
        throw new numeroMayorA100("Excepción desde método A");
    }

    public void metodoB() throws Exception {
        try {
            metodoA();
        } catch (numeroMayorA100 e) {
            throw new Exception("Excepción desde método B", e);
        }
    }

}
