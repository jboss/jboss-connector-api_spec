package javax.resource.spi.work;

import java.io.Serializable;

/**
 * This class serves as a standard mechanism for a resource adapter to propagate
 * an imported context from an enterprise information system to an application
 * server.
 * 
 * <p> A <code>Work</code> instance, that implements the
 * <code>WorkContextProvider</code>, could provide a
 * <code>List</code> of these <code>WorkContext</code> instances
 * (through the getWorkContexts() method), and have them setup as the
 * execution context by the <code>WorkManager</code> when the
 * <code>Work</code> instance gets executed.
 * 
 * The resource adapter must not make any changes to the state of the 
 * <code>WorkContext</code> after the <code>Work</code> instance corresponding 
 * to that <code>WorkContext</code> has been submitted to the <code>WorkManager</code>.
 *
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */

public interface WorkContext extends Serializable
{
   /**
    * Get the associated name of the <code>WorkContext</code>. This could
    * be used by the WorkManager and the resource adapter for debugging
    * purposes.
    * <p>
    * 
    * @return the associated name of the <code>WorkContext</code>
    */
   String getName();
   
   /**
    * Get the brief description of the role played by the
    * <code>WorkContext</code> and any other related debugging information.
    * This could be used by the WorkManager and the resource adapter for
    * debugging purposes.
    * <p>
    * 
    * @return the associated description of the <code>WorkContext</code>
    */
   String getDescription();
}
