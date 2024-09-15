package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.commande.CommandeClear;
import fr.iut.editeur.commande.CommandeEffacer;
import fr.iut.editeur.commande.CommandeMajuscules;
import fr.iut.editeur.commande.CommandeRemplacer;
import fr.iut.editeur.commande.CommandeInserer;
import fr.iut.editeur.document.Document;

/**
 * Classe contenant tous les appels de fonctions applicables à un document
 */
public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /**
     * Stoque tous les appels de fonctions et permet d'appeler leur constructeur avec les informations nécessaires
     * @param name nom de la fonction à appeler
     * @param document document sur lequel appeler la fonction
     * @param parameters paramètres de la fonction
     * @return la commande créée
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        return switch (name) {
            case "ajouter" -> new CommandeAjouter(document, parameters);
            case "remplacer" -> new CommandeRemplacer(document, parameters);
            case "majuscules" -> new CommandeMajuscules(document, parameters);
            case "effacer" -> new CommandeEffacer(document, parameters);
            case "clear" -> new CommandeClear(document, parameters);
            case "inserer" -> new CommandeInserer(document, parameters);
            case "minuscules" -> new CommandeMinuscules(document, parameters);
            default -> null;
        };
    }

}