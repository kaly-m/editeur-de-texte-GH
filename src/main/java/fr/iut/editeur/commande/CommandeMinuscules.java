package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscules extends CommandeDocument{
    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void commandeExecuter() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : minuscules;debut;fin");
            return;
        }

        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);

        this.document.minuscules(debut, fin);
    }

    @Override
    public String getDescriptionCommande() {
        return "Mettre en minuscules une partie du texte";
    }
}
