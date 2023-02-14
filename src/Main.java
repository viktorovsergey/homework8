public class Main {
    public static void main(String[] args) {
        System.out.println("---------Задача 1----------");
        task1();
        System.out.println("---------Задача 2----------");
        task2();
        System.out.println("---------Задача 3----------");
        task3();
        System.out.println("---------Задача 4----------");
        task4();
        System.out.println("---------Задача 5----------");
        task5();
        System.out.println("---------Задача 6----------");
        task6();
        System.out.println("---------Задача 7----------");
        task7();
        System.out.println("---------Задача 8---------");
        task8();
    }

    public static void task1() {
        int salary = 15_000;
        int totalMoney = 2_459_000;
        int total = 0;
        int month = 1;
        while (total < totalMoney) {
            total = total + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
            month = month + 1;
        }


    }

    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        i--;
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int totalPopulation = 12_000_000;
        int deathRate = 8;
        int childBirth = 17;
        int year = 1;
        // for (int year = 1; year <= 10; year++) { можно было так сделать на выбор
        while (year <= 10) {
            totalPopulation = totalPopulation + (totalPopulation * childBirth / 1000) - (totalPopulation * deathRate / 1000);
            System.out.println("Год  " + year + " численность населения составляет " + totalPopulation);
            year++;// тогда при цикле for эта строка не нужна
        }
    }

    public static void task4() {
        int percent = 7;
        double totalMoney = 15_000;
        int maxMoney = 12_000_000;
        int month = 1;
        for (; totalMoney <= maxMoney;  month++ ) {
            System.out.printf("Сумма накоплений "+ month + " месяца равна " +"%.2f",totalMoney);
            System.out.println();
            totalMoney = totalMoney + (totalMoney * percent / 100);
        }

    }

    public static void task5() {
        int percent = 7;
        double totalMoney = 15_000;
        int maxMoney = 12_000_000;
        int month = 1;
        for (; totalMoney <= maxMoney; month++ ) {
            totalMoney = totalMoney + (totalMoney * percent / 100);
            if (month % 6 == 0) {
                System.out.printf("Сумма накоплений " + month + " месяца равна " + "%.2f",totalMoney);
                System.out.println();
            }

        }

    }

    public static void task6() {
        int percent = 7;
        double totalMoney = 15_000;
        int depositTime = 9 * 12;
        int mohth = 1;
            for (; mohth <= depositTime;mohth++ ) {
            totalMoney = totalMoney + (totalMoney * percent / 100);
            if (mohth % 6 == 0) {
                System.out.printf("Сумма накоплений " + mohth + " месяца равна " + "%.2f",totalMoney);
                System.out.println();
            }

        }

    }

    public static void task7() {
        int fridey = 1;
        int totalMonthDays = 31;
        for (; fridey <= totalMonthDays; fridey = fridey + 7) {
            System.out.println("Сегодня пятница, " + fridey + " - е число. Необходимо подготовить отчет");

        }
    }

    public static void task8() {
        int lastYear = 2023;
        int cometInterval = 79;
        int yearBefore = 200;
        int yearAfter = 100;
        int year = 0;
        while (year <= lastYear + yearBefore) {
                if (year >= (lastYear - yearBefore) && year <= (lastYear + yearAfter)) {
                System.out.println("Комета пролетала(будет пролетать) " + year );
            }
            year = year + cometInterval;
        }

    }


}