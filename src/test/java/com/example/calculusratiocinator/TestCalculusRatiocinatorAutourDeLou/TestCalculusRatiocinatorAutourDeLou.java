package com.example.calculusratiocinator.TestCalculusRatiocinatorAutourDeLou;

import com.example.calculusratiocinator.Affirmation;
import com.example.calculusratiocinator.jeNeSaisPas.JeNeSaisPas;
import com.example.calculusratiocinator.veriteEtMensonge.Verite;
import com.example.calculusratiocinator.veriteEtMensonge.Mensonge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculusRatiocinatorAutourDeLou {

    @Test
    public void testLouEstPauvreEtLouEstGenereux() {
        Affirmation mensonge = new Mensonge();
        Affirmation verite = new Verite();
        Affirmation affirmation = new ConjonctionEt(mensonge, verite);
        assertFalse(affirmation.estVraieOuFausse());
    }

    @Test
    public void testLouEstBeauDoncLouEstPauvre() {
        Affirmation verite = new Verite();
        Affirmation mensonge = new Mensonge();
        Affirmation affirmation = new ConjonctionDonc(verite, mensonge);
        assertFalse(affirmation.estVraieOuFausse());
    }

    @Test
    public void testLouEstPauvreDoncLouEstGenereux() {
        Affirmation mensonge = new Mensonge();
        Affirmation verite = new Verite();
        Affirmation affirmation = new ConjonctionDonc(mensonge, verite);
        assertTrue(affirmation.estVraieOuFausse());
    }

    @Test
    public void testLouEstBeauOuLouEstGenereuxDoncLouEstPauvre() {
        Affirmation verite = new Verite();
        Affirmation veriteGenerosite = new Verite();
        Affirmation affirmation = new ConjonctionDonc(new ConjonctionOu(verite, veriteGenerosite), new Mensonge());
        assertFalse(affirmation.estVraieOuFausse());
    }

    @Test
    public void testLouEstBeauOuLouEstGenereuxDoncLouEstPauvreJeNeSaisPas() {
        Affirmation verite = new Verite();
        Affirmation veriteGenerosite = new Verite();
        Affirmation mensonge = new Mensonge();
        Affirmation affirmationPremierePartie = new ConjonctionOu(verite, veriteGenerosite);
        Affirmation affirmationDeuxiemePartie = new ConjonctionOu(mensonge, veriteGenerosite);
        Affirmation affirmation = new ConjonctionDonc(affirmationPremierePartie, affirmationDeuxiemePartie);
        assertEquals("Je ne sais pas", JeNeSaisPas.obtenirReponse());
    }

}
