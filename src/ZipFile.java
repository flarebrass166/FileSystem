import java.util.ArrayList;

/**
 * Created by Flarebrass on 11/12/2016.
 */
public class ZipFile {
    private String type;
    private String name;
    private String path;
    private int size;
    private ArrayList contains;


    public ZipFile(String t, String n, String p){
        this.type = t;
        this.name = n;
        this.path = "\\" + p;
        contains = new ArrayList<>();
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

    public ArrayList getList(){
        return contains;
    }
}
