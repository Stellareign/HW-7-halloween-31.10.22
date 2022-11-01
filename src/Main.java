public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 7 - циклы, часть вторая - задача 1, високосный год");
        for (int i = 1904; i <= 2096 && i >= 1904; i = i + 4) {
            {
                System.out.print(i + " год является високосным; ");
            }
        }
        System.out.println("" +
                "");
        System.out.println("Домашка 7 - циклы, часть вторая - задача 2, арифметическая последовательность +7");
        for (int i = 7; i >= 7 && i <= 98; i = i + 7) {
            System.out.print(" " + i + "; ");
        }
        System.out.println("" +
                "");
        System.out.println("Домашка 7 - циклы, часть вторая - задача 3, последовательность i+i");
        for (int i = 1; i >= 1 && i <= 512; i = i + i) {
            System.out.print(" " + i + "; ");
        }
    }
}

