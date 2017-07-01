import java.io.File;

/**
 * Created by briansokas on 6/30/17.
 */
public class WordpressConverter {

    private String filename;
    private File rawFile;


    /**
     * Constructor for the WordpressConverter class
     * Takes a filename string, which can be set again using the setFile method
     * @param filename
     */
    public WordpressConverter(String filename){

        this.filename = filename;

    }

    /**
     * Constructor for the WordpressConverter class
     * This instance of the constructor does not require an input file name
     * Use
     */
    public WordpressConverter(){}

    /**
     * Sets the file name to be used for parsing and conversion
     * @param filename
     */
    public setFileName(String filename){
        this.filename = filename;
    }
}
