import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
public class GoogleScholarAuthorView {

    public void printCitations(String citations) {
        // Analiza el JSON y conviértelo en un objeto JsonElement
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(citations);

        // Usa Gson para dar formato al JSON y convertirlo en una cadena con formato
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String formattedJson = gson.toJson(element);

        // Imprime el JSON con formato en varias líneas
        System.out.println(formattedJson);
    }

    public String[] getAuthorDetails() {
        Scanner scanner = new Scanner(System.in);
        String[] details = new String[3];

        System.out.print("Ingrese el ID del autor: ");
        details[0] = scanner.nextLine();

        System.out.print("Ingrese su API Key: ");
        details[1] = scanner.nextLine();

        System.out.print("Ingrese el número de resultados deseado: ");
        details[2] = scanner.nextLine();

        return details;
    }
}