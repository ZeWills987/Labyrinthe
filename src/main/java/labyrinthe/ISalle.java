package labyrinthe;

/**
 *
 * @author INFO Professors team
 */
public interface ISalle {
    public int getX(); // abcisse
    public int getY(); // ordonnee
    public boolean estIdentique(ISalle autre);
    public boolean estAdjacente( ISalle autre);
}
