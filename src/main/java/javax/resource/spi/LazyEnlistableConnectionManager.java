package javax.resource.spi;

import javax.resource.ResourceException;

/**
 * This is a mix-in interface that may be optionally implemented by a 
 * <code>ConnectionManager</code> implementation. An implementation of
 * this interface must support the lazy transaction enlistment optimization.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public interface LazyEnlistableConnectionManager 
{
   
   /**
    * This method is called by a resource adapter (that is capable of
    * lazy transaction enlistment optimization) in order to lazily enlist
    * a connection object with a XA transaction. 
    *
    * @param mc The <code>ManagedConnection</code> instance that needs to be
    * lazily associated.
    *
    * @throws  ResourceException Generic exception.
    *
    * @throws  ApplicationServerInternalException 
    *                            Application server specific exception.
    *
    * @throws  ResourceAllocationException
    *                            Failed to allocate system resources for
    *                            connection request.
    *
    * @throws  ResourceAdapterInternalException
    *                            Resource adapter related error condition.
    */
   void lazyEnlist(ManagedConnection mc) throws ResourceException;
}
