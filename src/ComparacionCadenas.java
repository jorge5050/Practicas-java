public class ComparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // Comparacion de cadenas (==) comparan la referencia
        System.out.println("cadena1 es igual en referencia a cadena2 ");
        System.out.println(cadena1 == cadena2);
        // compararamos cadena1 con cadena3 (referencias)
        System.out.print("cadeana1 es igual en referencia a cadena3 ");
        System.out.print(cadena1 == cadena3);

        // comparar contenido usaremos el metodo equals
        System.out.print("Cadena1 es igual en contenido a cadena3: ");
        System.out.print(cadena1.equals(cadena3));
    }
}
