public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.newEmployee(new Employee("Карасик В.В.", 1, 26500));
        employeeBook.newEmployee(new Employee("Черняев В. А.", 2, 29000));
        employeeBook.newEmployee(new Employee("Шмелев А. Д.", 3, 27000));
        employeeBook.newEmployee(new Employee("Назаров А. П.", 4, 28959));
        employeeBook.newEmployee(new Employee("Котова С. Г.", 5, 26232));
        employeeBook.newEmployee(new Employee("Сомова М. М.", 1, 28245));
        employeeBook.newEmployee(new Employee("Уткин М. А.", 2, 29402));
        employeeBook.newEmployee(new Employee("Широкова А. Д.", 3, 31500));
        employeeBook.newEmployee(new Employee("Воронцов Я. К.", 4, 30546));
        employeeBook.newEmployee(new Employee("Белоусов О. Я.", 5, 36240));
        employeeBook.printAllDataEmployees();
        System.out.println("Cумма затрат на зарплаты за месяц: " +employeeBook.sumSalary() + " рублей.");
        System.out.println(employeeBook.minSalary());
        System.out.println(employeeBook.maxSalary());
        System.out.println(employeeBook.averageSalaryEmployees());
        System.out.println(employeeBook.printAllNameOfEmployees());
        employeeBook.salaryIndexingByRate(7);
        employeeBook.printAllDataEmployees();
        System.out.println(employeeBook.minSalaryInDepartment(1));
        System.out.println(employeeBook.maxSalaryInDepartment(1));
        System.out.println(employeeBook.sumSalaryInDepartment(1));
        System.out.println(employeeBook.averageSalaryInDepartment(1));
        employeeBook.salaryIndexingByRateInDepartment(1, 13);
        employeeBook.printAllDataInDepartment(1);
        employeeBook.filterByLessSalaryLevel(27000);
        System.out.println();
        employeeBook.filterByAboveSalaryLevel(27500);
        System.out.println();
        employeeBook.deleteEmployee(9);
        employeeBook.printAllDataEmployees();



    }


}









