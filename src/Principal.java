import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        String menu = """
                \n1) Dólar (USD) =>> Peso argentino (ARS)
                2) Peso argentino (ARS) =>> Dólar (USD)
                3) Dólar (USD) =>> Real brasileño (BRL)
                4) Real brasileño (BRL) =>> Dólar (USD)
                5) Dólar (USD) =>> Peso colombiano (C0P)
                6) Peso colombiano (COP) =>> Dólar (USD)
                7) Salir
                
                Elige un opción válida:
                """;

        while (opcion!=7) {
            System.out.println("\n**********************************************************************");
            System.out.println("\nBIENVENIDO/A AL CONVERSOR DE MONEDAS");
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    ConversionMonedas.conversion("USD", "ARS");
                    break;
                case 2:
                    ConversionMonedas.conversion("ARS", "USD");
                    break;
                case 3:
                    ConversionMonedas.conversion("USD", "BRL");
                    break;
                case 4:
                    ConversionMonedas.conversion("BRL", "USD");
                    break;
                case 5:
                    ConversionMonedas.conversion("USD", "COP");
                    break;
                case 6:
                    ConversionMonedas.conversion("COP", "USD");
                    break;
                case 7:
                    System.out.println("Saliendo del programa de conversión de monedas");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente");
                    break;
            }

        }
    }
}
