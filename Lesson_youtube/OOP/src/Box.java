package OOP.src;

public class Box {
    double lenght;
    double wight;
    double height;




    double getVolume() {
        return lenght * wight * height;

    }
    void showVolume(){
       System.out.println(getVolume());

    }
}
