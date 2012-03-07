package javax.resource.spi.work;

import java.io.Serializable;
import java.util.List;

/**
 * This interface specifies the methods a {@link Work Work} instance uses to
 * associate a <code>List</code> of {@link WorkContext WorkContext}
 * instances to be set when the <code>Work</code> instance gets executed by a
 * {@link WorkManager WorkManager}.
 * 
 * <p> A <code>Work</code> instance could optionally implement this interface to
 * indicate to the <code>WorkManager</code>, that the
 * <code>WorkContext</code>s provided by this <code>Work</code> instance
 * through the {@link #getWorkContexts() getWorkContexts} method must be
 * used while setting the execution context of the <code>Work</code> instance.<p>
 * 
 * If the {@link #getWorkContexts() getWorkContexts} method returns an empty List
 * or null, the WorkManager must treat it as if no additional execution contexts
 * are associated with that Work instance.
 *
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */
public interface WorkContextProvider extends Serializable
{
   /**
    * Gets an instance of <code>WorkContexts</code> that needs to be used
    * by the <code>WorkManager</code> to set up the execution context while
    * executing a <code>Work</code> instance.
    * 
    * @return an <code>List</code> of <code>WorkContext</code> instances.
    */
   List<WorkContext> getWorkContexts();
}
