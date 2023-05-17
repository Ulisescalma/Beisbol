
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Usuario
{
    // instance variables - replace the example below with your own
    private String nombre;
    private double precioTotal;
    private double promedioCompra;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getPromedioCompra() {
        return promedioCompra;
    }

    public void elegirGuante(int opcion) {
        switch (opcion) {
            case 1:
                precioTotal += 70;
                System.out.println("Has seleccionado Bate de beisbol.");
                break;
            case 2:
                precioTotal += 40;
                System.out.println("Has seleccionado Guante de beisbol.");
                break;
            case 3:
                precioTotal += 20;
                System.out.println("Has seleccionado los Zapatos de beisbol.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    public void calcularTotal() {
        // El método ya se encarga de calcular el total al elegir los guantes
    }

    public void calcularPromedio() {
        promedioCompra = precioTotal / 2;
    }
}

