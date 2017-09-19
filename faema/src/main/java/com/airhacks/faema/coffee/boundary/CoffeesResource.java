
package com.airhacks.faema.coffee.boundary;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@RequestScoped
@Path("coffees")
public class CoffeesResource {

    @Inject
    CoffeeService service;

    @GET
    public String all() {
        return this.service.all();

    }


}
