package com.example.calculusratiocinator;

import com.example.calculusratiocinator.TestCalculusRatiocinatorAutourDeLou.ConjonctionDonc;
import com.example.calculusratiocinator.TestCalculusRatiocinatorAutourDeLou.ConjonctionEt;
import com.example.calculusratiocinator.TestCalculusRatiocinatorAutourDeLou.ConjonctionOu;
import com.example.calculusratiocinator.veriteEtMensonge.Mensonge;
import com.example.calculusratiocinator.veriteEtMensonge.Verite;
import com.example.calculusratiocinator.jeNeSaisPas.JeNeSaisPas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculusRatiocinatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculusRatiocinatorApplication.class, args);

        // Les affirmations initiales
        Affirmation verite1 = new Verite(); // Lou est beau
        Affirmation mensonge1 = new Mensonge(); // Lou est pauvre
        Affirmation affirmation1 = new AffirmationSimple(false); // Lou est généreux

        // Affirmations spécifiques
        Affirmation affirmation2 = new ConjonctionEt(verite1, mensonge1); // Lou est beau et Lou est pauvre
        Affirmation affirmation3 = new ConjonctionDonc(verite1, mensonge1); // Lou est beau. Donc Lou est pauvre.
        Affirmation affirmation4 = new ConjonctionDonc(mensonge1, affirmation1); // Lou est pauvre. Donc Lou est généreux.
        Affirmation affirmation5 = new ConjonctionDonc(new ConjonctionOu(verite1, affirmation1), mensonge1); // Lou est beau ou Lou est généreux. Donc Lou est pauvre.
        Affirmation affirmation6 = new ConjonctionOu(affirmation5, new ConjonctionOu(mensonge1, affirmation1)); // Premièrement : « Lou est beau ou Lou est généreux. Donc Lou est pauvre. » Et deuxièmement : Lou

        // Calcul de la vérité des affirmations
        System.out.println("Lou est beau et Lou est pauvre : " + (affirmation2.estVraieOuFausse() ? "Vrai" : "Faux"));
        System.out.println("Lou est beau. Donc Lou est pauvre : " + (affirmation3.estVraieOuFausse() ? "Vrai" : "Faux"));
        System.out.println("Lou est pauvre. Donc Lou est généreux : " + (affirmation4.estVraieOuFausse() ? "Vrai" : "Faux"));
        System.out.println("Lou est beau ou Lou est généreux. Donc Lou est pauvre : " + (affirmation5.estVraieOuFausse() ? "Vrai" : "Faux"));
        System.out.println("Premièrement : « Lou est beau ou Lou est généreux. Donc Lou est pauvre. » Et deuxièmement : Lou est pauvre ou Lou est généreux » : " + (affirmation6.estVraieOuFausse() ? "Vrai" : new JeNeSaisPas().obtenirReponse()));
    }
}
