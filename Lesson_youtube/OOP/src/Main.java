public class Main {

    public static void main(String[] args) {
        Chelovek number_1 = new Chelovek();
        number_1.name = "OOO";
        number_1.age = 20;
        number_1.weight = 55.5;
        Chelovek number_2 = new Chelovek();
        number_2.name = "OOO";
        number_2.age = 40;
        number_2.weight = 55.5;
        Chelovek number_3 = new Chelovek();
        number_3.name = "OOO";
        number_3.age = 40;
        number_3.weight = 55.5;
        double volume = (number_1.age + number_2.age + number_3.age) / 3;
        System.out.println(volume);
//        Box box_1 = new Box();
//        box_1.height = 10;
//        box_1.lenght = 10;
//        box_1.weight = 10;
//        double volume = box_1.height * box_1.lenght * box_1.weight;
//        System.out.println(volume);
//        Box box_2 = new Box();
//        box_2.height = 20;
//        box_2.lenght = 20;
//        box_2.weight = 20;
//        double volume_2 = box_2.height * box_2.weight * box_2.height;
//        System.out.println(volume_2);

    }
}
