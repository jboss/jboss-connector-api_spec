package javax.resource.spi;

import java.beans.PropertyDescriptor;
import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * This exception is thrown to indicate invalid configuration 
 * property settings.
 *
 * @version 0.2
 * @author Ram Jeyaraman
 */
public class InvalidPropertyException extends javax.resource.ResourceException 
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
         serialVersionUID = -2395559483586818078L;
      }
      else
      {
         serialVersionUID = -485903720300735741L;
      }
   }

   /**
    * Holder for invalid properties.
    */
   private PropertyDescriptor[] invalidProperties;

   /**
    * Create a InvalidPropertyException.
    */
   public InvalidPropertyException() 
   {
      super();
   }

   /**
    * Create a InvalidPropertyException.
    *
    * @param message a description of the exception
    */
   public InvalidPropertyException(String message)
   {
      super(message);
   }

   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type <code>Throwable</code>.
    */
   public InvalidPropertyException(Throwable cause) 
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
   public InvalidPropertyException(String message, Throwable cause) 
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
   public InvalidPropertyException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
   
   /**
    * Set a list of invalid properties.
    * @param invalidProperties The invalid properties
    */
   public void setInvalidPropertyDescriptors(PropertyDescriptor[] invalidProperties) 
   {
      this.invalidProperties = invalidProperties;
   }

   /**
    * Get the list of invalid properties.
    * @return The properties
    */
   public PropertyDescriptor[] getInvalidPropertyDescriptors() 
   {
      return this.invalidProperties;
   }
}
