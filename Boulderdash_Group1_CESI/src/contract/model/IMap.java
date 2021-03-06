package contract.model;

import java.util.ArrayList;
import java.util.Observable;

import contract.model.element.Permeability;
import contract.model.element.mobile.IMobile;

/**
 * 
 * @author HP
 *
 */
public interface IMap {
  
  /**
   * 
   * @return
   */
	public int getWidth();
	
	
	/**
	 * 
	 * @return
	 */
	public int getHeight();
	
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public IElement getOnTheMapXY(int x, int y);
	
	
	/**
s	 * @param x
	 * @param y
	 * @param elem
	 */
	public void setOnTheMapXY(int x, int y, IElement elem);
	
	/** Notifies that the mobile has changed */
	public void setMobileHasChanged();
	
	/** @return The observable */
	public Observable getObservable();
	
	/**
	 * Adds a pawn on the map.
	 * @param pawn The pawn to add.
	 */
	public void addPawn(final IMobile pawn);
	
	/** @return The pawns on the current map */
	public ArrayList<IMobile> getPawns();
	
	/** Decrements the diamond count */
	public void decreaseDiamondCount();
	
	/** Increments the diamond count */
	public void addDiamondCount();
	
	/**
	 * Get DiamondCount
	 * 
	 * @return DiamondCount, number of diamond in the map.
	 */
	public int getDiamondCount();
	
	/** @return The player's character */
	public IMobile getMyCharacter();
	
	/** Sets the player's character 
	 * 
	 * @param character The player's character.
	 */
	public void setMyCharacter(IMobile character);
	
	/** 
	 * @return 
	 * the permeability of the square at the given position 
	 * @param x The x.
	 * @param y The y.
	 */
	public Permeability getSquareIsOccupiedXY(final int x, final int y);
}
