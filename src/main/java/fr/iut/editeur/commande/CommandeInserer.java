package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void commandeExecuter() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer ; position(int); texte à insérer");
            return;
        }

        int position = Integer.parseInt(parameters[1]);
        String texte = parameters[2];

        document.inserer(texte,position);
    }

    @Override
    public String getDescriptionCommande() {
        return "Inserer un texte dans le document";
    }
}
