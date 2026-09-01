package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese B: ");
        int b = sc.nextInt();
        System.out.print("Ingrese C: ");
        int c = sc.nextInt();
 
        int mayor;
 
        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }
 
        System.out.println("El número mayor es: " + mayor);
        sc.close();
    }
}
    
    

