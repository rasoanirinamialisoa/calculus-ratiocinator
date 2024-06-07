package com.example.calculusratiocinator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AffirmationSimple extends Affirmation {
    private boolean valeur;
    @Override
    public boolean estVraieOuFausse() {
        return valeur;
    }
}
