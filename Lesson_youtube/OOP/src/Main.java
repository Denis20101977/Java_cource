package OOP.src;

public class Main {
    public static void main(String[] args) {

//        Box box1 = new Box();
//        box1.height = 10;
//        box1.lenght = 10;
//        box1.wight = 10;
//        Box box2 = new Box();
//        box2.height = 20;
//        box2.lenght = 20;
//        box2.wight = 20;
//
//        double volume = box1.height * box1.lenght * box1.wight;
//        System.out.println(volume);
//        double volume2 = box2.height * box2.lenght * box2.wight;
//        System.out.println(volume2);

        HomoSapiens homosapiens1 = new HomoSapiens();
        homosapiens1.name = "Joe";
        homosapiens1.age = 20;
        homosapiens1.weight = 60;
        HomoSapiens homosapiens2 = new HomoSapiens();
        homosapiens2.name = "Joe";
        homosapiens2.age = 20;
        homosapiens2.weight = 80;
        HomoSapiens homosapiens3 = new HomoSapiens();
        homosapiens3.name = "Joe";
        homosapiens3.age = 20;
        homosapiens3.weight = 100;
        int ages = (homosapiens1.age + homosapiens2.age + homosapiens3.age) / 3;
        System.out.println("Средний возраст всех людей равен: " + ages + " годам!");

    }
}
