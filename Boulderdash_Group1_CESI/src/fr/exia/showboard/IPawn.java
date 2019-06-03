package fr.exia.showboard;

import java.awt.Point;

/**
 * 
 * @author HP
 *
 */
public interface IPawn extends ISquare {

    /**
     * Gets the x position.
     *
     * @return the x
     */
    int getX();

    /**
     * Gets the y position.
     *
     * @return the y
     */
    int getY();

    /**
     * Gets the position Point(int x, int y).
     *
     * @return the position
     * @see Point
     */
    Point getPosition();
}
