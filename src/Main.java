public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println(" _____ Задача 1 _____");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.printf("Ф. И. О. сотрудника — %s%n", fullName);

        // Task 2
        System.out.println(" _____ Задача 2 _____");
        String fullNameUpper = fullName.toUpperCase();
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s%n", fullNameUpper);

        // Task 3
        System.out.println(" _____ Задача 3 _____");
        fullName = "Иванов Семён Семёнович";
        String nameForSystem = fullName.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника — %s%n", nameForSystem);
    }
}