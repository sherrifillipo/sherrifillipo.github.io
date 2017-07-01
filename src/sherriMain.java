/**
 * Created by briansokas on 6/27/17.
 */

import java.util.Scanner;

public class sherriMain {

    public static void main(String[] args) {

        String fn = "index.html";
        FileHandler fh = new FileHandler(fn);

        System.out.println(fh.getContent());

        /*Scanner in = new Scanner(System.in);

        System.out.println("Please enter the file name: ");
        String response = in.nextLine();

        if (response.equals("")) {
            System.out.println("No file name was entered, please try again.");
        }*/
    }

}
