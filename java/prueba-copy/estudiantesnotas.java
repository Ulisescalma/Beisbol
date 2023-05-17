
import java.util.Scanner;
public class estudiantesnotas
{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int numeroEstudiantes;
    EstudiantePOO[] losEstudiantes = new EstudiantePOO[50];
    String identificacion, nombre, curso;
    double nota1,nota2,nota3;
    double promedio = 0;
    System.out.println("Digite el numero de estudiantes" );
    numeroEstudiantes = sc.nextInt();
    for (int i = 0; i<numEst; i++)
    {
        System.out.println("digite la identificacion del estudiante ");
        identificacion = sc.next();
        System.out.println("Digite el nombre del estudiante ");
        nombre = sc.next();
        System.out.println("Digite el curso del estudiante ");
        curso = sc.next();
        System.out.println("Digite la nota uno del estudiante ");
        nota1 = sc.nextdouble();
        System.out.println("Digite la nota dos del estudiante ");
        nota2 = sc.nextdouble();
        System.out.println("Digite la nota tres del estudiante ");
        nota3 = sc.nextdouble();
        EstudiantePOO unEstudiante = new EstudiantePOO();
        unEstudiante.identificacion = identificacion;
        unEstudiante.curso = curso;
        unEstudiante.notauno = nota1;
        unEstudiante.notados = nota2;
        unEstudiante.notatres = nota3;
        losEstudiantes[i] = unEstudiante;
    }
for(int i = 0; i<numeroEstudiantes; i++){
double sum = (losEstudiantes[i].notauno + losEstudiantes[i].notados + losEstudiantes[i].notatres) /3;
promedio = promedio + sum /numeroEstudiantes;
}
    System.out.println("El promedio de notas es: " + promedio);
    
}
        
    }
  
