package software.ulpgc.kata2;

public class Iris {
    private final int id;
    private final double sepalLengthCm;
    private final double sepalWidthCm;
    private final double petalLengthCm;
    private final double petalWidthCm;
    private final String species;

    public Iris(int id, double sepalLengthCm, double sepalWidthCm, double petalLengthCm, double petalWidthCm, String species) {
        this.id = id;
        this.sepalLengthCm = sepalLengthCm;
        this.sepalWidthCm = sepalWidthCm;
        this.petalLengthCm = petalLengthCm;
        this.petalWidthCm = petalWidthCm;
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public double getSepalLengthCm() {
        return sepalLengthCm;
    }

    public double getSepalWidthCm() {
        return sepalWidthCm;
    }

    public double getPetalLengthCm() {
        return petalLengthCm;
    }

    public double getPetalWidthCm() {
        return petalWidthCm;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Iris{" +
                "id=" + id +
                ", sepalLengthCm=" + sepalLengthCm +
                ", sepalWidthCm=" + sepalWidthCm +
                ", petalLengthCm=" + petalLengthCm +
                ", petalWidthCm=" + petalWidthCm +
                ", species='" + species + '\'' +
                '}';
    }
}
