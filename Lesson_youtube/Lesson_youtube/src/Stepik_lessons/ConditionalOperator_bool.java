package Lesson_youtube.Lesson_youtube.src.Stepik_lessons;

public class ConditionalOperator_bool {
    public static void main(String[] args) {

        int temp = 30;
        boolean hot = temp >= 25;
        boolean cold = temp <= 22;
        int time = 23;
        boolean isNight = time > 22 || time < 6;
        if (hot && !isNight) {
            System.out.println("Кондиционер включен");
      } else if (cold) {
            System.out.println("Кондиционер выключен");
        } else {
            System.out.println("Кондиционер ничего не делает");
        }

    }

}
//        int cash = 10;
//        if (cash >= 10) {
//            System.out.println("Пицца");
//        }
//        if (cash >= 6) {
//            System.out.println("Гамбургер");
//        }
//        if (cash < 6) {
//            System.out.println("Сэндвич");