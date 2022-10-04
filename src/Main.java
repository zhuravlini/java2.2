import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int a = 100; //начальная сумма
        int b = 1576; //сумма пополнения
        int bonus; // количество бонусов за пополнение
        int amount; // общая сумма с пополнением и бонусами
        if (b < 1000) {
            bonus = 0;
        } else {bonus = b/100;}
        if (b > 1000) {
            amount = a + b + bonus;
        } else {
            amount = a + b;
        }
        System.out.println("Вам начислено " + bonus + " бонусных рублей");
        System.out.println("Итого на счете " + amount + " рублей");

    }
}

