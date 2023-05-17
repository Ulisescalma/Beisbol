import java.util.Scanner;
public class juego
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] preguntas = {
            "¿Rusia es el pais mas grande del mundo?. (V/F)",
            "¿El agua hierve a 100 grados Celsius?. (V/F)",
            "¿China es el pasia mas pequeño del mundo?. (V/F)",
            "¿La Tierra es plana?. (V/F)",
            "¿la isla los roques hace parte de Aruba?. (V/F)",
            "El Pasaje de Drake, conocido también como el Mar de Hoces, es el lugar más peligroso y hostil de todos los océanos del mundo. (V/F)",
            "¿Chris Cerulli es un cantante?. (V/F)",
            "¿La banda The Killers es una banda de rock?. (V/F)",
            "¿Jack el destripador era Estado Unidense?. (V/F)",
            "¿Hel es una diosa India?. (V/F)",
            // Agrega las preguntas restantes aquí
        };
        
        boolean[] respuestas = {
            true, // ¿Rusia es el pais mas grande del mundo?
            true, // ¿El agua hierve a 100 grados Celsius?
            false, // ¿China es el pasia mas pequeño del mundo?
            false, // ¿La Tierra es plana?
            false, // ¿la isla los roques hace parte de Aruba?
            true, //  El Pasaje de Drake, conocido también como el Mar de Hoces, es el lugar más peligroso y hostil de todos los océanos del mundo
            true, // Chris Cerulli es un conocido cantante 
            true, // La banda The Killers es una banda de rock
            false, // Jack el destripador es americano ?
            false, // Hel en una sa India ?
        };
        
        int puntos = 0; // Variable para llevar el puntaje del jugador
        
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
            System.out.print("Ingresa tu respuesta (V/F): ");
            String respuestaUsuario = scanner.nextLine();
            
            boolean respuestaCorrecta = respuestaUsuario.equalsIgnoreCase("V");
            
            if (respuestaCorrecta == respuestas[i]) {
                System.out.println("¡Respuesta correcta!");
                puntos++;
            } else {
                System.out.println("Respuesta incorrecta.");
            }
            
            System.out.println();
        }
        
        System.out.println("Fin del juego. Puntos obtenidos: " + puntos);
        
        scanner.close();
    }
}
