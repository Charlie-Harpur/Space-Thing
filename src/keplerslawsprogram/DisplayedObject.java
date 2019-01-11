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
public abstract class DisplayedObject {
    private Point location;
    
    /**
     * Creates new DisplayedObject at the origin
     */
    DisplayedObject()
    {
        location = new Point(0, 0);
    }
    
    /**
     * Creates new DisplayedObject at set location
     * @param lo Location of DisplayedObject
     */
    DisplayedObject(Point lo)
    {
        location = lo;
    }
    
    /**
     * Gets location of DisplayedObject
     * @return location
     */
    public Point getLocation()
    {
        return location;
    }
    
    public void setLocation(Point point)
    {
        location = point;
    }
    
    abstract void display();
}
