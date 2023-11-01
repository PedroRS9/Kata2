package software.ulpgc.kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class TsvFileIrisLoader implements IrisLoader{
    private File file;

    public TsvFileIrisLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Iris> load() {
        try {
            return load(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Iris> load(FileReader fileReader) {
        return load(new BufferedReader(fileReader));
    }

    private List<Iris> load(BufferedReader bufferedReader) {
        return bufferedReader.lines().skip(1)
                .map(this::toIris)
                .collect(Collectors.toList());
    }

    private Iris toIris(String s) {
        return toIris(s.split("\t"));
    }

    private Iris toIris(String[] split) {
        return new Iris(
          Integer.parseInt(split[0]),
          Double.parseDouble(split[1]),
          Double.parseDouble(split[2]),
          Double.parseDouble(split[3]),
          Double.parseDouble(split[4]),
          split[5]
        );
    }
}
