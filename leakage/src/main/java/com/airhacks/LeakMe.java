
package com.airhacks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author airhacks.com
 */
public class LeakMe {
    
    private static List<Date> garbage = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            garbage.add(new Date());
            Thread.sleep(10);
        }
    }

}
