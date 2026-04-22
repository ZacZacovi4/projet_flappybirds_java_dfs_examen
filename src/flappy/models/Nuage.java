package flappy.models;

import flappy.Principal;
import flappy.utils.Utils;

import java.awt.*;

public class Nuage extends Sprite {

    public Nuage(){
        vitesse = 2;
        couleur = Color.WHITE;
    }

    @Override
    public void dessiner(Graphics2D dessin) {
       dessin.setColor(couleur);
       dessin.fillOval(x, y , largeur , largeur / 2);
    }

    @Override
    public void deplacement() {
        x -= vitesse;

        if(x < -largeur) {
            x = Principal.LARGEUR;
        }
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}
