public class Planet {
    private String name;
    private int sequenceNumber;
    private double distanceFromSun;
    private double radius;
    private double rotationPeriod;

    public Planet(String name, int sequenceNumber, double distanceFromSun, double radius, double rotationPeriod) {
        this.name = name;
        this.sequenceNumber = sequenceNumber;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.rotationPeriod = rotationPeriod;
    }

    public String getName() {
        return name;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", distanceFromSun=" + distanceFromSun + " million km" +
                ", radius=" + radius + " km" +
                ", rotationPeriod=" + rotationPeriod + " hours" +
                '}';
    }
}
