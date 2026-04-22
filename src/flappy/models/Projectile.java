package flappy.models;

import java.awt.*;

public class Projectile extends Sprite{

    public Projectile() {
        vitesse = 20;
        largeur = 10;
        couleur = Color.ORANGE;
    }

    @Override
    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillOval(x, y, largeur, largeur);
    }

    @Override
    public void deplacement() {
        x += vitesse;
    }
}
