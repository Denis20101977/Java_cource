public class Box {
    double lenght;
    double weight;
    double height;

    double getVolume() {
        return lenght * weight * height;
    }

    void showVolume() {
        System.out.println(getVolume());

    }

}
