
package com.airhacks.faema.logging.boundary;

/**
 *
 * @author airhacks.com
 */
public interface Audit {

    void log(int patientenId, int alter, String description);

}
