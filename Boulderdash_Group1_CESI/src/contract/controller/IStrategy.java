package contract.controller;

import contract.model.IMap;
import contract.model.element.mobile.IMobile;

/**
 * 
 * @author HP
 *
 */
public interface IStrategy {
  
  /**
   * 
   * @param currentPawn
   * @param map
   */
  public void followStrategy(IMobile currentPawn, IMap map);
}
