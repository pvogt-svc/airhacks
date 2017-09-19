
package com.airhacks.faema.coffee.boundary;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@TransactionAttribute(TransactionAttributeType.NEVER)
@Stateless
@Path("coffees")
public class CoffeesResource {

    @Inject
    CoffeeService service;

    @Resource
    SessionContext sc;

    @GET
    public String all() {
        return this.service.all();

    }


}
