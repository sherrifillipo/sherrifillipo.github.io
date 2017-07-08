/**
 * Created by briansokas on 6/27/17.
 */

import java.util.Scanner;

public class sherriMain {

    public static void main(String[] args) {

        String fn = "index.html";
        FileHandler fh = new FileHandler();
        fh.setFileName(fn);

        System.out.println(fh.getFileName());
    }

}
