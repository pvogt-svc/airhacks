
package com.airhacks.faema.coffee.boundary;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author airhacks.com
 */
@RequestScoped
public class CoffeeService {

    public String all() {
        return "espresso " + System.currentTimeMillis();
    }


}
