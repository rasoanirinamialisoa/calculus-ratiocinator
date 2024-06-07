package com.example.calculusratiocinator.conjonctionsDeCoordinations;

import com.example.calculusratiocinator.Affirmation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Conjonction extends Affirmation {
    protected Affirmation affirmationDebut;
    protected Affirmation affirmationFin;

}

