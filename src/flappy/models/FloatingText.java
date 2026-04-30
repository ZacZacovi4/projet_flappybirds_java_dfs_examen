package flappy.models;

import java.awt.*;

public class FloatingText extends Sprite {

    protected String text = "+200";
    protected long tempsCreation ;

    public FloatingText(){
        vitesse = 1;
        couleur = Color.YELLOW;
        tempsCreation = System.currentTimeMillis();
    }

    @Override
    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.setFont(new Font("Arial", Font.BOLD, 20));
        dessin.drawString(text, x, y);
    }

    @Override
    public void deplacement() {
        y -= vitesse;
    }

    public boolean estExpire() {
        return System.currentTimeMillis() - tempsCreation > 3000;
    }
}
