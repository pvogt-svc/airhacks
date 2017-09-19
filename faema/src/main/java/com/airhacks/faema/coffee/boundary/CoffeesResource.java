
package com.airhacks.faema.coffee.boundary;

import com.airhacks.faema.logging.boundary.Audit;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
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
@Singleton
@Path("coffees")
public class CoffeesResource {

    @Inject
    Audit audit;

    @Inject
    CoffeeService service;

    @Resource
    SessionContext sc;

    @GET
    public String all() {
        audit.log(42, 18, "all coffeees");
        return this.service.all();

    }


}
