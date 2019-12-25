package generator;

import lombok.SneakyThrows;

import java.io.FileWriter;

public class JSONWriter {

    @SneakyThrows
    public void write(String value, String path){
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(value);
        fileWriter.close();
    }
}
