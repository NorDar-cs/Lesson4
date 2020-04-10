package Pac1;

import java.util.Scanner;

//Написать программу, отображающую статистику по осадкам
//        за N дней. N вводится пользователем.
//            Пользователь также должен ввести N целых чисел, обозначающих
//        величину осадков в день.
//            Программа должна выводить:
//        a. Количество дней
//        b. Сумму осадков за этот период
//        c. Среднее количество осадков за этот период
//        d. Максимальное количество дневных осадков за этот период
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней (не более 100): ");
        int daysUser = scanner.nextInt();
        int allRains = 0;
        int maxRains = 0;
        double average;
        int days = daysUser;
        while (days % 100 > 0) {
            System.out.println("Введите количество осадков: ");
            int rains = scanner.nextInt();
            if (rains > maxRains){
                maxRains = rains;
            }
            allRains += rains;
            days --;
        }
         average = allRains / daysUser;

        System.out.println(Result(daysUser, average, allRains, maxRains));
    }
    public static String Result (int daysUser, double average, int allRains, int maxRains){
        return "Количество дней - " + daysUser +"; " + "Сумма осадков за этот период - " + allRains +"; " + "Среднее количество осадков за этот период " + average + "; " + "Максимальное количество осадков - " + maxRains + "." ;
    }
}

