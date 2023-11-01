package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeriesIrisProcessor implements IrisProcessor{
    @Override
    public Map<String, Integer> process(List<Iris> irises) {
        Map<String, Integer> histogram = new HashMap<String, Integer>();
        for(Iris iris : irises){
            String specie = iris.getSpecies();
            histogram.put(specie, histogram.getOrDefault(specie, 0)+1);
        }
        return histogram;
    }
}
