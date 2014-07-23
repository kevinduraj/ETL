package alfa;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    /*--------------------------------------------------------------------------------------------*/
    public static void main(String[] args) throws IOException {

        System.out.println("--- Browse Directory ---");

        Collection<File> all = new ArrayList<File>();
        browseSubDir(new File("C:\\Python27"), ".py", all);

        displayFiles(all);
    }
    /*--------------------------------------------------------------------------------------------*/
    static void browseSubDir(File file, String extension, Collection<File> all) {
        
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {

                if (child.toString().endsWith(extension)) {
                    all.add(child);
                }
                browseSubDir(child, extension, all);
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
    static void displayFiles(Collection<File> all) {
        
        for (File str : all) {
            System.out.println(str);
        }        
    }
    /*--------------------------------------------------------------------------------------------*/    
}
