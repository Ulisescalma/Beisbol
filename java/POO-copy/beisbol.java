
/**

 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class beisbol
{
    // instance variables - replace the example below with your own
     public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.println("Bienvenido al programa de articulos de beisbol.");
        System.out.println("Por favor, ingresa tu nombre:");
        String nombreUsuario = scanner.nextLine();

        // Crear objeto Usuario
        Usuario usuario = new Usuario(nombreUsuario);

        // Mostrar opciones de guantes
        System.out.println("Hola, " + usuario.getNombre() + ". A continuación, elige los articulo de beisbol que deseas:");
        System.out.println("1. Bate de beisbol - Precio: $70");
        System.out.println("2. Guante de beisbol - Precio: $40");
        System.out.println("3. Zapatos de beisbol - Precio: $20");

        // Solicitar el primer tipo de guante
        System.out.println("Ingresa el número correspondiente al articulo que deseas:");
        int opcion1 = scanner.nextInt();
        usuario.elegirGuante(opcion1);

        // Solicitar el segundo tipo de guante
        System.out.println("Ingresa el número correspondiente al segundo articulo que deseas:");
        int opcion2 = scanner.nextInt();
        usuario.elegirGuante(opcion2);

        // Calcular precio total y promedio de compra
        usuario.calcularTotal();
        usuario.calcularPromedio();

        // Mostrar resultados
        System.out.println("el resultado de los articulos es:");
        System.out.println("Precio Total: $" + usuario.getPrecioTotal());
        System.out.println("Promedio de compra: $" + usuario.getPromedioCompra());

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
