import java.util.Scanner;

public class IngresoArreglos {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Proporcionar el largo de arreglo : ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        // Creamos de manera dinamica el arreglo
        var enteros = new int[largoArreglo];
        //solicitar los valores
        for(var i=0; i < largoArreglo; i++){
            System.out.print("Proporcionar entero [" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        //Imprimir los valores arreglos
        System.out.println("\nImpresion de arreglo");
        for(var i=0; i < largoArreglo; i++ )
            System.out.println("enteros[" + i + "] = " + enteros[i]);

    }


}
