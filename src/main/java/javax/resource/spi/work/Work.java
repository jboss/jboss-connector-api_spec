package javax.resource.spi.work;

/**
 * This models a <code>Work</code> instance that would be executed by a 
 * <code>WorkManager</code> upon submission.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public interface Work extends Runnable 
{
   
   /**
    * The <code>WorkManager</code> might call this method to hint the
    * active <code>Work</code> instance to complete execution as soon as 
    * possible. This would be called on a seperate thread other than the
    * one currently executing the <code>Work</code> instance.
    */
   void release();
}
