package javax.resource.spi.work;

/**
 * This class is provided as a convenience for easily creating 
 * <code>WorkListener</code> instances by extending this class
 * and overriding only those methods of interest.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public class WorkAdapter implements WorkListener 
{
   
   /** 
    * Invoked when a <code>Work</code> instance has been accepted.
    * @param e The work event
    */
   public void workAccepted(WorkEvent e) 
   {
   }
   
   /** 
    * Invoked when a <code>Work</code> instance has been rejected.
    * @param e The work event
    */
   public void workRejected(WorkEvent e) 
   {
   }
   
   /** 
    * Invoked when a <code>Work</code> instance has started execution.
    * This only means that a thread has been allocated.
    * @param e The work event
    */
   public void workStarted(WorkEvent e) 
   {
   }
   
   /** 
    * Invoked when a <code>Work</code> instance has completed execution.
    * @param e The work event
    */
   public void workCompleted(WorkEvent e) 
   {
   }
}
