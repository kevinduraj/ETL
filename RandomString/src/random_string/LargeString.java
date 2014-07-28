package random_string;

public class LargeString {

    /*--------------------------------------------------------------------------------------------*/

    public void plainString() {
        long start = System.currentTimeMillis();
        String res = "";

        for (int i = 0; i < 100_000; i++) {
            res += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("Plain String  100K strings = " + (end - start) + " milliseconds");
    }
    /*--------------------------------------------------------------------------------------------*/

    public void plainStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < 100_000; i++) {
            res.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("String Builder 100K strings = " + (end - start) + " milliseconds");
    }
    /*--------------------------------------------------------------------------------------------*/
}
