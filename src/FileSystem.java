import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Flarebrass on 11/12/2016.
 */
public class FileSystem {
    public static ArrayList FileSystem = new ArrayList();
    public static int driveCount = 0;
    public static int folderCount = 0;

    public static void main(String[] args){

        System.out.println("Please select an option");
        create("drive", "drive","");
        create("drive", "drive","");
        create("folder", "folder", "\\drive0");
        create("folder", "folder", "\\drive0");

        Iterator<Drive> it = FileSystem.iterator();

        while (it.hasNext()){
            Drive dr = it.next();
            System.out.println(dr.getName());
            System.out.println(dr.getPath());
        }
    }
    public static void create(String type, String name, String path ){
        switch(type){
            case "drive":
                Drive drive = new Drive(type, name + driveCount, path + name + driveCount);
                driveCount++;
                Iterator<Drive> iter = FileSystem.iterator();
                while (iter.hasNext()) {
                    Drive dr = iter.next();
                    if (dr.getName().equals(drive.getName())) {
                        throw new IllegalArgumentException("Drive already exists. Please try again with a different name.");
                    }
                }
                FileSystem.add(drive);
                break;
            case "folder":
                ArrayList parent;
                Iterator<Drive> driveIt = FileSystem.iterator();
                while (driveIt.hasNext()){
                    Drive dr = driveIt.next();
                    if(dr.getPath().equals(path)){
                        parent = dr.getList();
                    }
                    
                }

        }
    }
}
