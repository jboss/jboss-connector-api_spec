package javax.resource.spi;

import java.util.EventListener;

/**  The <code>ConnectionEventListener</code> interface provides an event
 *   callback mechanism to enable an application server to receive 
 *   notifications from a <code>ManagedConnection</code> instance. 
 *
 *   <p>An application server uses these event notifications to manage 
 *   its connection pool, to clean up any invalid or terminated connections
 *   and to manage local transactions.
 *
 *   <p>An application server implements the 
 *   <code>ConnectionEventListener</code> interface. It registers a connection 
 *   listener with a <code>ManagedConnection</code> instance by using 
 *   <code>ManagedConnection.addConnectionEventListener</code> method.
 *  
 *   @version     0.5
 *   @author      Rahul Sharma
 *
 *   @see         javax.resource.spi.ConnectionEvent
 **/

public interface ConnectionEventListener extends EventListener 
{
   
   /** Notifies that an application component has closed the connection.
    *
    *  <p>A ManagedConnection instance notifies its registered set of 
    *  listeners by calling ConnectionEventListener.connectionClosed method
    *  when an application component closes a connection handle. The 
    *  application server uses this connection close event to put the
    *  ManagedConnection instance back in to the connection pool.
    *
    *  @param    event     event object describing the source of 
    *                      the event
    */
   public void connectionClosed(ConnectionEvent event);
   
   /** Notifies that a Resource Manager Local Transaction was started on
    *  the ManagedConnection instance.
    *
    *  @param    event     event object describing the source of 
    *                      the event
    */
   public void localTransactionStarted(ConnectionEvent event);
   
   /** Notifies that a Resource Manager Local Transaction was committed 
    *  on the ManagedConnection instance.
    *
    *  @param    event     event object describing the source of 
    *                      the event
    */
   public void localTransactionCommitted(ConnectionEvent event);
   
   /** Notifies that a Resource Manager Local Transaction was rolled back 
    *  on the ManagedConnection instance.
    *
    *  @param    event     event object describing the source of 
    *                      the event
    */
   public void localTransactionRolledback(ConnectionEvent event);
   
   /** Notifies a connection related error. 
    *  The ManagedConnection instance calls the method
    *  ConnectionEventListener.connectionErrorOccurred to notify 
    *  its registered listeners of the occurrence of a physical 
    *  connection-related error. The event notification happens 
    *  just before a resource adapter throws an exception to the 
    *  application component using the connection handle.
    *
    *  The connectionErrorOccurred method indicates that the 
    *  associated ManagedConnection instance is now invalid and 
    *  unusable. The application server handles the connection 
    *  error event notification by initiating application 
    *  server-specific cleanup (for example, removing ManagedConnection 
    *  instance from the connection pool) and then calling
    *  ManagedConnection.destroy method to destroy the physical 
    *  connection.
    *
    * @param     event     event object describing the source of 
    *                      the event
    */
   public void connectionErrorOccurred(ConnectionEvent event);
}
