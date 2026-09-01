package ejercicios;

import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------calculadora----------");
        System.out.print("Primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Operación (+, -, *, /): ");
        String operacion = scanner.next();
 
        double resultado;
 
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    scanner.close();
                    return;
                    
                }
                break;
            default:
                System.out.println("Operación no válida.");
                scanner.close();
                return;
        }
 
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}

