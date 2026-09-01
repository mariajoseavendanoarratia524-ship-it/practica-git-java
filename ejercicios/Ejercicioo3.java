package ejercicios;

import java.util.Scanner;

public class Ejercicioo3 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        System.out.println("ingrese su nombre: ");
        String name = sc.nextLine();

        System.out.println("ingrese su edad: ");
        int age = sc.nextInt();
        
        System.out.println("Hola "+ name);
        System.out.println("Tienes "+ age +" años");

        sc.close();
    }
    
}
