package fr.iut.editeur.document;


/**
 * Classe contenant les actions réalisables sur un Document texte
 */
public class Document {

    /**
     * paramètre contenant le texte du document
     */
    private String contentDocument;

    /**
     * constructeur initialisant contentDocument en tant que chaine de caractère vide
     */
    public Document() {
        this.contentDocument = "";
    }

    public String getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(String contentDocument) {
        this.contentDocument = contentDocument;
    }

    /***
     * ajoute une chaine de caractère au document
     * @param texte la chaîne de caractère à ajouter
     */
    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    /**
     * Remplace une partie du texte par une chaine de caractère.
     * Peut être remplacé par la chaine vide.
     * @param debut index du début de la zone à remplacer (inclus)
     * @param fin index de la fin de la zone à remplacer (inclus)
     * @param remplacement texte qui va venir remplacer l'interval (début-fin)
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        contentDocument = partieGauche + remplacement + partieDroite;
    }

    /**
     * Met en majuscules l'interval choisi
     * @param debut index du début de la zone à remplacer (inclus)
     * @param fin index de la fin de la zone à remplacer (inclus)
     */
    public void majuscules(int debut, int fin) {
        String partieMajuscules = contentDocument.substring(debut, fin + 1);
        partieMajuscules = partieMajuscules.toUpperCase();
        this.remplacer(debut, fin, partieMajuscules);
    }

    /**
     * Met en minuscules l'interval choisi
     * @param debut index du début de la zone à remplacer (inclus)
     * @param fin index de la fin de la zone à remplacer (inclus)
     */
    public void minuscules(int debut, int fin) {
        String partieMinuscules = contentDocument.substring(debut, fin + 1);
        partieMinuscules = partieMinuscules.toLowerCase();
        this.remplacer(debut, fin, partieMinuscules);
    }

    /**
     * supprime l'intégralité du document
     */
    public void clear() {
        this.contentDocument = "";
    }

    /**
     * insère du texte à la position choisie (supprime le caractère à la position donnée)
     * @param texte texte à insérer
     * @param position la position où inserer le texte
     */
    public void inserer(String texte, int position) {
        remplacer(position, position, texte);
    }


    /**
     * efface un interval dans le texte
     * @param debut index du début de la zone à remplacer (inclus)
     * @param fin index de la fin de la zone à remplacer (inclus)
     */
    public void effacer(int debut, int fin) {
        this.remplacer(debut, fin, "");
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }
}