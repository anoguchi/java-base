package OOP.classeAbstrata.practice.practice02.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditure;

    public Individual() {

    }

    public Individual(String name, Double annualIncome, Double healthExpenditure) {
        super(name, annualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public Double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public double tax() {
        double basicTax = (getAnnualIncome() < 20000.00) ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;

        basicTax -= getHealthExpenditure() * 0.5;
        if (basicTax < 0.0) {
            basicTax = 0.0;
        }
        return basicTax;
    }
}
