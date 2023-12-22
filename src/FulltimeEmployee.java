public class FulltimeEmployee extends Employee {
    private int bonus;
    private int fine;
    private int salary;

    public FulltimeEmployee(int codeEmployee, String name, int age, String phoneNumber, String mail, int bonus, int fine, int salary) {
        super(codeEmployee, name, age, phoneNumber, mail);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public FulltimeEmployee(int bonus, int fine, int salary) {
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public FulltimeEmployee() {

    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPayment() {
        return salary + (bonus-fine);
    }



}
