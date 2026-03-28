import java.util.Scanner;

public class MatrizEntradaDatos {
    public static void main(String[] args) {
        int reglones, columnas;
        var consola = new Scanner(System.in);
        System.out.print("Ingresa los reglones: ");
        reglones = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        //Definir la matriz
        var matriz = new int[reglones][columnas];
        //solicitar valores
        for(var ren=0; ren < reglones; ren++){
            for(var col=0; col < columnas; col++){
                System.out.print("Valor[ "+ ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());

            }
        }

        //Iterar los valores de la matriz
        System.out.println();
        for(var ren=0; ren < reglones; ren++){
            for(var col=0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = "
                + matriz[ren][col]);
            }
        }



    }
}
