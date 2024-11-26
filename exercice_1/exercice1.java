
public class FactureManager{

    /**
     * @param 
     * Methode qui retourne la valeur de la reduction en fonction du type de produit
     */
    public reduction(String typeProduit){
        switch(typeProduit){
            case "Alimentaire":
                return 0.05;
                break;
            case "Electronique":
                return 0.1;
                break;
            case "Luxe":
                return 0.15;
                break;
            default:
                return 0;
                break;
        }
    }

    /**
     * @param
     * Methode qui calcule le total de la facture
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        total -= total * reduction(typeProduit);
        if (total > 1000) {
            total -= total * 0.05;    
        }
    }
}
