package contract.model;

import contract.model.IMap;
import contract.model.element.mobile.IMobile;

/**
 * 
 * @author HP
 *
 */
public interface IModel {

    /**
     * 
     * @return
     */
    public IMap getMap();
    
    /** @return the player's character */
    public IMobile getMyCharacter();
    
    /** Makes the pawn follow their strategy */
    public void movePawns();
}
