import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
         var consola = new Scanner(System.in);
        System.out.print("Cuantas calificaciones desea agregar? ");
        var totalCalificaciones = Integer.parseInt(consola.nextLine());
         // Creacion de manera dinamica del arreglo
         var calificaciones = new int[totalCalificaciones];

         // recorre el arregalo
        for (var i=0; i < totalCalificaciones; i++){
            System.out.print("Calificaciones [" + i + "] = " );
            calificaciones[i] = Integer.parseInt(consola.nextLine());

        }
        // Obtener promedio de las calificaciones
        var sumaCalificaiones = 0;


        //Imprimir los valores
        for (var i=0; i< totalCalificaciones; i++){
            //sumaCalificaciones = sumaCalificaciones + calificaciones[i]
            sumaCalificaiones += calificaciones[i];
        }

        var promedio = sumaCalificaiones / totalCalificaciones;
        System.out.println("\nPromedio de las Calificaciones: " + promedio);


    }
}
