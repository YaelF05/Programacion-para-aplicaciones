import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> votos = new HashMap<>();
        int totalVotos = 0;
        int voto;

        System.out.println("Realiza una de las siguientes acciones \n- Ingresa el número del candidato \n- Ingresa 0 para terminar las votaciones ");
        do{
            voto = scan.nextInt();

            if(voto != 0){
                votos.put(voto, votos.getOrDefault(voto, 0) + 1);
                totalVotos++;
            }else{
                System.out.println("Se terminarón las votaciones");
            }
        }while (voto != 0);

        System.out.println("\nResultados:");
        for (Map.Entry<Integer, Integer> candidato : votos.entrySet()) {
            double porcentaje = ( candidato.getValue() / (double) totalVotos) * 100;
            System.out.printf("Candidato %d: %d votos (%.1f%%)\n", candidato.getKey(),candidato.getValue(), porcentaje);
        }
    }
}