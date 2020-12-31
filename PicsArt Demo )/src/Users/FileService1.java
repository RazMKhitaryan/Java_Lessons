package Users;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class FileService1 {

    public static List<String> read(String path) throws Exception {
        return readAllLines(Paths.get(path));


    }

}
