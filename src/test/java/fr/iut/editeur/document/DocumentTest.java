package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DocumentTest {

    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Bonjour, ):(");

        assertEquals("Bonjour, ):(", document.toString());
    }

    @Test
    public void testRemplacer() {
        Document document = new Document();
        document.ajouter("Bonjour, ):(");
        document.remplacer(9,11, "kelian");

        assertEquals("Bonjour, kelian", document.toString());
    }

    @Test
    public void testRemplacerVide() {
        Document document = new Document();
        document.ajouter("Bonjour, ):(");
        document.remplacer(9,11, "");

        assertEquals("Bonjour, ", document.toString());
    }

    @Test
    public void testInserer() {
        Document document = new Document();
        document.ajouter("Bonjour, ):(");
        document.inserer("je suis content : ",9);

        assertEquals("Bonjour, je suis content : :(", document.toString());
    }
}
