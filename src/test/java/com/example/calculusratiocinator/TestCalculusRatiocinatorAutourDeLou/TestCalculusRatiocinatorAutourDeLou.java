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

}
