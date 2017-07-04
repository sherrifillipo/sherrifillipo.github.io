import java.io.File;
import java.util.Stack;

/**
 * Created by briansokas on 6/30/17.
 */
public class WordpressConverter {

    private String filename;
    private String fileContent;
    private File rawFile;
    private FileHandler fh;
    private Stack<String> tagStack;


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
    public void setFileName(String filename) {
        this.filename = filename;
    }

    /**
     * Abstracts the conversion of a file to a String representation
     * @return
     */
    public boolean fileToString(){

        fh = new FileHandler(this.filename);
        fileContent = fh.getContent();

        return true;

    }

    /**
     * Convert XML uses a string representation of an XML file and converts it into HTML formatted text
     * Conventions from XML --> HTML are as follows:
     * @return true if successfully parsed, false otherwise
     */
    public boolean ConvertXML(){

        tagStack = new Stack<String>();

        if(fileContent == null || fileContent.length() == 0){
            return false;
        }

        for(int c = 0; c < fileContent.length(); c++){



        }

        int posStart = 0;
        int posEnd = 0;
        String subtag;

        while(posStart < fileContent.length()){

            //Start by finding the start and end positions of the tag
            if(fileContent.charAt(posStart) == '<'){
                //Need to find the end of the tag
                posStart = posEnd++;

                while(fileContent.charAt(posEnd) != '>'){
                    posEnd++;
                }

            }

            //By now you'll pull out the tag and push it onto the stack
            subtag = fileContent.substring(posStart, posEnd);
            tagStack.push(subtag);


        }
    }
}
