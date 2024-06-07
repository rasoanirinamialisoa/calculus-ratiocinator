package com.example.calculusratiocinator.conjonctionsDeCoordinations;

import com.example.calculusratiocinator.Affirmation;

public class ConjonctionDonc extends ConjonctionsDeCoordinations {
    public ConjonctionDonc(Affirmation debut, Affirmation fin) {
        super(debut, fin);
    }
    @Override
    public boolean estVraieOuFausse() {
        return !(affirmationDebut.estVraieOuFausse() && !affirmationFin.estVraieOuFausse());
    }
}
