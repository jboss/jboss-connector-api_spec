package javax.resource.spi.work;

import javax.resource.spi.RetryableException;

/**
 * A subclass of the <code>WorkRejectedException</code> that 
 * indicates that the the service unavailability is transient. It is thrown in
 * situations where the previously failed operation might be able to succeed if the 
 * resource adapter performs some recovery steps and retries the operation.
 * 
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */
public class RetryableWorkRejectedException extends WorkRejectedException implements RetryableException 
{
   
   /**
    * Determines if a deserialized instance of this class
    * is compatible with this class.
    */
   private static final long serialVersionUID = 8198870267352154108L;
   
   /**
    * Constructs a new instance with null as its detail message.
    */
   public RetryableWorkRejectedException() 
   {
      super();
   }
   
   /**
    * Constructs a new instance with the specified detail message.
    * @param message the detail message.
    */
   public RetryableWorkRejectedException(String message) 
   {
      super(message);
   }
   
   /**
    * Constructs a new throwable with the specified cause.
    * @param cause a chained exception of type <code>Throwable</code>.
    */
   public RetryableWorkRejectedException(Throwable cause) 
   {
      super(cause);
   }
   
   /**
    * Constructs a new throwable with the specified detail message and cause.
    * @param message the detail message.
    * @param cause a chained exception of type <code>Throwable</code>.
    */
   public RetryableWorkRejectedException(String message, Throwable cause)
   {
      super(message, cause);
   }
   
   /**
    * Constructs a new throwable with the specified detail message and
    * an error code.
    * @param message a description of the exception.
    * @param errorCode a string specifying the vendor specific error code.
    */
   public RetryableWorkRejectedException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
}
