package contract.view;

/**
 * 
 * @author HP
 *
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    /**
     * Follow myCharacter.
     */
    void followMyCharacter();
    
    /**
     * Refreshes and redraws elements on the board
     */
    void updateBoardFrame();
}
