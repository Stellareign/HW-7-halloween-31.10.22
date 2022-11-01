public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 7 - циклы, часть 3 - задача 1, накопления");
        int savingMonth = 29_000;
        int saving = 0;
        for (int i = 1; i <= 12; i++) {
        saving = savingMonth + saving;
            System.out.print("Месяц " + i + " - сумма накоплений равна " + saving + ". ");
        }
        System.out.println("" +
                ""+"" +
                "");
        System.out.println("Домашка 7, часть 3, задача 2, накопления с процентами");
        int deposit = 29_000;
        double saving2 = 0;
        double percentMonth = 1.01;
        for (int i = 1; i <= 12; i++) {
            saving2 = deposit + saving2*percentMonth;
            System.out.print("Месяц " + i + " - сумма накоплений равна " + saving2 + ". ");
        }
    }
}

