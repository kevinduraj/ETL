package random_string;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        
        //large_string();
        maximum_memory();
    }  

    private static void large_string() {
        LargeString lstring = new LargeString();
        lstring.plainString();
        lstring.plainStringBuilder();
    }
    
    private static void maximum_memory() {
        List<String> list = new ArrayList();
        RandomString str = new RandomString(256);

        for (int i = 0; i < 8_500_000; i++) {
            
            String str2 = str.nextString();            
            list.add(str2);
            
            if((i%10000) == 0)  System.out.println(i + " " + str2);
        }
    }  
}
