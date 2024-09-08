package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument {

    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if (parameters.length > 1 )
        {
            System.err.println("Format attendu : clear");
            return;
        }
        this.document.clear();
        super.executer();
    }
}
