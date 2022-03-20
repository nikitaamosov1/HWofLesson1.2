package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1:
        byte one = 100;
        short two = 1000;
        int three = 100000;
        long four = 1000000000L;
        float five = 3.14f;
        double six = 3.14159265358979323846;
        char seven = 1993;
        boolean eight = one < 100;
        // Задание 2:
        double boxer1 = 72.2;
        double boxer2 = 82.7;
        double totalWeight = boxer1 + boxer2;
        double weightDiff = boxer2 - boxer1;
        System.out.println("Общий вес боксеров составляет " + totalWeight + " кг.");
        System.out.println( "Разница в весе составляет " + weightDiff + " кг.");
        // Задание 3:
        double bananas = 80;
        double milk = 105;
        double iceCream = 100;
        double eggs = 70;
        double breakfast = (bananas*5) + (milk*2) + (iceCream*2) + (eggs*4);
        double breakfastKg = breakfast/1000;
        System.out.println("Общий вес завтрака спортсмена составляет " + breakfastKg + " кг.");
        // Задание 4:
        int excessWeight = 7;
        float weightLossMin = 0.250f;
        float weightLossMax = 0.500f;
        float pessimisticPrediction = excessWeight/weightLossMin;
        float optimisticPrediction = excessWeight/weightLossMax;
        double expectedPrediction = excessWeight/((weightLossMax + weightLossMin)/2);
        System.out.println("Самым пессимситичным прогнозом похудения спортсмена, явялется окно в " + pessimisticPrediction + " дн.");
        System.out.println("Самым оптимистичным прогнозом похудения спортсмена, является окно в " + optimisticPrediction + " дн.");
        System.out.println("Таким образом, ожидаемый средний прогноз похудения спортсмена составляет " + expectedPrediction + " дн.");
        // Задание 5:
        int mashasSalary = 67760;
        int denisSalary = 83690;
        int kristinasSalary = 76230;
        float salaryIncrease = 1.10f;
        float newSalaryMasha = mashasSalary*salaryIncrease;
        float newSalaryDenis = denisSalary*salaryIncrease;
        float newSalaryKristina = kristinasSalary*salaryIncrease;
        float yearSalaryDiffMasha = newSalaryMasha*12 - mashasSalary*12;
        float yearSalaryDiffDenis = newSalaryDenis*12 - denisSalary*12;
        float yearSalaryDiffKristina = newSalaryKristina*12 - kristinasSalary*12;
        System.out.println("Месячный доход Маши после прибавки теперь " + newSalaryMasha + " руб," + " в следствии чего годовой доход Маши вырос на " + yearSalaryDiffMasha + " руб.");
        System.out.println("Месячный доход Дениса после прибавки теперь " + newSalaryDenis + " руб," + " в следствии чего годовой доход Дениса вырос на " + yearSalaryDiffDenis + " руб.");
        System.out.println("Месячный доход Кристины после прибавки теперь " + newSalaryKristina + " руб," + " в следствии чего годовой доход Кристины вырос на " + yearSalaryDiffKristina + " руб.");

        // Задание выполнено!


    }
}
