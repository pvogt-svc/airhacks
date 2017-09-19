
package com.airhacks.faema.coffee.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Path("coffees")
public class CoffeesResource {

    @GET
    public String all() {

        return "cappuccino,xyz";

    }


}
