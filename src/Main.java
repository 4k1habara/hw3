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
        System.out.println(a1 + b1);
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
    }
}