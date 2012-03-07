package javax.resource.spi;

import javax.resource.ResourceException;

/** The ManagedConnectionMetaData interface provides information about the 
 *  underlying EIS instance associated with a ManagedConnection instance.
 *  An application server uses this information to get runtime information
 *  about a connected EIS instance.
 *
 *  <p>The method ManagedConnection.getMetaData returns a 
 *  ManagedConnectionMetaData instance.
 *  
 *  @version     0.8
 *  @author      Rahul Sharma
 *  @see         javax.resource.spi.ManagedConnection
**/

public interface ManagedConnectionMetaData 
{
   
   /** Returns Product name of the underlying EIS instance connected 
    *  through the ManagedConnection.
    *
    *  @return  Product name of the EIS instance.
    *  @exception ResourceException Thrown if an error occurs
    **/
   public String getEISProductName() throws ResourceException;
   
   /** Returns product version of the underlying EIS instance connected 
    *  through the ManagedConnection.
    *
    *  @return  Product version of the EIS instance
    *  @exception ResourceException Thrown if an error occurs
    **/
   public String getEISProductVersion() throws ResourceException;
   
   /** Returns maximum limit on number of active concurrent connections 
    *  that an EIS instance can support across client processes. If an EIS 
    *  instance does not know about (or does not have) any such limit, it 
    *  returns a 0.
    *
    *  @return  Maximum limit for number of active concurrent connections
    *  @exception ResourceException Thrown if an error occurs
    **/
   public int getMaxConnections() throws ResourceException;
  
   /** Returns name of the user associated with the ManagedConnection
    *  instance. The name corresponds to the resource principal under whose
    *  whose security context, a connection to the EIS instance has been
    *  established.
    *
    *  @return  name of the user
    *  @exception ResourceException Thrown if an error occurs
    **/
   public String getUserName() throws ResourceException;
}
