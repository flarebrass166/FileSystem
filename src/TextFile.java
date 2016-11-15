/**
 * Created by Matthew Langford on 11/12/2016.
 */
public class TextFile {
    private String type;
    private String name;
    private String path;
    private int size;
    private String content;

    public TextFile(String t, String n, String p){
        this.type = t;
        this.name = n;
        this.path = p;
        size = content.length();
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public int getSize() {
        return content.length();
    }

    public String getContent() {
        return content;
    }
}
