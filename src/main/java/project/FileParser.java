package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileParser {

    private  Stream<String> readFromFile(Path path){
        Stream<String> numbers = null;
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            numbers = bufferedReader.lines();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public String numberDocumentation(String StringOfPrefix, Path path){
        long sum =0;
        Map<String, Long> numberGrouping = readFromFile(path).collect(
                Collectors.groupingBy(x -> x.substring(0, 4), Collectors.counting())
        );
        for (Map.Entry<String, Long> pair : numberGrouping.entrySet()) {
            if (StringOfPrefix.contains(pair.getKey())){
                sum += pair.getValue();
                System.out.println(pair.getKey() + "         " +  pair.getValue());
            }
        }
        System.out.println("TOTAL:      " + sum);
        return String.valueOf(sum);
    }
}
