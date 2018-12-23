/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keplerslawsprogram;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author charp
 */
public class KeplersLawsProgram {
    public static ArrayList<Body> bodies = new ArrayList();
    final static double G = 1;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bodies.add(new Body(new Point(0, 1), 1, new Vector(0, 0)));
        bodies.add(new Body(new Point(0, 0), 0.1, new Vector(0, 0)));
        while (true)
        {
            for(Body body : bodies)
            {
                body.move();
            }
            
            for(int i = 0; i < bodies.size(); i++)
            {
                bodies.get(i).updateVector(bodies);
                System.out.println(i + " X: " + bodies.get(i).getVector().getVelX() + "  Y: " + bodies.get(i).getVector().getVelY());
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
    
}
