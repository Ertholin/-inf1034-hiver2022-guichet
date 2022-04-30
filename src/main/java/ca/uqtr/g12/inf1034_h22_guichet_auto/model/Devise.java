package ca.uqtr.g12.inf1034_h22_guichet_auto.model;

public class Devise {

    private double montant;

    private double nouveauMontant;

    private double taux;

    private String typeDevise;

    public String getTypeDevise() {
        return typeDevise;
    }

    public void setTypeDevise(String typeDevise) {
        this.typeDevise = typeDevise;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getNouveauMontant() {
        return nouveauMontant;
    }

    public void setNouveauMontant(double nouveauMontant) {
        this.nouveauMontant = nouveauMontant;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double changerToUs(double montant){
        if(typeDevise == "Dollar US"){
            nouveauMontant = montant * 1.27;
        }
        return nouveauMontant;
    }

}
