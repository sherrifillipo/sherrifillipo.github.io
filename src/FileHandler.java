import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by briansokas on 6/30/17.
 */
public class FileHandler {

    private String filename;
    private String[] content;
    private File local;


    /**
     * Constructor for the FileHandler, takes no arguments
     */
    public FileHandler(){}

    /**
     * Constructor for the FileHandler
     * Constructor takes a single String argument for the file name and automatically executes
     * @param filename
     */
    public FileHandler(String filename){
        this.filename = filename;
        parseXMLtoHTML();
    }

    /**
     * Checks the file for appropriate formatting
     * @return non-null Exception if an error is encountered during parsing
     */
    public Exception parseXMLtoHTML(){

        local = new File(filename);
        Scanner readFile;

        try{
            readFile = new Scanner(local);
        } catch(FileNotFoundException fnfe){
            System.out.println("Provided filename does not exist.");
            return fnfe;
        } catch(Exception exc){
            System.out.println("Encountered an unexpected exception.");
            return exc;
        }

        this.content = readLines(readFile);

        return null;

    }

    /**
     * Counts the number of lines in the HTML file
     * @param using Scanner object with a File already entered as the readable object
     * @return int value for the number of lines in the file
     */
    public int countLines(Scanner using){

        if (using == null) {
            return 0;
        }

        int lineCount = 0;

        while(using.hasNextLine()){
            lineCount++;
        }

        return lineCount;
    }

    /**
     * Returns the parsed contents of the
     * @return String single String content of the parsed file
     */
    public String[] readLines(Scanner using){

        String[] txt = new String[countLines(using)];
        int pos = 0;

        while(using.hasNext()){
            txt[pos] = using.nextLine();
            pos++;
        }

        return txt;

    }

    public String[] getContent(){
        return content;
    }




}
