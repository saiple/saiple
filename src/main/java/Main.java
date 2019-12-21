import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Main {

    public static void main(String[] args) {
        Generator generator = new Generator();
        JSONConverter converter = new JSONConverter();
        JSONWriter writer = new JSONWriter();
        Sample sample = generator.generateRandomSample();
        ObjectNode node = new ObjectMapper().createObjectNode();

        node.putPOJO("validCredentials", converter.convertToJSON(generator.getValidCredential()));
        node.putPOJO("inValidCredentials", converter.convertToJSON(generator.generateRandomCredentials()));
        node.putPOJO("sample", converter.convertToJSON(sample));

        writer.write(node.toString(), "C:\\Users\\razil\\Desktop\\text.txt");

    }

}
