package software.ulpgc.kata2;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        IrisLoader loader = new TsvFileIrisLoader(new File("Iris.tsv"));
        List<Iris> irises = loader.load();
        SeriesIrisProcessor processor = new SeriesIrisProcessor();
        Map<String, Integer> histogram = processor.process(irises);
        for(String key : histogram.keySet()){
            System.out.println(key + " " + histogram.get(key));
        }
    }
}
