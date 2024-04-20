package Stepik_lessons;

public class ForEach {
    public static void main(String[] args) {
        String[] names = {"Max", "Мах"
        };
        for (String s : names) {
            System.out.println(s);
        }
        for (String name : names) {
            System.out.println(name);

        }
    }
}
