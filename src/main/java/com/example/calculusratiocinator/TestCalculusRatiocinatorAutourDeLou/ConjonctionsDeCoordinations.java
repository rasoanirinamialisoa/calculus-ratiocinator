package com.example.calculusratiocinator.TestCalculusRatiocinatorAutourDeLou;

import com.example.calculusratiocinator.Affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class ConjonctionsDeCoordinations extends Affirmation {
    protected Affirmation affirmationDebut;
    protected Affirmation affirmationFin;

}

