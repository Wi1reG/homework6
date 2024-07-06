//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int money = 0;
        int month = 0;
        while (money < 2459000) {
            money += 15000;
            month++;
        }
        System.out.println(month);

        //2 задание

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        int g = 10;
        for (; g > 0; g--) {
            System.out.print(g + " ");
        }

        //3 задание

        System.out.println();

        int country = 12000000;
        int year = 0;
        while (year < 10) {
            int birthrate = (country / 1000) * 17;
            int death = (country / 1000) * 8;
            country = country + birthrate - death;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + country);
        }

        //4 задание

        double sum = 15000;
        int month2 = 0;
        while (sum < 12000000) {
            sum = sum + sum * 0.07;
            month2++;
            System.out.printf("Месяц %d, сумма накоплений равна - %,.2f%n ", month2, sum);
        }

        //5 задание

        double sum1 = 15000;
        int month3 = 0;
        while (month3 <= 24) {
            sum1 = sum1 + sum1 * 0.07;
            month3++;
            if (month3 % 6 == 0 ) {
                System.out.printf("Месяц %d, сумма накоплений равна - %,.2f%n ", month3, sum1);
            }
        }

        //6 задание

        double sum2 = 15000;
        int month4 = 0;
        while (month4 < 108) {
            sum2 = sum2 + sum2 * 0.07;
            month4++;
            if (month4 % 6 == 0 ) {
                System.out.printf("Месяц %d, сумма накоплений равна - %,.2f%n ", month4, sum2);
            }
        }

        //7 задание

        int friday = 5;
        int day = 31;
        while (friday < day) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }

        //8 задание

        int comet = 2024;
        int nullYear = 0;
        int cometBefore = comet - 200;
        int cometAfter = comet + 100;
        for (; nullYear < cometAfter; nullYear = nullYear + 79) {
            if (cometBefore < nullYear) {
                System.out.println(nullYear);
            }
        }

    }
}
