package sample;

import java.nio.file.Path;
import java.util.List;

public class GroovyFile {

    private final Path path;
    private final List<String> content;

    public GroovyFile(Path path, List<String> content){
        this.path = path;
        this.content = content;
    }

    public Path getPathToFile(){
        return path;
    }

    public List<String> getContent(){
        return content;
    }
}
