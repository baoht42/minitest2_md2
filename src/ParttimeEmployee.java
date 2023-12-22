public class ParttimeEmployee extends Employee{
    private int hour;

    public ParttimeEmployee(int codeEmployee, String name, int age, String phoneNumber, String mail, int hour) {
        super(codeEmployee, name, age, phoneNumber, mail);
        this.hour = hour;
    }

    public ParttimeEmployee(int hour) {
        this.hour = hour;
    }

    public ParttimeEmployee() {

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int getPayment() {
        return hour*100000;
    }


}
