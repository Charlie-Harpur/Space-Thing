/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keplerslawsprogram;

/**
 *
 * @author charp
 */
public class Vector {
    private double velX, velY;
    
    /**
     * Creates a vector with 0 velocity on both axis
     */
    public Vector()
    {
        velX = 0;
        velY = 0;
    }
    
    /**
     * Creates vector with parameters
     * @param vX Velocity along x axis
     * @param vY velocity along y axis
     */
    public Vector(double vX, double vY)
    {
        this.velX = vX;
        this.velY = vY;
    }
    
    
    public double getVelX()
    {
        return velX;
    }
    
    public double getVelY()
    {
        return velY;
    }
    
    /**
     * Adds speeds of vector1 and vector2 
     * @param vector2 
     */
    public void add(Vector vector2)
    {
        velX += vector2.getVelX();
        velY += vector2.getVelY();
    }
}
