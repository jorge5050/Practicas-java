import java.util.Scanner;

public class MatrizEntrada {
    public static void main(String[] args) {
        int fila,columna;

        var consola = new Scanner(System.in);
        System.out.print("Ingrese el numero de fila : ");
        fila = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el numero de columna : ");
        columna = Integer.parseInt(consola.nextLine());

        var matriz = new int[fila][columna];
        // solitar los valores
        for(var fil=0; fil < fila; fil++){
            for(var col=0; col < columna; col++){
                System.out.print("valor[ " + fil + "][ " + col + "] = ");
                matriz[fil][col] = Integer.parseInt(consola.nextLine());
            }
        }
         // Itera los valores
        System.out.println();
        for(var fil=0; fil < fila; fil++){
            for(var col=0; col < columna; col++){
                System.out.println("Matriz[ " + fil + "][ " + col + "] = "
                + matriz[fil][col]);
            }
        }

    }
}
