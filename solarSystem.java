public class SolarSystem {
    public static void main(String[] args) {

        Planet mercury = new Planet("Mercury", 1, 57.9, 2439.7, 1407.6);
        Planet venus = new Planet("Venus", 2, 108.2, 6051.8, 5832.5);
        Planet earth = new Planet("Earth", 3, 149.6, 6371.0, 24.0);
        Planet mars = new Planet("Mars", 4, 227.9, 3389.5, 24.6);

        System.out.println(mercury);
        System.out.println(venus);
        System.out.println(earth);
        System.out.println(mars);
    }
}
