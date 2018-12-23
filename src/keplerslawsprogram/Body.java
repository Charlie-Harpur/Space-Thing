/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keplerslawsprogram;

import java.awt.Point;
import java.util.ArrayList;
import static keplerslawsprogram.KeplersLawsProgram.G;

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
    
    /**
     * Gets acceleration due to gravity from other Body
     * @param body2 
     * @return Vector of gravity from body2
     */
    public Vector getGravity(Body body2)
    {
        double distanceX =getLocation().getX() - body2.getLocation().getX();
        double distanceY = getLocation().getY() - body2.getLocation().getY();
        double distance = Math.sqrt((Math.pow(distanceX, 2) + Math.pow(distanceY, 2)));
        double acceleration = (G * ((this.getMass() * body2.getMass()) / distance)) * (1 / mass);
        
        double velX = (acceleration * (distanceX / distance));
        double velY = (acceleration * (distanceY / distance));
        return new Vector(velX, velY);
    }
    
    /**
     * Updates  vector with the pull of other Bodies' gravity
     * @param affectingBodies All Bodies
     */
    public void updateVector(ArrayList<Body> affectingBodies)
    {
        for(Body otherBody : affectingBodies)
        {
            if(otherBody != this)
            {
                vector.add(this.getGravity(otherBody));
            }
        }
    }
    
    /**
     * Updates location using vector
     */
    public void move()
    {
        this.getLocation().setLocation(this.getLocation().getX() + vector.getVelX(), this.getLocation().getY() + vector.getVelY());
    }
    
    @Override
    public void display()
    {
        
    }
}