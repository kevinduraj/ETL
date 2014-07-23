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
        addTree(new File("C:\\Python27"), all);
        
        for( File str :all) {
            System.out.println(str);
        }
        
    }
    /*--------------------------------------------------------------------------------------------*/

    static void addTree(File file, Collection<File> all) {
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                
                //System.out.println("child = " + child.toString());
                all.add(child);
                addTree(child, all);
            }
        }
    }
    /*--------------------------------------------------------------------------------------------*/
}
