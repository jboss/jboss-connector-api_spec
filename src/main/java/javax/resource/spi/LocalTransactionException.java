package javax.resource.spi;

import java.security.AccessController;
import java.security.PrivilegedAction;

/** 
 * A <code>LocalTransactionException</code> represents various 
 * error conditions related to the local transaction management contract. 
 * The Java Transaction API specification specifies the 
 * <code>javax.transaction.xa.XAException</code> class for exceptions 
 * related to XAResource based transaction management contract. 
 *  
 * <p>The <code>LocalTransactionException</code> is used for the local 
 * transaction management contract to indicate the following common 
 * error conditions:
 *  <UL>
 *  <LI>Invalid transaction context when a transaction operation is executed. 
 *      For example, calling <code>commit</code> method on 
 *      <code>LocalTransaction</code> object without an active
 *      local transaction is an error condition.
 *  <LI>Transaction is rolled back instead of getting committed during a 
 *      <code>commit</code> method call on the <code>LocalTransaction</code> 
 *      object.
 *  <LI>An attempt to start a local transaction from the same thread on a
 *      <code>ManagedConnection</code> that is already associated with
 *      an active local transaction.
 *  <LI>Any resource adapter or resource manager specific error conditions 
 *      related to local transaction management. Examples are violation of 
 *      integrity of resources, deadlock detection, communication failure 
 *      during transaction completion, retry required or any internal error
 *      in a resource manager.
 *  </UL>
 *
 * @version 1.0
 * @author Rahul Sharma
 * @author Ram Jeyaraman
 */

public class LocalTransactionException extends javax.resource.ResourceException 
{
   /** Serial version uid */
   private static final long serialVersionUID;

   static
   {
      Boolean legacy = (Boolean)AccessController.doPrivileged(new PrivilegedAction()
      {
         public Boolean run()
         {
            try
            {
               if (System.getProperty("org.jboss.j2ee.LegacySerialization") != null)
                  return Boolean.TRUE;
            }
            catch (Throwable ignored)
            {
               // Ignore
            }
            return Boolean.FALSE;
         }
      });

      if (Boolean.TRUE.equals(legacy))
      {
         serialVersionUID = 4704131764458675746L;
      }
      else
      {
         serialVersionUID = 7495828853103281459L;
      }
   }
   
   /**
    * Constructs a new instance with null as its detail message.
    */
   public LocalTransactionException() 
   { 
      super();
   }

   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public LocalTransactionException(String message) 
   {
      super(message);
   }
   
   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type <code>Throwable</code>.
    */
   public LocalTransactionException(Throwable cause) 
   {
      super(cause);
   }
   
   /**
    * Constructs a new throwable with the specified detail message and cause.
    *
    * @param message the detail message.
    *
    * @param cause a chained exception of type <code>Throwable</code>.
    */
   public LocalTransactionException(String message, Throwable cause) 
   {
      super(message, cause);
   }
   
   /**
    * Constructs a new throwable with the specified detail message and
    * an error code.
    *
    * @param message a description of the exception.
    * @param errorCode a string specifying the vendor specific error code.
    */
   public LocalTransactionException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
}
