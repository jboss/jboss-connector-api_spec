package javax.resource.spi.work;

import java.util.EventListener;

/**
 * This models a <code>WorkListener</code> instance which would be notified
 * by the <code>WorkManager</code> when the various <code>Work</code> 
 * processing events (work accepted, work rejected, work started, 
 * work completed) occur.
 *
 * The <code>WorkListener</code> instance must not make any thread 
 * assumptions and must be thread-safe ie., a notification could 
 * occur from any arbitrary thread. Further, it must not make any
 * assumptions on the ordering of notifications.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public interface WorkListener extends EventListener 
{
   
   /** 
    * Invoked when a <code>Work</code> instance has been accepted.
    * @param e A <code>WorkEvent</code> object that provides more 
    * information about the accepted Work.
    */
   void workAccepted(WorkEvent e);
   
   /** 
    * Invoked when a <code>Work</code> instance has been rejected.
    * @param e A <code>WorkEvent</code> object that provides more 
    * information about the accepted Work.
    */
   void workRejected(WorkEvent e);
   
   /** 
    * Invoked when a <code>Work</code> instance has started execution.
    * This only means that a thread has been allocated.
    * @param e A <code>WorkEvent</code> object that provides more 
    * information about the accepted Work.
    */
   void workStarted(WorkEvent e);
   
   /** 
    * Invoked when a <code>Work</code> instance has completed execution.
    * @param e A <code>WorkEvent</code> object that provides more 
    * information about the accepted Work.
    */
   void workCompleted(WorkEvent e);
}
