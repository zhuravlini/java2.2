import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int accountAmount = 100; //начальная сумма
        int topUpAmount = 1576; //сумма пополнения
        int bonus; // количество бонусов за пополнение
        int amount; // общая сумма с пополнением и бонусами
        if (topUpAmount < 1000) {
            bonus = 0;
        } else {
            bonus = topUpAmount / 100;
        }
        if (topUpAmount > 1000) {
            amount = accountAmount + topUpAmount + bonus;
        } else {
            amount = accountAmount + topUpAmount;
        }
        System.out.println("Вам начислено " + bonus + " бонусных рублей");
        System.out.println("Итого на счете " + amount + " рублей");

    }
}

