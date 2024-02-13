public class Main {
    public static void main(String[] args) {
        //Task 1
        int a = 3000;
        byte b = 127;
        short c = 32000;
        long d = 1000L;
        float e = 13.11111111f;
        double f = 0.123456789;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        //Task2
        float a1 = 27.12f;
        long b1 = 987678965549L;
        float c1 = 2.786f;
        int d1 = 569;
        int e1 = -159;
        short f1 = 27897;
        byte g1 = 67;
        //Task 3
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int totalPaper = 480;
        int totalStudents = lP + aS + eA;
        int paperPerStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        //Task 4
        int overallPerf = 16 / 2;
        int time1 = 20;
        int time2 = 24 * 60;
        int time3 = 3 * 24 * 60;
        int time4 = 31 * 24 * 60;
        int perf1 = overallPerf * time1;
        int perf2 = overallPerf * time2;
        int perf3 = overallPerf * time3;
        int perf4 = overallPerf * time4;
        System.out.println("За " + time1 + " минут машина произвела" + perf1 + " штук бутылок");
        System.out.println("За " + time2 + " минут машина произвела" + perf2 + " штук бутылок");
        System.out.println("За " + time3 + " минут машина произвела" + perf3 + " штук бутылок");
        System.out.println("За " + time4 + " минут машина произвела" + perf4 + " штук бутылок");
        //Task 5
        int totalTins = 120;
        int whiteTins = 2;
        int brownTins = 4;
        int classes = totalTins / (whiteTins + brownTins);
        int totalWhiteTins = classes * whiteTins;
        int totalBrownTins = classes * brownTins;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhiteTins + " банок белой краски и " + totalBrownTins + " банок коричневой краски");
        //Task 6
        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int weightInGrams = bananas + milk + iceCream + eggs;
        float weightInKilograms = (float) weightInGrams / 1000;
        System.out.println("Вес данного спортзавтрака составляет " + weightInGrams + " грамм, либо же " + weightInKilograms + " килограмм");
        //Task 7
        int needToLose = 7 * 1000;
        int loseMin = 250;
        int loseMax = 500;
        int daysMin = needToLose / loseMin;
        int daysMax = needToLose / loseMax;
        int loseAverage = (loseMax + loseMin) / 2;
        float daysAverage = (float) needToLose / loseAverage;
        System.out.println("Если спортсмен каждый день будет терять по " + loseMin + " грамм, то ему понадобится " + daysMin + " дней");
        System.out.println("Если спортсмен каждый день будет терять по " + loseMax + " грамм, то ему понадобится " + daysMax + " дней");
        System.out.println("Если спортсмен каждый день будет терять в весе среднее значение, равное " + loseAverage + " грамм, то ему понадобится " + daysAverage + " дней");
        //Task 8
        int mSalary = 67760;
        int dSalary = 83690;
        int kSalary = 76230;
        int mIncreased = mSalary + (mSalary * 10 / 100);
        int mYearDif = mSalary * 10 / 100 * 12;
        System.out.println("Маша теперь получает " + mIncreased + " рублей. Годовой доход вырос на " + mYearDif + " рублей");
        int dIncreased = dSalary + (dSalary * 10 / 100);
        int dYearDif = dSalary * 10 / 100 * 12;
        System.out.println("Денис теперь получает " + dIncreased + " рублей. Годовой доход вырос на " + dYearDif + " рублей");
        int kIncreased = kSalary + (kSalary * 10 / 100);
        int kYearDif = kSalary * 10 / 100 * 12;
        System.out.println("Кристина теперь получает " + kIncreased + " рублей. Годовой доход вырос на " + kYearDif + " рублей");
    }
}