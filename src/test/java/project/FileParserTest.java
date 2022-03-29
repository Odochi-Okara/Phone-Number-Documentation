package project;

import java.nio.file.Path;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class FileParserTest {

    private FileParser fileParser = new FileParser();
    private Prefix prefix = new Prefix();
    private Path path = Path.of("src/main/resources/PhoneNumbers.txt");

    @Test
    public void testNumberDocumentation() {
        assertEquals("395095", fileParser.numberDocumentation(prefix.getMtn(),path ));
        assertEquals("263166", fileParser.numberDocumentation(prefix.getAirtel(),path));
        assertEquals("183734", fileParser.numberDocumentation(prefix.getGlobacom(),path));
        assertEquals("131409", fileParser.numberDocumentation(prefix.getNineMobile(),path));
        assertEquals("26596", fileParser.numberDocumentation(prefix.getMtel(),path));
    }
}

