import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Baseball {
    private String nombre;
    private double precio;

    public Baseball(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

public class beisbol {
    public static void main(String[] args) {
        List<Baseball> listaBaseball = new ArrayList<>();
        listaBaseball.add(new Baseball("Bate de béisbol", 50));
        listaBaseball.add(new Baseball("Guantes de béisbol", 40));
        listaBaseball.add(new Baseball("Pelota de béisbol", 20));
        listaBaseball.add(new Baseball("Casco de béisbol", 30));
        listaBaseball.add(new Baseball("Zapatillas de béisbol", 60));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del comprador: ");
        String nombreComprador = scanner.nextLine();

        System.out.println("Seleccione los artículos de béisbol (separados por coma):");
        for (int i = 0; i < listaBaseball.size(); i++) {
            System.out.println((i + 1) + ". " + listaBaseball.get(i).getNombre() + " - $" + listaBaseball.get(i).getPrecio());
        }
        System.out.println("Ingrese los números de los artículos seleccionados:");

        String[] numerosSeleccionados = scanner.nextLine().split(",");
        double total = 0;
        List<String> productosElegidos = new ArrayList<>();

        for (String numero : numerosSeleccionados) {
            int index = Integer.parseInt(numero.trim()) - 1;
            if (index >= 0 && index < listaBaseball.size()) {
                Baseball articuloSeleccionado = listaBaseball.get(index);
                total += articuloSeleccionado.getPrecio();
                productosElegidos.add(articuloSeleccionado.getNombre());
            }
        }

        System.out.println("==================================================");
        
        System.out.println("Nombre del comprador " + nombreComprador );
        System.out.println("Detalle de articulos" +  productosElegidos);
        System.out.println("Total a pagar " + ": $" + total);
        
        System.out.println("==================================================");
    }
}
