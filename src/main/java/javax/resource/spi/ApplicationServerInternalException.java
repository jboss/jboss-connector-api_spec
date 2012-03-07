package javax.resource.spi;

import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * An <code>ApplicationServerInternalException</code> is thrown 
 * by an application 
 * server to indicate error conditions specific to an application server.
 * These error conditions can be related to either configuration related
 * errors or implementation of mechanisms internal to an application server
 * (example: connection pooling, thread management).
 * 
 * @version 1.0
 * @author Rahul Sharma
 * @author Ram Jeyaraman
 */

public class ApplicationServerInternalException extends javax.resource.ResourceException 
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
         serialVersionUID = -7496452174776833078L;
      }
      else
      {
         serialVersionUID = -7784532393279374430L;
      }
   }
   
   /**
    * Constructs a new instance with null as its detail message.
    */
   public ApplicationServerInternalException() 
   { 
      super();
   }

   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public ApplicationServerInternalException(String message) 
   {
      super(message);
   }
   
   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type 
    * <code>Throwable</code>.
    */
   public ApplicationServerInternalException(Throwable cause)
   {
      super(cause);
   }

   /**
    * Constructs a new throwable with the specified detail message and cause.
    *
    * @param message the detail message.
    *
    * @param cause a chained exception of type 
    * <code>Throwable</code>.
    */
   public ApplicationServerInternalException(String message, Throwable cause)
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
   public ApplicationServerInternalException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
}
