package alfa;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.StringUtils;
/*
https://commons.apache.org/proper/commons-lang/javadocs/api-2.6/org/apache/commons/lang/StringUtils.html
*/

public class Implode {

    /*--------------------------------------------------------------------------------------------*/
    public void glue() {
        
        List selectItems = new ArrayList<String>();
        final List selectItems1 = selectItems;
        selectItems1.add("one");
        selectItems1.add("two");
        selectItems1.add("three");

        String selectClause;
        selectClause = StringUtils.join(selectItems1.toArray(), ',');
        System.out.println("Select clause: " + selectClause);
    }
    /*--------------------------------------------------------------------------------------------*/
}
