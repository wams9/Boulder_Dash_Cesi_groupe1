package contract.controller;

import java.util.Random;

/**
 * 
 * @author HP
 *
 */
public enum UserOrder {

	/** The right. */
	RIGHT,

	/** The left. */
	LEFT,

	/** The up. */
	UP,

	/** Down there. */
	DOWN,

	/** The nope. */
	NOP;
	
	/**
	 * 
	 * @return
	 */
	public static UserOrder randomOrder() {
	    int pick = new Random().nextInt(UserOrder.values().length);
	    return UserOrder.values()[pick];
	}

}
