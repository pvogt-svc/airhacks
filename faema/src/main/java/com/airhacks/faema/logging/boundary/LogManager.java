
package com.airhacks.faema.logging.boundary;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author airhacks.com
 */
public class LogManager {

    @Produces
    public Audit expose(InjectionPoint ip) {
        String name = ip.getMember().getDeclaringClass().getName();
        return (int patientenId, int alter, String description) -> {
            Logger.getLogger(name).info(description + patientenId + alter);
        };
    }


}
