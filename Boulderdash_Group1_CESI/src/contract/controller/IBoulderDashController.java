package contract.controller;

/**
 * 
 * @author HP
 *
 */
public interface IBoulderDashController {
  

    /**
     * 
     * @throws InterruptedException
     */
    void start() throws InterruptedException;
    

    /**
     * 
     * @return
     */
    IOrderPerformer getOrderPeformer();
}
