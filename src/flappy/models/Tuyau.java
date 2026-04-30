package flappy.models;

import flappy.Principal;
import flappy.utils.Utils;

import java.awt.*;

public class Tuyau extends Sprite{

    protected int ecartement = 200;
    protected int marge = 50;
    protected int vies = 3;
    protected boolean detruit = false;

    public Tuyau(){

        largeur = 100;
        vitesse = 4;
        couleur = Color.GREEN;
    }

    public void deplacement(){
        x -= vitesse;

        if(x < -largeur) {
            x = Principal.LARGEUR;
            y = Utils.aleatoire(marge + ecartement, Principal.HAUTEUR - marge);
            vies = 3;
            detruit = false;
        }

    }

    public void dessiner(Graphics2D dessin){
        if(!detruit) {
            if (vies == 2) {
                dessin.setColor(Color.ORANGE);
            } else if (vies == 1) {
                dessin.setColor(Color.RED);
            } else {
                dessin.setColor(couleur);
            }
        }else {
            dessin.setColor(new Color(0,0,0,0));
        }
        dessin.fillRect(x,y, largeur, Principal.HAUTEUR);
        dessin.fillRect(x,y-ecartement-Principal.HAUTEUR, largeur, Principal.HAUTEUR);
    }

    public void prendreDegat(){
        if (!this.detruit){
            if (this.vies > 0) {
                this.vies -= 1;
            }
            if (this.vies <= 0){
                this.detruit = true;
            }
        }
    }

    // getter du champ detruit

    public boolean estDetruit(){
        return this.detruit;
    }

    @Override
    public Zone[] getZones() {

        Zone zoneTuyauBas = new Zone(
                new Point(x, y),
                new Point(x + largeur, y),
                new Point(x, y + Principal.HAUTEUR),
                new Point(x+ largeur, y + Principal.HAUTEUR));

        Zone zoneTuyauHaut = new Zone(
                new Point(x, y - Principal.HAUTEUR),
                new Point(x + largeur, y - Principal.HAUTEUR),
                new Point(x, y - ecartement),
                new Point(x+ largeur, y - ecartement));

        return new Zone[]{zoneTuyauBas, zoneTuyauHaut};
    }
}
