package contract.controller;

import java.io.IOException;

import contract.controller.UserOrder;

/**
 * 
 * @author HP
 *
 */

public interface IOrderPerformer {

    /**
     * 
     * @param userOrder
     * @throws IOException
     */
    void orderPerform(UserOrder userOrder) throws IOException;
}
