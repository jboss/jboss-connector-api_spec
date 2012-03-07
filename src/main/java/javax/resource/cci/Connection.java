package javax.resource.cci;

import javax.resource.ResourceException;


/** A Connection represents an application-level handle that is used 
 *  by a client to access the underlying physical connection. The actual 
 *  physical connection associated with a Connection instance is 
 *  represented by a ManagedConnection instance.
 *
 *  <p>A client gets a Connection instance by using the 
 *  <code>getConnection</code> method on a <code>ConnectionFactory</code> 
 *  instance. A connection can be associated with zero or more Interaction
 *  instances.
 * 
 *  @author  Rahul Sharma
 *  @version 0.8
 *  @see     javax.resource.cci.ConnectionFactory
 *  @see     javax.resource.cci.Interaction
 **/

public interface Connection 
{
  
   /** Creates an Interaction associated with this Connection. An
    *  Interaction enables an application to execute EIS functions. 
    *
    *  @return  Interaction instance  
    *  @throws  ResourceException     Failed to create an Interaction
    **/
   public Interaction createInteraction() throws ResourceException;

   /** Returns an LocalTransaction instance that enables a component to
    *  demarcate resource manager local transactions on the Connection.
    *  If a resource adapter does not allow a component to demarcate 
    *  local transactions on an Connection using LocalTransaction 
    *  interface, then the method getLocalTransaction should throw a 
    *  NotSupportedException.
    *
    *  @return   LocalTransaction instance
    *           
    *  @throws   ResourceException   Failed to return a LocalTransaction
    *                                instance because of a resource
    *                                adapter error
    *  @throws   javax.resource.NotSupportedException Demarcation of Resource manager 
    *                                local transactions is not supported
    *                                on this Connection
    *  @see javax.resource.cci.LocalTransaction
    **/
   public LocalTransaction getLocalTransaction() throws ResourceException;
  
   /** Gets the information on the underlying EIS instance represented
    *  through an active connection.
    *
    *  @return   ConnectionMetaData instance representing information 
    *            about the EIS instance
    *  @throws   ResourceException  
    *                        Failed to get information about the 
    *                        connected EIS instance. Error can be
    *                        resource adapter-internal, EIS-specific
    *                        or communication related.
    **/
   public ConnectionMetaData getMetaData() throws ResourceException;

   /** Gets the information on the ResultSet functionality supported by
    *  a connected EIS instance.
    *
    *  @return   ResultSetInfo instance
    *  @throws   ResourceException     Failed to get ResultSet related 
    *                                  information
    *  @throws   javax.resource.NotSupportedException ResultSet functionality is not
    *                                  supported
    **/
   public ResultSetInfo getResultSetInfo() throws ResourceException;
  
   /** Initiates close of the connection handle at the application level.
    *  A client should not use a closed connection to interact with 
    *  an EIS.
    *  
    *  @throws  ResourceException  Exception thrown if close
    *                              on a connection handle fails.
    *           <p>Any invalid connection close invocation--example,
    *              calling close on a connection handle that is 
    *              already closed--should also throw this exception.
    *  
    **/
   public void close() throws ResourceException;
}
