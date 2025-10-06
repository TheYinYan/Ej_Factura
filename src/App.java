public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf(ut.WHITE_BOLD+"Rojo Polo Paella Inc.%n%n"+ut.RESET);
        System.out.println("Carretera Muelle 38");
        System.out.println("37531 Ávila, Ávila");

        System.out.printf("%n%n");

        System.out.printf(ut.WHITE_BOLD+"%-33s%-33s%-33s%25s%n"+ut.RESET,"FACTURAR A", "ENVIAR A", "Nº DE FACTURA",ut.RESET+"ES-001");
        System.out.printf("%-33s%-33s%-33s%32s%n","Leda Villareal", "Leda Villareal",ut.WHITE_BOLD+"FECHA"+ut.RESET,"29.01.2019");
        System.out.printf("%-33s%-33s%-33s%32s%n","Virgen Blanca 63", "Cercas Bajas 68",ut.WHITE_BOLD+"Nº DE PEDIDO"+ut.RESET,"1730/2019");
        System.out.printf("%-33s%-33s%-33s%32s%n","08759 Burgos, Burgos", "47300 Cádiz, Cádiz","","");
        System.out.printf("%-33s%-33s%-33s%32s%n%n","", "",ut.WHITE_BOLD+"FECHA VCTO"+ut.RESET,"29.01.2019");

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.printf("%-60s%60s%n","Total Factura","199,65$");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.printf("%n");

        System.out.printf(ut.WHITE_BOLD+"%-30s%-50s%-20s%20s%n"+ut.RESET, "CANT.", "DESCRIPCIÓN", "PRECIO UNITARIO", "IMPORTE");
        System.out.printf("%-30s%-50s%-20s%20s%n", "1", "Talla pequeña traje de luces en rojo", "100,000", "100,000");

    }
}
