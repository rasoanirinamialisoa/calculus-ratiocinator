package com.example.calculusratiocinator.TestCalculusRatiocinatorAutourDeLou;

import com.example.calculusratiocinator.Affirmation;

public class ConjonctionEt extends ConjonctionsDeCoordinations {
    public ConjonctionEt(Affirmation debut, Affirmation fin) {
        super(debut, fin);
    }

    @Override
    public boolean estVraieOuFausse() {
        return affirmationDebut.estVraieOuFausse() && affirmationFin.estVraieOuFausse();

    }


}


