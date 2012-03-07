package javax.resource.spi;

import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * An <code>IllegalStateException</code> 
 * is thrown from a method if the callee (resource
 * adapter or application server for system contracts) is in an illegal or
 * inappropriate state for the method invocation.
 *
 * @version 1.0
 * @author Rahul Sharma
 * @author Ram Jeyaraman
 */

public class IllegalStateException extends javax.resource.ResourceException 
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
         serialVersionUID = -150139934550438352L;
      }
      else
      {
         serialVersionUID = 3473092818417322126L;
      }
   }
   
   /**
    * Constructs a new instance with null as its detail message.
    */
   public IllegalStateException() 
   { 
      super(); 
   }

   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public IllegalStateException(String message) 
   {
      super(message);
   }

   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type <code>Throwable</code>.
    */
   public IllegalStateException(Throwable cause) 
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
   public IllegalStateException(String message, Throwable cause) 
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
   public IllegalStateException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
}
