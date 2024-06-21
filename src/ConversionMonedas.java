import java.util.Scanner;

public class ConversionMonedas {

    //creamos un método para realizar la conversión de monedas
    public static void conversion (String moneda1, String moneda2) {

        Scanner teclado = new Scanner(System.in); //creamos un nuevo Scanner para la lectura
        BuscaMoneda buscaMoneda = new BuscaMoneda(); //creamos un objeto de la clase BuscaMoneda
        double valor; //almacena el valor que el usuario quiere convertir
        double valorMonedaConvertida;

        Moneda miMoneda = buscaMoneda.buscaMoneda(moneda1, moneda2); //creamos un objeto de Moneda

        System.out.println("\nLa tasa de conversión de esta moneda es: \n" +moneda1+ " = "
                +miMoneda.conversion_rate()+ " " +moneda2);
        System.out.println("Por favor digite la cantidad de " +moneda1 + " que desea convertir:");
        valor = Double.parseDouble(teclado.nextLine()); //casteamos
        valorMonedaConvertida = valor * miMoneda.conversion_rate();
        System.out.println("El valor de " +valor+ " " +moneda1+ " corresponde a =>> " +valorMonedaConvertida+
                " " +miMoneda.target_code());
    }

}
