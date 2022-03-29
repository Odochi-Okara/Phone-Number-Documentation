package project;

import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;

public class App {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/PhoneNumbers.txt");
        Prefix prefix = new Prefix();
        FileParser fileParser = new FileParser();

        Instant instant1 = Instant.now();

        System.out.println("=================================");
        System.out.println("mtn" +  "    "+ "NumberCount");
        fileParser.numberDocumentation(prefix.getMtn(), path);

        System.out.println("=================================");
        System.out.println("airtel" +  "    "+ "NumberCount");
        fileParser.numberDocumentation(prefix.getAirtel(), path);


        System.out.println("=================================");
        System.out.println("globacom" +  "   " + "NumberCount");
        fileParser.numberDocumentation(prefix.getGlobacom(), path);

        System.out.println("=================================");
        System.out.println("9Mobile" +  "   " + "NumberCount");
        fileParser.numberDocumentation(prefix.getNineMobile(), path);


        System.out.println("=================================");
        System.out.println("MTEL" +  "   " + "NumberCount");
        fileParser.numberDocumentation(prefix.getMtel(), path);

        System.out.println("=================================");
        Instant instant2 = Instant.now();

        System.out.println("Total execution time: " + Duration.between(instant1, instant2).toString());
    }


}
