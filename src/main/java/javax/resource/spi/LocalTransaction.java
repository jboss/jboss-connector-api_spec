package javax.resource.spi;

import javax.resource.ResourceException;

/** LocalTransaction interface provides support for transactions that
 *  are managed internal to an EIS resource manager, and do not require
 *  an external transaction manager.
 * 
 *  <p>A resource adapter implements the javax.resource.spi.LocalTransaction 
 *  interface to provide support for local transactions that are performed
 *  on the underlying resource manager.
 *
 *  <p>If a resource adapter supports the LocalTransaction interface, then 
 *  the application server can choose to perform local transaction 
 *  optimization (uses local transaction instead of a JTA transaction for
 *  a single resource manager case).
 *
 *  @version     0.5
 *  @author      Rahul Sharma
 *  @see         javax.resource.spi.ManagedConnection
 **/
public interface LocalTransaction 
{
   /** Begin a local transaction
    *  
    *  @throws  ResourceException   generic exception if operation fails
    *  @throws  LocalTransactionException  
    *                               error condition related 
    *                               to local transaction management
    *  @throws  ResourceAdapterInternalException
    *                               error condition internal to resource
    *                               adapter
    *  @throws  EISSystemException  EIS instance specific error condition        
    **/
   public void begin() throws ResourceException;

   /** Commit a local transaction 
    *
    *  @throws  ResourceException   generic exception if operation fails
    *  @throws  LocalTransactionException  
    *                               error condition related 
    *                               to local transaction management
    *  @throws  ResourceAdapterInternalException
    *                               error condition internal to resource
    *                               adapter
    *  @throws  EISSystemException  EIS instance specific error condition        
    **/
   public void commit() throws ResourceException;
  
   /** Rollback a local transaction
    *  @throws  ResourceException   generic exception if operation fails
    *  @throws  LocalTransactionException  
    *                               error condition related 
    *                               to local transaction management
    *  @throws  ResourceAdapterInternalException
    *                               error condition internal to resource
    *                               adapter
    *  @throws  EISSystemException  EIS instance specific error condition        
    **/
   public void rollback() throws ResourceException;
}
