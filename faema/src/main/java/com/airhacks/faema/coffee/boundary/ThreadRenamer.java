
package com.airhacks.faema.coffee.boundary;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author airhacks.com
 */
public class ThreadRenamer {

    @AroundInvoke
    public Object renameThread(InvocationContext ic) throws Exception {
        String origin = Thread.currentThread().getName();
        String methodName = ic.getMethod().toString();
        String threadName = origin + "->" + methodName;
        try {
            Thread.currentThread().setName(threadName);
            return ic.proceed();
        } finally {
            Thread.currentThread().setName(origin);
        }
    }

}
