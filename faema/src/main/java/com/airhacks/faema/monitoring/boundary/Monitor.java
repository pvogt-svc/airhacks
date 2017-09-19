
package com.airhacks.faema.monitoring.boundary;

import java.util.concurrent.atomic.AtomicLong;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author airhacks.com
 */
@Startup
@Singleton
@Path("diagnostic")
public class Monitor {

    AtomicLong ESPRESSO = new AtomicLong();

    @GET
    public JsonObject all() {
        return Json.createObjectBuilder().add("espresso", ESPRESSO.get()).build();
    }

    public void espressoDelivered() {
        this.ESPRESSO.incrementAndGet();
    }

    //@Schedule(seconds="/30",minutes="*",hours="*")
    public void averageCalculation() {

    }


}
