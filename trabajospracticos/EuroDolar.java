package trabajospracticos;

import java.util.Scanner;

/*Conversión de euros a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares. */

public class EuroDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio_euro = 1.20;
    
        System.out.println("Ingrese la cantidad de euros: ");
    
        double euros = scanner.nextDouble();
        double dolares = euros * precio_euro;
    
        System.out.println(euros + " euros es igual a " + dolares + " dolares");

        scanner.close();
    
    }
}
