
package com.airhacks.faema.coffee.boundary;

import javax.ejb.Stateless;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class CoffeeService {

    public String all() {
        return "espresso " + System.currentTimeMillis();
    }


}
