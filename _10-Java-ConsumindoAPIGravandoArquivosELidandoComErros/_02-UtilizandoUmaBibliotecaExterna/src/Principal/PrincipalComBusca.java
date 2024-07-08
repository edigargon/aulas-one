package Principal;

import Models.Titulo;
import Models.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o filme que gsotaria de buscar: ");
        String busca = scanner.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=7e88ab5d";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);


        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        TituloOMDB meuTituloOmdb = gson.fromJson(json, TituloOMDB.class);
        System.out.println(meuTituloOmdb);
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Titulo convertido: ");
        System.out.println(meuTitulo);


    }
}
