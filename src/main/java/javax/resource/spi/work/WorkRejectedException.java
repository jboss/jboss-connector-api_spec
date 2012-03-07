package javax.resource.spi.work;

/**
 * This exception is thrown by a <code>WorkManager</code> to indicate 
 * that a submitted <code>Work</code> instance has been rejected. The 
 * rejection could be due to internal factors or start timeout expiration.
 *
 * <p>This could be thrown only before the execution of a 
 * <code>Work</code> instance starts (that is, before a 
 * thread has been allocated for <code>Work</code> execution).

 * <p>An associated error code indicates the nature of the error condition.
 * Possible error codes are <code>WorkException.START_TIMED_OUT</code>,
 * <code>WorkException.INTERNAL</code> or <code>WorkException.UNDEFINED</code>.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public class WorkRejectedException extends WorkException
{
   /** Serial version uid */
   private static final long serialVersionUID = -687129544691878081L;
   
   /**
    * Constructs a new instance with null as its detail message.
    */
   public WorkRejectedException() 
   {
      super();
   }

   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public WorkRejectedException(String message) 
   {
      super(message);
   }
   
   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type <code>Throwable</code>.
    */
   public WorkRejectedException(Throwable cause) 
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
   public WorkRejectedException(String message, Throwable cause) 
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
   public WorkRejectedException(String message, String errorCode)
   {
      super(message, errorCode);
   }
}
