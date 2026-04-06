package payable;

public class HourlyEmployee extends Employee {
    private int hourlyWorked;
    private int hourlyRate;

    public HourlyEmployee(String name, String id, int hourlyWorked, int hourlyRate) {
        super(name, id);
        this.hourlyWorked = hourlyWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPaymentAmount() {
        return hourlyRate * hourlyWorked;
    }
}