/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labyrinthe;

/**
 *
 * @author William Tchang
 */
public class Salle implements ISalle {

    private int x;
    private int y;

    public Salle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    /**
     * Check si les salles sont identiques.
     *
     * @param autre la salle a checker
     * @return si les salles sont identiques
     */
    @Override
    public boolean estIdentique(ISalle autre) {
        return this.getX() == autre.getX() && this.getY() == autre.getY();
    }

    @Override
    public boolean estAdjacente(ISalle autre) {
        int xT = this.getX();
        int yT = this.getY();
        int xA = autre.getX();
        int yA = autre.getY();
//        System.out.println("actu : x="+xT+", y="+yT);
//        System.out.println("autre : x="+xA+", y="+yA);
        return (xT == xA && yT == yA - 1) || (xT == xA + 1 && yT == yA)
                || (xT == xA && yT == yA + 1) || (xT == xA - 1 && yT == yA);
    }
}
