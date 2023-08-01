import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Фамилия1 Имя1 Отчество1", 1, 25950f);
        employees[1] = new Employee("Фамилия2 Имя2 Отчество2", 2, 26120f);
        employees[2] = new Employee("Фамилия3 Имя3 Отчество3", 3, 27200f);
        employees[3] = new Employee("Фамилия4 Имя4 Отчество4", 4, 26888f);
        employees[4] = new Employee("Фамилия5 Имя5 Отчество5", 5, 29230f);
        employees[5] = new Employee("Фамилия6 Имя6 Отчество6", 1, 26555f);
        employees[6] = new Employee("Фамилия7 Имя7 Отчество7", 2, 28477f);
        employees[7] = new Employee("Фамилия8 Имя8 Отчество8", 3, 29555f);
        employees[8] = new Employee("Фамилия9 Имя9 Отчество9", 4, 26200f);
        employees[9] = new Employee("Фамилия10 Имя10 Отчество10", 5, 27650f);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}