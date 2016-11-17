import java.util.ArrayList;

/**
 * Created by Flarebrass on 11/12/2016.
 */
public class Folder {
    private String type;
    private String name;
    private String path;
    private int size;
    private ArrayList contains;


    public Folder(String t, String n, String p){
        this.type = t;
        this.name = n;
        this.path = p + "\\" + n;
        contains = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList getList(){
        return contains;
    }

    @Override
    public String toString(){
        return ("Folder name: " + name + " Folder Path: " + path);
    }
}
