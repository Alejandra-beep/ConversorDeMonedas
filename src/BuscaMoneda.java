import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaMoneda {

    public Moneda buscaMoneda (String moneda1, String moneda2) {

        //Creamos nuestro enlace, donde utilizamos pair al final para agregar los dos valores moneda1 y moneda2
        URI enlaceMonedas = URI.create("https://v6.exchangerate-api.com/v6/4d4520acfd17a0696a724951/pair/" +
                moneda1 + "/" +moneda2);

        //buscamos en el javadoc el httprequest, lo pegamos e importamos
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(enlaceMonedas)
                .build();

        try {
            //buscamos en el javadoc el httpResponse y lo pegamos
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //debemos importar la librería gson que ya hemos descargado
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No pude encontrar esa moneda");
        }
    }
}
