
package com.airhacks.faema.coffee.boundary;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

/**
 *
 * @author airhacks.com
 */
@Interceptors(ThreadRenamer.class)
@TransactionAttribute(TransactionAttributeType.NEVER)
@Stateless
public class CoffeeService {

    public String all() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(CoffeeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "espresso " + System.currentTimeMillis();
    }


}
