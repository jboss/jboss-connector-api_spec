package javax.resource.cci;


import javax.resource.ResourceException;

/** The interface <code>ConnectionMetaData</code> provides information 
 *  about an EIS instance connected through a Connection instance. A
 *  component calls the method <code>Connection.getMetaData</code> to
 *  get a <code>ConnectionMetaData</code> instance. 
 *
 *  @version     0.8
 *  @author      Rahul Sharma
 *  @see         javax.resource.cci.Connection
 *  @see         javax.resource.cci.ResultSetInfo
**/

public interface ConnectionMetaData 
{

   /** Returns product name of the underlying EIS instance connected
    *  through the Connection that produced this metadata.
    *
    *  @return   Product name of the EIS instance
    *  @throws   ResourceException  Failed to get the information for
    *                               the EIS instance
    **/
   public String getEISProductName() throws ResourceException;

   /** Returns product version of the underlying EIS instance.
    *
    *  @return   Product version of an EIS instance. 
    *  @throws   ResourceException  Failed to get the information for
    *                               the EIS instance
    **/
   public String getEISProductVersion() throws ResourceException;

   /** Returns the user name for an active connection as known to 
    *  the underlying EIS instance. The name corresponds the resource
    *  principal under whose security context a connection to the
    *  EIS instance has been established.
    *
    *  @return   String representing the user name
    *  @throws   ResourceException  Failed to get the information for
    *                               the EIS instance           
    **/
   public String getUserName() throws ResourceException;
}
