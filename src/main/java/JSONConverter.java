import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class JSONConverter {

    ObjectMapper mapper =  new ObjectMapper();

    @SneakyThrows
    public String convertToJSON(Object value){
        return mapper.writeValueAsString(value);
    }




}
