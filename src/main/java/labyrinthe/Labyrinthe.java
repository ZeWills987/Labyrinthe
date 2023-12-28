package labyrinthe;

import java.util.ArrayList;
import java.util.Collection;
import outils.Fichier;
import personnages.IPersonnage;

/**
 *
 * @author INFO Professors team
 */
public class Labyrinthe extends ArrayList<ISalle> implements ILabyrinthe {

    protected ISalle entree;
    protected ISalle sortie;
    private int largeur;
    private int hauteur;

    @Override
    public void creerLabyrinthe(String file) {
        Fichier f = new Fichier(file);
        boolean coordsValide=false;
        // dimensions
        largeur = f.lireNombre();
        hauteur = f.lireNombre();
        entree = lireSalle(f);
        sortie = lireSalle(f);
        this.add(entree);
        this.add(sortie);
        ISalle salle = lireSalle(f);
        while (salle != null) {
            coordsValide=(salle.getX()<largeur && salle.getX()>0)&&(salle.getY()<hauteur && salle.getY()>0);
            if(!(this.contains(salle)&&coordsValide)){
                this.add(salle);
            }
            salle = lireSalle(f);
        }
    }

    /**
     * Donne une salle appartir des données du fichier.
     * 
     * @param f le fichier donnée
     * @return la salle corspondante
     */
    private Salle lireSalle(Fichier f) {
        int x = f.lireNombre();
        int y = f.lireNombre();
        return (x != -1 && y != -1) ? new Salle(x, y) : null;
    }

    /**
     * Vérifie si le labyrinthe comporte des salles endoubles.
     * 
     * @return si il y a un doublons 
     */
    public boolean labyAvecDoublon() {
        for (int i = 0; i < this.size(); i++) {
            ISalle first = this.get(i);
            for (int y = 0; y < this.size(); y++) {
                if (i == y) {
                    continue;
                }
                ISalle second = this.get(y);
                if (first.estIdentique(second)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Check si les salles ont des coordonnees valide.
     * 
     * @return si les salles ont des coordonnees valide
     */
    public boolean labyCoordsInvalides(){
        for(ISalle s : this){
            if((s.getX()<largeur && s.getX()>0)&&
                    (s.getY()<hauteur && s.getY()>0)){
                return false;
            }
        }
        return true;
    }

    @Override
    public Collection<ISalle> sallesAccessibles(IPersonnage bob) {
        Collection<ISalle> c = new ArrayList<>();
        for(ISalle s : this){
            if(bob.getPosition().estAdjacente(s)){
                c.add(s);
            }
        }
        return new ArrayList<>(c);
    }

    @Override
    public ISalle getEntree() {
        return entree;
    }

    @Override
    public ISalle getSortie() {
        return sortie;
    }

    @Override
    public Collection<ISalle> chemin(ISalle u, ISalle v) {
        return null;
    }

    @Override
    public int getLargeur() {
        return largeur;
    }

    @Override
    public int getHauteur() {
        return hauteur;
    }

}
