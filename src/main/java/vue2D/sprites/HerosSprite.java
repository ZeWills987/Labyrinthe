/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import javafx.scene.input.KeyEvent;
import java.util.Collection;
import java.util.Iterator;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import labyrinthe.Salle;
import personnages.Heros;

/**
 *
 * @author William Tchang
 */
public class HerosSprite extends ASprite implements EventHandler<KeyEvent> {
    private ISalle salleChoisie;

    public HerosSprite(Heros hero, ILabyrinthe laby) {
        super(hero);
        salleChoisie=hero.getPosition();
        this.setImage(new Image("file:icons/link/LinkRunR1.gif"));
    }

    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        // La salle choisie à comparer.
        ISalle choix = new Salle(salleChoisie.getX(),salleChoisie.getY());
        // La salle qui va être retourne par la fonction.
        ISalle deplacement=new Salle(salleChoisie.getX(),salleChoisie.getY());
        // L'iterator de la liste de salles accessibles.
        Iterator<ISalle> iterator = sallesAccessibles.iterator();
        // La condition de sortie de la boucle.
        boolean access=false;
        while(iterator.hasNext() && !access){
            ISalle accessible = iterator.next();
            // Comparaison des coordonnées de salleChoisie et des salles accessibles
            access=choix.getX()==accessible.getX() && choix.getY()==accessible.getY();
            if(access){
                deplacement=new Salle(salleChoisie.getX(),salleChoisie.getY());
                access=true;
            }else{
                deplacement=super.getPosition();
            }
        }
        return deplacement;
    }

    @Override
    public ISalle getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition(ISalle s) {
        salleChoisie=s;
        super.setPosition(s);
    }

    @Override
    public void handle(KeyEvent event) {
        switch (event.getCode()) {
            case LEFT:
                salleChoisie=calculerSalleGauche();
                break;
            case RIGHT:
                salleChoisie=calculerSalleDroite();
                break;
            case UP:
                salleChoisie=calculerSalleHaut();
                break;
            case DOWN:
                salleChoisie=calculerSalleBas();
                break;
            default:
                break;
        }
    }

    // Méthodes pour calculer les salles en fonction des touches fléchées
    private ISalle calculerSalleGauche() {
        return new Salle(salleChoisie.getX()-1,salleChoisie.getY());
    }

    private ISalle calculerSalleDroite() {
        return new Salle(salleChoisie.getX()+1,salleChoisie.getY());
    }

    private ISalle calculerSalleHaut() {
        return new Salle(salleChoisie.getX(),salleChoisie.getY()-1);
    }

    private ISalle calculerSalleBas() {
        return new Salle(salleChoisie.getX(),salleChoisie.getY()+1);
    }

    @Override
    public boolean estMonstre() {
        return perso.estMonstre();
    }
}
