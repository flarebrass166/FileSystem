import java.util.*;

/**
 * Created by Flarebrass on 11/12/2016.
 */
public class Drive {
    private String type;
    private String name;
    private String path;
    private int size;
    private ArrayList contains;


    public Drive(String t, String n, String p){
        this.type = t;
        this.name = n;
        this.path = "\\" + p;
        contains = new ArrayList<>();
    }

    public  String getPath(){
        return path;
    }

    public String getName() {
        return name;
    }

    public ArrayList<File> getList(){
        return contains;
    }

    @Override
    public String toString(){
        return ("Drive name: " + name + " Drive Path: " + path);
    }

}
