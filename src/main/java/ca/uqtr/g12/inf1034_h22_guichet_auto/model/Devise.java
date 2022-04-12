package ca.uqtr.g12.inf1034_h22_guichet_auto.model;

public class Devise {

    private double amount;

    private double newAmount;

    private double rate;

    private String typeDevise;

    public String getTypeDevise() {
        return typeDevise;
    }

    public void setTypeDevise(String typeDevise) {
        this.typeDevise = typeDevise;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getNewAmount() {
        return newAmount;
    }

    public void setNewAmount(double newAmount) {
        this.newAmount = newAmount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
