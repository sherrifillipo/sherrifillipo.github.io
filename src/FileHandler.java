import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by briansokas on 6/30/17.
 */
public class FileHandler {

    private String filename;
    private File local;
    private String content;
    private boolean checked;


    /**
     * Constructor for the FileHandler, takes no arguments
     */
    public FileHandler(){
        checked = false;
    }

    /**
     * Constructor for the FileHandler
     * Constructor takes a single String argument for the file name
     * @param filename
     */
    public FileHandler(String filename){
        this.filename = filename;
        checked = false;
        validateFile();
    }

    public boolean validateFile(){

        local = new File(filename);
        Scanner readFile;

        try{
            readFile = new Scanner(local);
        } catch(FileNotFoundException fnfe){
            System.out.println("Provided filename does not exist.");
            return false;
        } catch(Exception exc){
            System.out.println("Encountered an unexpected exception.");
            return false;
        }

        //contentBuff = new StringBuffer();

        while(readFile.hasNextLine()){
            content = content + readFile.nextLine();
            //contentBuff.append(readFile.nextLine());
        }

        checked = true;

        return true;
    }

    /**
     * Returns the parsed contents of the
     * @return String single String content of the parsed file
     */
    public String getContent(){
        return content;
    }




}
