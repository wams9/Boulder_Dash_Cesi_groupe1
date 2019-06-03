package contract.model;

import java.awt.Image;

import contract.model.element.Permeability;
import contract.model.element.Sprite;
import fr.exia.showboard.ISquare;

/**
 * 
 * @author HP
 *
 */
public interface IElement extends ISquare {

    /**
     * 
     * @return
     */
    Sprite getSprite();

    /**
     * 
     * @return
     */
    Permeability getPermeability();

    /**
     * 
     */
    Image getImage();

}
