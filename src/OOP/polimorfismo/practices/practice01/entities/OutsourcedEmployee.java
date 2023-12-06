package OOP.polimorfismo.practices.practice01.entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharged;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharged) {
        super(name, hours, valuePerHour);
        this.additionalCharged = additionalCharged;
    }

    public Double getAdditionalCharged() {
        return additionalCharged;
    }

    public void setAdditionalCharged(Double additionalCharged) {
        this.additionalCharged = additionalCharged;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharged * 1.1;
    }
}
