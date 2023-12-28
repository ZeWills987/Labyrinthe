/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import labyrinthe.ISalle;

/**
 *
 * @author William Tchang
 */
public class Monstre extends APersonnage {

    private static int unite;
    public ISalle salleChoisie;

    public Monstre(ISalle s) {
        super.setPosition(s);
        salleChoisie = s;
        super.estMonstre=true;
    }

    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        if (sallesAccessibles.isEmpty()) {
            System.out.println("Aucune salle accessible trouvée.");
            return null;
        }
        List<ISalle> listeSalles = new ArrayList<>(sallesAccessibles);
        Random random = new Random();
        int indexAleatoire = random.nextInt(listeSalles.size());

        ISalle salleChoisie = listeSalles.get(indexAleatoire);
        return salleChoisie;
    }

    @Override
    public void setPosition(ISalle s) {
        super.setPosition(s);
    }

    public static int getUnite() {
        return unite;
    }

}
