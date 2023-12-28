/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package labyrinthe;

import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import personnages.IPersonnage;

/**
 *
 * @author William Tchang
 */
public class LabyrintheIT {
    
    /**
     * Test of creerLabyrinthe method, of class Labyrinthe.
     */
    @Test
    public void testCreerLabyrinthe() {
        System.out.println("creerLabyrinthe");
        Labyrinthe laby = new Labyrinthe();
        // Niveau invalide 
        laby.creerLabyrinthe("labys/levelInvalide1.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/levelInvalide2.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/levelInvalide3.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/levelInvalide4.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        
        //Niveau valide
        laby.creerLabyrinthe("labys/level3.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/level6.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/level7.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/level8.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/level9.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/level10.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/level11.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
        laby.creerLabyrinthe("labys/level12.txt");
        assertTrue(!laby.labyAvecDoublon() && !laby.labyCoordsInvalides());
    }

    /**
     * Test of labyAvecDoublon method, of class Labyrinthe.
     */
    @Test
    public void testLabyAvecDoublon() {
        System.out.println("labyAvecDoublon");
        Labyrinthe instance = new Labyrinthe();
        boolean expResult = false;
        boolean result = instance.labyAvecDoublon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of labyCoordsInvalides method, of class Labyrinthe.
     */
    @Test
    public void testLabyCoordsInvalides() {
        System.out.println("labyCoordsInvalides");
        Labyrinthe instance = new Labyrinthe();
        boolean expResult = false;
        boolean result = instance.labyCoordsInvalides();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sallesAccessibles method, of class Labyrinthe.
     */
    @Test
    public void testSallesAccessibles() {
        System.out.println("sallesAccessibles");
        IPersonnage bob = null;
        Labyrinthe instance = new Labyrinthe();
        Collection<ISalle> expResult = null;
        Collection<ISalle> result = instance.sallesAccessibles(bob);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntree method, of class Labyrinthe.
     */
    @Test
    public void testGetEntree() {
        System.out.println("getEntree");
        Labyrinthe instance = new Labyrinthe();
        ISalle expResult = null;
        ISalle result = instance.getEntree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSortie method, of class Labyrinthe.
     */
    @Test
    public void testGetSortie() {
        System.out.println("getSortie");
        Labyrinthe instance = new Labyrinthe();
        ISalle expResult = null;
        ISalle result = instance.getSortie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chemin method, of class Labyrinthe.
     */
    @Test
    public void testChemin() {
        System.out.println("chemin");
        ISalle u = null;
        ISalle v = null;
        Labyrinthe instance = new Labyrinthe();
        Collection<ISalle> expResult = null;
        Collection<ISalle> result = instance.chemin(u, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLargeur method, of class Labyrinthe.
     */
    @Test
    public void testGetLargeur() {
        System.out.println("getLargeur");
        Labyrinthe instance = new Labyrinthe();
        int expResult = 0;
        int result = instance.getLargeur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHauteur method, of class Labyrinthe.
     */
    @Test
    public void testGetHauteur() {
        System.out.println("getHauteur");
        Labyrinthe instance = new Labyrinthe();
        int expResult = 0;
        int result = instance.getHauteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
