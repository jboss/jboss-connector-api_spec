package javax.resource.spi;

/**
 * This is thrown to indicate that a service is unavailable.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public class UnavailableException extends javax.resource.ResourceException 
{
   /** Serial version uid */
   private static final long serialVersionUID = -2495485036033570467L;

   /**
    * Constructs a new instance with null as its detail message.
    */
   public UnavailableException() 
   { 
      super(); 
   }

   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public UnavailableException(String message) 
   {
      super(message);
   }
   
   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type 
    * <code>Throwable</code>.
    */
   public UnavailableException(Throwable cause) 
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
   public UnavailableException(String message, Throwable cause) 
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
   public UnavailableException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
}
