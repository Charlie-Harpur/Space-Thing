/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package keplerslawsprogram;

/**
 *
 * @author chhar9972
 */
public class Point {
    private double x, y;
    
    Point()
    {
        x = 0;
        y = 0;
    }
    
    Point(double ex, double why)
    {
        x = ex;
        y = why;
    }
    
    public double getX()
    {
        return x;
    }
    
    public double getY()
    {
        return y;
    }
    
    public boolean equals(Point p2)
    {
        return this.x == p2.getX() && this.y == p2.getY();
    }
    
    public void move(Point newLocation)
    {
        this.x = newLocation.x;
        this.y = newLocation.y;
    }
    
    public void translate(Vector v)
    {
        this.x += v.getVelX();
        this.y += v.getVelY();
    }
}
