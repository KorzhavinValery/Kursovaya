import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];
    private int account;

    public void newEmployee(Employee employee) {
        if (account >= employees.length) {
            System.out.println("Не удалось добавить сотрудника, места закончились.");
            return;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                account++;
                break;
            }
        }
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getiD() == employeeId) {
                System.arraycopy(employees, i + 1, employees, i, account - i - 1);
                employees[account - 1] = null;
                account--;
                return;
            }

        }
    }
    public void printAllDataEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public float sumSalary() {
        int sumOfSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumOfSalary += employee.getSalary();
            }
        }
        return sumOfSalary;
    }

    public float minSalary() {

        float minExpenses = Integer.MAX_VALUE;
        Employee employeeMinExpenses = employees[0];

        for (int i = 0; i < account; i++) {
            if (employees[i].getSalary() < minExpenses) {
                minExpenses = employees[i].getSalary();
                employeeMinExpenses = employees[i];
            }
        }
        return minExpenses;

    }

    public float maxSalary() {
        float maxExpenses = Integer.MIN_VALUE;
        Employee employeeMaxExpenses = employees[0];
        for (int i = 0; i < account; i++) {
            if (employees[i].getSalary() > maxExpenses) {
                maxExpenses = employees[i].getSalary();
                employeeMaxExpenses = employees[i];
            }
        }
        return maxExpenses;
    }

    public float averageSalaryEmployees() {
        float averageSalary = sumSalary() / account;
        return averageSalary;
    }

    public String printAllNameOfEmployees() {
        String blankFullName = "ФИО: ";
        for (int i = 0; i < account; i++) {
            blankFullName += employees[i].getFullName();
            if (i < account--) {
                System.out.println();
            }
        }
        return blankFullName;
    }
    public void salaryIndexingByRate (int rate) {
        float rateSalary = 0;
        for (int i = 0; i < account; i++) {
            rateSalary = employees[i].getSalary() + employees[i].getSalary() * rate / 100;
            employees[i].setSalary(rateSalary);
        }
    }
    public Employee maxSalaryInDepartment(int departments) {
        Employee maxSalaryEmployee = null;
        for (int i = 0; i < account; i++) {
            if (employees[i].getDepartments() == departments) {
                if (maxSalaryEmployee == null || employees[i].getSalary() < maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employees[i];
                }
            }
        }
        return maxSalaryEmployee;
    }
    public Employee minSalaryInDepartment(int departments) {
        Employee minSalaryEmployee = null;
        for (int i = 0; i < account; i++) {
            if (employees[i].getDepartments() == departments) {
                if (minSalaryEmployee == null || employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employees[i];
                }
            }
        }
        return minSalaryEmployee;
    }

    public float sumSalaryInDepartment(int departments) {
        int sumOfSalary = 0;
        for (int i = 0; i < account; i++) {
            if (employees[i].getDepartments() == departments) {
                sumOfSalary +=employees[i].getSalary();
            }
        }
        return sumOfSalary;
    }
    public float averageSalaryInDepartment (int departments) {
        float sumOfSalary = 0;
        float employeeCount = 0;
        for (int i = 0; i < account; i++) {
            sumOfSalary += employees[i].getSalary();
            employeeCount++;

        }
        float averageSalaryDepartment = sumOfSalary / employeeCount;
        return averageSalaryDepartment;
    }
    public float salaryIndexingByRateInDepartment (int departments, int rate) {
        float rateSalary = 0;
        for (int i = 0; i < account; i++) {
            if (employees[i].getDepartments() == departments) {
                rateSalary = employees[i].getSalary() + employees[i].getSalary() * rate / 100;
                employees[i].setSalary(rateSalary);
            }
        }
        return rateSalary;
    }
    public void printAllDataInDepartment(int departments) {
        for (int i = 0; i < account; i++) {
            if (employees[i].getDepartments() == departments) {
                System.out.println(employees[i].getiD() + " " +
                        employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }
    public void filterByLessSalaryLevel (int salaryLevel) {
        for (int i = 0; i < account; i++) {
            if (employees[i].getSalary() < salaryLevel) {
                System.out.println(employees[i].getiD() + " " +
                        employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }
    public void filterByAboveSalaryLevel (int salaryLevel) {
        for (int i = 0; i < account; i++) {
            if (employees[i].getSalary() >= salaryLevel) {
                System.out.println(employees[i].getiD() + " " +
                        employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }

    @Override
    public String toString() {
        return  Arrays.toString(employees);
    }
}
