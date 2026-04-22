package flappy.models;

import flappy.Principal;
import flappy.utils.Utils;

import java.awt.*;

public class Oiseau extends Sprite{

    protected float gravite = 1.0f;

    public Oiseau() {

        largeur = 50;
        couleur = Color.RED;
    }

    public void deplacement(){
        this.y += gravite;
        this.gravite += 0.2;
    }

    public void dessiner(Graphics2D dessin){
        dessin.setColor(couleur);
        dessin.fillOval(x,y, largeur, largeur);
    }



    public void saut(){
       this.gravite = -5;
    }

    public void allerEnAvant() {
        if (this.x < 300){
            this.x += 5;
        }else{
            this.x += 0;
        }
    }

    public void allerEnArriere() {
        if (this.x > 100){
            this.x -= 5;
        }else{
            this.x -= 0;
        }
    }



    public float getGravite() {
        return gravite;
    }

    public void setGravite(float gravite) {
        this.gravite = gravite;
    }
}
