package exercício_fixacao.entities;

import exercício_fixacao.entities.TaxPayer;

public class Individual extends TaxPayer {
    double healthExpenditures;

    public Individual(double healthExpenditures) {
        super();
    }

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax = 0;

        if(getAnualIncome() <= 20000.00){
            tax = getAnualIncome() * 0.15;
        } else if (getAnualIncome() > 20000.00) {
            tax = getAnualIncome() * 0.25;
        }

        if(healthExpenditures > 0){
            tax -= healthExpenditures * 0.5;
        }

        return tax;
    }
}
