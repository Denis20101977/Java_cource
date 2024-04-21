public class Dog {
    String name;
    String poroda;
    double weight;
    int speed;

    String getName() {
        return "Name: " + name + " Poroda: " + poroda + " Wwight: " + weight;
    }

    void run()  {
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу");
        }

    }

//    String getSpeed()   {
//        return "Я бегу со скоростью: " + speed + " км/час";
//    }
}
