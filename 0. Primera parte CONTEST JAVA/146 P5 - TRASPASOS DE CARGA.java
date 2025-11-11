import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        
        for (int i = 0; i < K; i++) {
            // Leer contenedores origen
            int N = scanner.nextInt();
            List<Integer> origen = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                origen.add(scanner.nextInt());
            }
            
            // Leer contenedores destino
            int P = scanner.nextInt();
            List<Integer> destino = new ArrayList<>();
            for (int j = 0; j < P; j++) {
                destino.add(scanner.nextInt());
            }
            
            // Proceso de traspaso
            int sobrantes = 0;
            int currentDestino = 0;
            
            for (int paquetes : origen) {
                while (paquetes > 0 && currentDestino < destino.size()) {
                    int capacidad = destino.get(currentDestino);
                    if (paquetes <= capacidad) {
                        destino.set(currentDestino, capacidad - paquetes);
                        paquetes = 0;
                    } else {
                        paquetes -= capacidad;
                        destino.set(currentDestino, 0);
                        currentDestino++;
                    }
                }
                sobrantes += paquetes;
            }
            
            System.out.println(sobrantes);
        }
    }
}