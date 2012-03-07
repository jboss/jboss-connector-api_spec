package javax.resource.spi;

import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * An <code>EISSystemException</code> is used to indicate any EIS
 * specific system-level 
 * error conditions. The common error conditions are: failure or inactivity of
 * an EIS instance, communication failure and EIS specific error in the 
 * creation of a new physical connection. 
 * 
 * @version 1.0
 * @author Rahul Sharma
 * @author Ram Jeyaraman
 */

public class EISSystemException extends javax.resource.ResourceException 
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
         serialVersionUID = 5912222091656752433L;
      }
      else
      {
         serialVersionUID = 5753172122428814004L;
      }
   }
   
   /**
    * Constructs a new instance with null as its detail message.
    */
   public EISSystemException()
   {
      super();
   }

   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public EISSystemException(String message) 
   {
      super(message);
   }
   
   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type <code>Throwable</code>.
    */
   public EISSystemException(Throwable cause) 
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
   public EISSystemException(String message, Throwable cause) 
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
   public EISSystemException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
}
