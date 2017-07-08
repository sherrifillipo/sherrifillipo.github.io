import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by briansokas on 7/8/17.
 */
public class FileHandlerTest {

    public void SetFilenameTest() throws IOException {

        FileHandler fh = new FileHandler();
        String testFile = "NameTest1";

        fh.setFileName(testFile);

        System.out.println("Testing");
        assertEquals(testFile, fh.getFileName());
    }

}