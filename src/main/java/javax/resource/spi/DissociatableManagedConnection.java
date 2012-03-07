package javax.resource.spi;

import javax.resource.ResourceException;

/**
 * This is a mix-in interface that may be optionally implemented by a 
 * <code>ManagedConnection</code> implementation. An implementation of
 * this interface must support the lazy connection association optimization.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public interface DissociatableManagedConnection 
{
   
   /**
    * This method is called by an application server (that is capable of
    * lazy connection association optimization) in order to dissociate
    * a <code>ManagedConnection</code> instance from all of its connection
    * handles.
    *
    * @throws ResourceException generic exception if operation fails.
    *
    * @throws ResourceAdapterInternalException
    *            resource adapter internal error condition
    * @throws IllegalStateException
    *         Illegal state for dissociating a
    *         <code>ManagedConnection</code> from all of its connection
    *         handles.
    */
   void dissociateConnections() throws ResourceException;
}
