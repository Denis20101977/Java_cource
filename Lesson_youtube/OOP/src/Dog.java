package OOP.src;

public class Dog {
    String name;
    String poroda;
    double weight;
    int speed;

    String getInfo()    {
        return "Name: " + name + " Poroda: " + poroda + " Weight: " + weight;
    }
    void run(){
        for(int i = 0; i < speed; i++){
            System.out.println("Бегу");
        }
    }
    }

