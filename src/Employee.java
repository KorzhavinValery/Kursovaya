public class Employee {
    private String fullName;
    private int departments;
    private float salary;
    private  int iD;
    private static int counter;

    public Employee(String fullName, int departments, float salary) {
        this.fullName = fullName;
        this.departments = departments;
        this.salary = salary;
        iD= ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartments() {
        return departments;
    }

    public void setDepartments(int departments) {
        this.departments = departments;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getiD() {
        return iD;
    }

    @Override
    public String toString() {
        return "ID: " + iD + " ФИО: " + fullName + " Отдел: " + departments + " Зарплата: " + salary;
    }
}
