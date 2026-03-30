import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args){
        //Suma Diagonal de una matriz
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el numero de fila: ");
        var fila = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el numero de columnas: ");
        var columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[fila][columnas];
        //solicita valores
        for(var fil=0; fil < fila; fil++){
            for(var col=0; col < columnas; col++){
                System.out.print("valor [" + fil + "][ " + col + "] = ");
                matriz[fil][col]= Integer.parseInt(consola.nextLine());
            }
        }

       // Suma de la diagonal
        var sumaDiagonal=0;
        for(var fil=0; fil < fila; fil++) {
            for (var col = 0; col < columnas; col++) {
                if (fil == col)
                    sumaDiagonal += matriz[fil][col];
            }
        }

        System.out.println("Suma Diagonal de la matriz: " + sumaDiagonal);

    }
}
