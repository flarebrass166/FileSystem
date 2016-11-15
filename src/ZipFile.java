/**
 * Created by Flarebrass on 11/12/2016.
 */
public class ZipFile {
    private String type;
    private String name;
    private String path;
    private int size;

    public ZipFile(String t, String n, String p){
        this.type = t;
        this.name = n;
        this.path = p;
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
        return 1;
    }
}
