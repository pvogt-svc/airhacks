
package com.airhacks.faema.coffee.boundary;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author airhacks.com
 */
@TransactionAttribute(TransactionAttributeType.NEVER)
@Stateless
public class CoffeeService {

    public String all() {
        return "espresso " + System.currentTimeMillis();
    }


}
