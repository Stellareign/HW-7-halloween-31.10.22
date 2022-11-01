public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 7 - циклы, часть 3 - задача 1, накопления");
        int savingMonth = 29_000;
        int saving = 0;
        for (int i = 1; i <= 12; i++) {
        saving = savingMonth + saving;
            System.out.print("Месяц " + i + " - сумма накоплений равна " + saving + ". ");
        }
    }
}

