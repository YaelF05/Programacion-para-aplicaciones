import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del archivo: ");
        String nombreArchivo = sc.nextLine();
        System.out.print("Ingresa la cadena a eliminar: ");
        String cadena = sc.nextLine();

        File archivo = new File(nombreArchivo);
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        StringBuilder contenido = new StringBuilder();
        String linea;

        while ((linea = br.readLine()) != null) {
            contenido.append(linea.replace(cadena, "")).append("\n");
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(contenido.toString());
        bw.close();

        System.out.println("Se eliminó la cadena: " + cadena);

    }
}