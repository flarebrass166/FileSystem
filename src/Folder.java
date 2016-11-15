/**
 * Created by Flarebrass on 11/12/2016.
 */
public class Folder {
    private String type;
    private String name;
    private String path;
    private int size;

    public Folder(String t, String n, String p){
        this.type = t;
        this.name = n;
        this.path = "\\" + p;
    }

    public String getName() {
        return name;
    }
}
