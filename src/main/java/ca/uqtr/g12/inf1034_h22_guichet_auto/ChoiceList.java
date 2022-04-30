package ca.uqtr.g12.inf1034_h22_guichet_auto;

public enum ChoiceList {

    /**
     * Nom des différents fenêtres FXML
     */

    CHOICE_SCREEN("choice-screen.fxml"),
    CHANGE_DEVISE("change-devise.fxml"),
    DEPOT_CHEQUE("depot-cheque.fxml"),
    CHANGE_NIP("change-nip.fxml"),
    FAIRE_RETRAIT("faire-retrait.fxml"),
    IMPRIMER_RELEVER("imprimer-relever.fxml"),
    ETAT_COMPTE("etat-compte.fxml"),
    DEPOT_ARGENT("depot-argent.fxml"),
    PAYER_FACTURE("payer-facture.fxml");


    private String fichierFxml;

    ChoiceList(String fichierFxml) {
        this.fichierFxml = fichierFxml;
    }

    public String getFichierFxml() {
        return fichierFxml;
    }
}
