import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean reiniciar = true;
        Scanner scanner;
        ListaPaises listadoVisible = new ListaPaises() ;


        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("*************************************");
        System.out.println("A continuacion encontrara las monedas disponibles para la conversion");
        listadoVisible.mostrarListaPaises();





        do {
            int decision1 = 0;

            do {
                System.out.println("Ingrese el codigo de la moneda que desea cambiar : ");
                scanner = new Scanner(System.in);
                String moneda1 = scanner.nextLine();

                System.out.println("Ingrese el codigo de la moneda que desea obtener : ");
                Scanner scanner1 = new Scanner(System.in);
                String moneda2 = scanner1.nextLine();

                //Solicitar la conexion a la API
                URL url = new URL("https://v6.exchangerate-api.com/v6/c85173b7f972e815040abc85/pair/" + moneda1 + "/" + moneda2);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                // Obtener el cuerpo de la respuesta
                InputStream inputStream = conn.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Cerrar la conexión
                conn.disconnect();

                // El contenido del cuerpo de la respuesta está en response
                String responseBody = response.toString();

                JsonParser parser = new JsonParser();
                Gson gson = new GsonBuilder().setPrettyPrinting().create();

                JsonObject jsonObject = parser.parse(responseBody).getAsJsonObject();
                double tipoDeCambio = jsonObject.get("conversion_rate").getAsDouble();

                // Pedir que ingrese el monto de la moneda a cambiar
                System.out.println("Ingrese el monto que desea cambiar : ");
                Scanner scanner6 = new Scanner(System.in);
                double montoACambiar = scanner6.nextDouble();

                // Realizar la conversión
                double conversion = montoACambiar * tipoDeCambio;

                System.out.println("Si ud cambia " + montoACambiar + moneda1 + ", obtendra : " + conversion + " " + moneda2);

                System.out.println("Si desea seguir cambiando monedas, ingrese 1. Si desea salir, presione 9");
                decision1 = scanner.nextInt();

            } while (decision1 != 9);

            System.out.println("Si desea continuar realizando cambios de moneda, ingrese 1. De lo contrario, presione 9.");
            int continuar = scanner.nextInt();
            if (continuar != 1) {
                reiniciar = false;
            }

        } while (reiniciar);
    }
}