import java.util.Objects;

public class Employee {
    private String fullName;
    private int departments;
    private int salary;
    private int id;
    private static int counter;

    public Employee(String fullName, int departments, int salary) {
        this.fullName = fullName;
        this.departments = departments;
        this.salary = salary;
        id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartments() {
        return departments;
    }

    public void setDepartments(int departments) {
        this.departments = departments;
    }

    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {

        this.salary = salary;
    }


    public int getid() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, departments, salary, id);
    }

    @Override
    public String toString() {
        return "ID: " + id + " ФИО: " + fullName + " Отдел: " + departments + " Зарплата: " + salary + " рублей.";
    }
}
