package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;


public class CommandeEffacer extends CommandeDocument {

    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void commandeExecuter() {
        if(parameters.length < 2 || parameters.length > 3) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }

        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);

        this.document.effacer(debut, fin);
    }

    @Override
    public String getDescriptionCommande(){
        return "efface les texte dans l'interval début/fin";
    }
    //fonctionne à  merveille
}
