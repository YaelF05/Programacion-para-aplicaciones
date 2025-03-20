import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int contadorCaracteres = 0;
        int contadorPalabras = 0;
        int contadorLineas = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del archivo: ");
        String nombreArchivo = sc.nextLine();
        sc.close();

        if(nombreArchivo.isEmpty()){
            System.out.println("Debes de ingresar el nombre del archivo");
            return;
        }

        File archivo = new File(nombreArchivo);
        if(!archivo.exists()){
            System.out.println("El archivo no existe");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String line;
        while ((line = br.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                contadorCaracteres += line.length();
                contadorPalabras += line.split("\\s+").length;
            }
            contadorLineas++;
        }


        System.out.println("El archivo tiene:");
        System.out.println(contadorCaracteres + " caracteres");
        System.out.println(contadorPalabras + " palabras");
        System.out.println(contadorLineas + " líneas");

    }
}