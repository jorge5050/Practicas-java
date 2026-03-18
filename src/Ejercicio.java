public class Ejercicio {
    //psvm
    public static void main(String[] args) {
        System.out.println("*** Reservacion Hotel ***");
        var nombreCliente = "Pedro";
        var diasSemana = 5;
        var tarifaDiaria = 30000;
        var vistaAlMar = false;

        System.out.println("Nombre Cliente = " + nombreCliente);
        System.out.println("Dias de la Semana = " + diasSemana);
        System.out.println("Tarifa Diaria = " + tarifaDiaria);
        System.out.println("Con vista al Mar = " + vistaAlMar);


        System.out.println();
        System.out.println("*** Nuevos Datos ***");
        nombreCliente = "Pedro Restrepo";
        diasSemana = 7;
        tarifaDiaria = 35000;
        vistaAlMar = true;
        System.out.println("nombre del Cliente = " + nombreCliente);
        System.out.println("Dias de la Semana = " + diasSemana);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("Con vista al Mar = " + vistaAlMar);
    }
}
