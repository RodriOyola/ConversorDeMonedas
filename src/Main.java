import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conversor de moneda");
        System.out.println("*******************************");
        System.out.println("Elija un codigo del pais al que quiera convertir"+ "AED\tUAE Dirham\tUnited Arab Emirates\n" +

        System.out.println("Ingrese el tipo de moneda a cambiar: ");
        Scanner lectura = new Scanner(System.in);
        String monedaElegida = lectura.nextLine();

        System.out.println(monedaElegida);

    }
}
