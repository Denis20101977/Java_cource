package Lessons;
// todo это операторы!!!
public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i+1);
            i++;
        }
        System.out.println("Вы вышли из цикла!");
    }
}