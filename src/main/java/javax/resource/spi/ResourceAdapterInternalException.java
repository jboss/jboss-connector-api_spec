package javax.resource.spi;

import java.security.AccessController;
import java.security.PrivilegedAction;

/** 
 * A <code>ResourceAdapterInternalException</code> indicates any 
 * system-level error conditions related to a resource adapter. 
 * The common conditions indicated by this exception type are:
 *  <UL>
 *  <LI>Invalid configuration for creation of a new physical connection. An
        example is invalid server name for a target EIS instance.
 *  <LI>Failure to create a physical connection to a EIS instance due to 
 *      communication protocol error or any resource adapter implementation 
 *      specific error.
 *  <LI>Error conditions internal to resource adapter implementation.
 *  </UL>
 *
 * @version 1.0
 * @author Rahul Sharma
 * @author Ram Jeyaraman
 */

public class ResourceAdapterInternalException extends javax.resource.ResourceException 
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
         serialVersionUID = 7184712099852216323L;
      }
      else
      {
         serialVersionUID = -1666678251804763325L;
      }
   }
   
   /**
    * Constructs a new instance with null as its detail message.
    */
   public ResourceAdapterInternalException() 
   { 
      super(); 
   }

   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public ResourceAdapterInternalException(String message) 
   {
      super(message);
   }
   
   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type <code>Throwable</code>.
    */
   public ResourceAdapterInternalException(Throwable cause) 
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
   public ResourceAdapterInternalException(String message, Throwable cause) 
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
   public ResourceAdapterInternalException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
}
