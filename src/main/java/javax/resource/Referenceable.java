package javax.resource;

import javax.naming.Reference;

/** The Referenceable interface extends the javax.naming.Referenceable
 *  interface. It enables support for JNDI Reference mechanism for 
 *  the registration of the connection factory in the JNDI name space. 
 *  Note that the implementation and structure of Reference is specific
 *  to an application server.
 *
 *  <p>The implementation class for a connection factory interface is 
 *  required to implement both java.io.Serializable and 
 *  javax.resource.Referenceable interfaces to support JNDI registration.
 *
 *  @version     0.9
 *  @author      Rahul Sharma
 *
**/

public interface Referenceable extends javax.naming.Referenceable 
{
   /** Sets the Reference instance. This method is called by the
    *  deployment code to set the Reference that can be later
    *  returned by the getReference method (as defined in the
    *  javax.naming.Referenceable interface).
    *
    *  @param   reference  A Reference instance
    *  @see     javax.naming.Referenceable#getReference
    *
    **/
   public void setReference(Reference reference);
}
