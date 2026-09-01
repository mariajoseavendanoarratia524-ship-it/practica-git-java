package ejercicios;

import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del estudiante: ");
        String name = scanner.nextLine();
 
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3; // aqui se calcula el promedio de las tres notas, en estadistica lo conocemos como media aritmetica
        String estado = promedio >= 60 ? "Aprobado" : "Reprobado";
 
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Estado: " + estado);
         scanner.close();
    } 
    
}
