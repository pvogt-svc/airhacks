
package com.airhacks.faema.coffee.boundary;

import com.airhacks.faema.monitoring.boundary.Monitor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

/**
 *
 * @author airhacks.com
 */
@Interceptors(ThreadRenamer.class)
@TransactionAttribute(TransactionAttributeType.NEVER)
@Stateless
public class CoffeeService {

    @Inject
    Monitor monitor;

    public String all() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(CoffeeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        monitor.espressoDelivered();
        return "espresso " + System.currentTimeMillis();
    }


}
