/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keplerslawsprogram;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author charp
 */
public class Trail extends DisplayedObject {
    int diameter;
    Color colour;
    
    /**
     * Creates new Trail with set location, diameter, and colour
     * @param lo Location of Trail
     * @param di Diameter of trail
     * @param co Colour of trail
     */
    Trail(Point lo, int di, Color co)
    {
        super(lo);
        diameter = di;
        colour = co;
    }
    
    @Override
    public void display()
    {
        
    }
}
