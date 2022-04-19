package pacotePrincipal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class main {

    private static HttpURLConnection connection;

    public static void main(String[] args) throws MalformedURLException, IOException {
        Scanner scan = new Scanner(System.in);
        String pesquisa;
        AlbionApiConsult apiAlbion = new AlbionApiConsult();
        do {        
            System.out.println("Digite o quer pesquisar");
            pesquisa = scan.nextLine();
            System.out.println(apiAlbion.searchAlbion(pesquisa));
        } while (pesquisa != "pause");

    }
}
