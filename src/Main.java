public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.print(" ФИО сотрудника - " + fullName);

        // Task 2
        System.out.println("Task 2");
        String fullName2 = "Ivanov Ivan Ivanovich";
        String fullNameUpperCase = fullName2.toUpperCase();
        System.out.println(" Данные ФИО сотрудника для заполнения отчета - " + fullNameUpperCase);

        // Task 3
        System.out.println("Task 3");
        String fullName3 = " Иванов Семён Семёнович";
        String fullNameReplaced = fullName3.replace("ё" , "е");
        System.out.println(" Данные ФИО сотрудника - " + fullNameReplaced);

    }
}