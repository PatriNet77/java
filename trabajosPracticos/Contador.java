package trabajospracticos;

/*Contador: Se le solicita que guarde un número en un espacio de memoria e
incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
para hacerlo? */

public class Contador {
    public static void main(String[] args) {
        int numero = 0;

        for (int i = 0; i < 20; i++) {
            numero++;
        }
    
    System.out.println("El número incrementado 20 veces es: " + numero);
    
    }

}
