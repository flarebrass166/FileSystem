import java.nio.file.InvalidPathException;
import java.util.Arrays;
import java.util.*;

/**
 * Created by Flarebrass on 11/12/2016.
 */
public class FileSystem {
    public static ArrayList<Drive> FileSystem = new ArrayList<>();
    public static int driveCount = 0;
    public static int folderCount = 0;

    public static void main(String[] args){

        System.out.println("Please select an option");
        create("drive", "drive","");
        create("drive", "drivea","");

        create("folder", "textFile", "\\drive");
        create("folder", "textFile", "\\drivea");
        for (Drive e: FileSystem){
           System.out.println(e.toString());
            for (File d: e.getList()) {
                System.out.println(d.toString());
            }
        }



    }
    /*
    * create method that takes in a type, name, and path as arguments and creates an entity based on the arguments passed.
    */
    public static void create(String type, String name, String path ) {
        switch (type) {
            case "drive":
                Drive drive = new Drive(type, name , path + name );
                for (Drive e : FileSystem) {
                    if (e.getName().equals(name)) {
                        throw new IllegalArgumentException("Drive already exists, please try again with a different name");
                    }
                }
                FileSystem.add(drive);
                driveCount++;
                break;
            case "folder":
                File file = new File(type, name , path + "\\" + name);
                for (Drive e : FileSystem) {
                    if (e.getPath().equals(path)){
                        for(File f: e.getList()){
                            if(f.getName().equals(name)){
                               throw new IllegalArgumentException("File name already exists in this directory, please choose a different name or path");
                            }
                            if(f.getPath().equals(path + "\\" + name)){
                                throw new IllegalArgumentException("Path already exists in this directory, please try again with a different path");
                            }
                        }
                        e.getList().add(file);
                    }
                }
                break;
        }
    }
}

