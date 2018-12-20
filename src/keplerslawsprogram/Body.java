/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keplerslawsprogram;

import java.awt.Point;

/**
 *
 * @author charp
 */
public class Body extends DisplayedObject{
    double mass;
    Vector vector;
    
    /**
     * Creates a new Body at the origin with 0 mass and 0 velocity
     */
    Body()
    {
        super();
        mass = 0;
        vector = new Vector();
    }
    
    /**
     * Creates new Body with set location, mass, and velocity
     * @param lo Location of Body
     * @param ma Mass of Body
     * @param ve Velocity of Body
     */
    Body(Point lo, double ma, Vector ve)
    {
        super(lo);
        mass = ma;
        vector = ve;
    }
    
    /**
     * Gets mass of Body
     * @return mass
     */
    public double getMass()
    {
        return mass;
    }
    
    /**
     * Gets vector of Body
     * @return vector
     */
    public Vector getVector()
    {
        return vector;
    }
    
    @Override
    public void display()
    {
        
    }
}
