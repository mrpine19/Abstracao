package exercício_fixacao.entities;

public class Company extends TaxPayer{
    int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (getAnualIncome() <= 10){
            return getAnualIncome() * 0.16;
        } else{
            return getAnualIncome() * 0.14;
        }
    }

}
