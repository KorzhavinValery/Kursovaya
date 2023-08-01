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

        printAllDataEmployees(employees);
        System.out.println("Cумма затрат на зарплаты в месяц составила: " + sumSalary(employees) + " Рублей.");
        System.out.println("Минимальная сумма затрат на зарплаты в месяц составила: " + minSalary(employees) + " Рублей.");
        System.out.println("Максимальная сумма затрат на зарплаты в месяц составила: " + maxSalary(employees) + " Рублей.");
        System.out.println("Средняя зарплата составляет: " + averageSalary(employees) + " Рублей.");
        printAllNameOfEmployees(employees);
    }

    //Получить список всех сотрудников со всеми
    // имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public static void printAllDataEmployees(Employee[] allData) {
        for (Employee employee : allData) {
            System.out.println(employee);
        }
    }

    public static float sumSalary(Employee[] sumSalary) {
        int sumOfSalary = 0;
        for (Employee employee : sumSalary) {
            if (employee != null) {
                sumOfSalary += employee.getSalary();
            }
        }
        return sumOfSalary;
    }

    public static float minSalary(Employee[] minSalary) {

        float minExpenses = minSalary[0].getSalary();

        for (int i = 0; i < minSalary.length; i++) {
            if (minExpenses > minSalary[i].getSalary()) {
                minExpenses = minSalary[i].getSalary();
            }
        }
        return minExpenses;

    }

    public static float maxSalary(Employee[] maxSalary) {
        float maxExpenses = maxSalary[0].getSalary();
        for (int i = 0; i < maxSalary.length; i++) {
            if (maxExpenses < maxSalary[i].getSalary()) {
                maxExpenses = maxSalary[i].getSalary();
            }
        }
        return maxExpenses;
    }
    public static float averageSalary (Employee[] averageSalary) {
        float sumOfSalary = 0;
        int number = 0;
        for (Employee employee : averageSalary) {
            if (employee != null) {
                sumOfSalary += employee.getSalary();
                number++;
            }
        }
        return sumOfSalary/number;
    }
    public static void printAllNameOfEmployees(Employee[] allNames) {
        for (Employee employee : allNames) {
            if (employee != null) {
                System.out.println("ФИО: " + employee.getFullName());
            }
        }
    }
}









