package flappy.models;

import flappy.Principal;
import flappy.utils.Utils;

import java.awt.*;

public class Bonus extends Sprite {

    public Bonus() {
        largeur = 25;
        x = Principal.LARGEUR;
        y = Utils.aleatoire(25, Principal.HAUTEUR - 25);
    }

    @Override
    public void dessiner(Graphics2D dessin) {
        dessin.setColor(Color.YELLOW);
        dessin.fillOval(x,y,largeur,largeur);
    }

    @Override
    public void deplacement() {
        x -= 6;
    }
}
