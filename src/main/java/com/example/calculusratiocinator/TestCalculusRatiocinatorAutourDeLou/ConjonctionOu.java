package com.example.calculusratiocinator.TestCalculusRatiocinatorAutourDeLou;

import com.example.calculusratiocinator.Affirmation;

public class ConjonctionOu extends ConjonctionsDeCoordinations {
    public ConjonctionOu(Affirmation debut, Affirmation fin) {
        super(debut, fin);
    }

    @Override
    public boolean estVraieOuFausse() {
        return affirmationDebut.estVraieOuFausse() || affirmationFin.estVraieOuFausse();
    }
}
