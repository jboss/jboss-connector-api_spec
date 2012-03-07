package javax.resource.spi.work;

/**
 * This exception is thrown by a <code>WorkManager</code> to indicate that
 * a submitted <code>Work</code> instance has completed with an exception.
 *
 * <p>This could be thrown only after the execution of a
 * <code>Work</code> instance has started (that is, after a thread has
 * been allocated for <code>Work</code> execution). The allocated thread sets
 * up an execution context (if it has been specified), and then calls 
 * <code>Work.run()</code>.
 *
 * <p>Any exception thrown during execution context setup or during
 * <code>Work</code> execution (that is, during <code>Work.run()</code>) is
 * chained within this exception. 
 *
 * <p>An associated error code indicates the nature of the error condition.
 * Possible error codes are <code>WorkException.TX_RECREATE_FAILED</code>,
 * <code>WorkException.TX_CONCURRENT_WORK_DISALLOWED</code> or 
 * <code>WorkException.UNDEFINED</code>.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public class WorkCompletedException extends WorkException 
{
   /** Serial version uid */
   private static final long serialVersionUID = -229158982387790244L;

   /**
    * Constructs a new instance with null as its detail message.
    */
   public WorkCompletedException() 
   {
      super();
   }

   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public WorkCompletedException(String message)
   {
      super(message);
   }

   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type 
    * <code>Throwable</code>.
    */
   public WorkCompletedException(Throwable cause) 
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
   public WorkCompletedException(String message, Throwable cause) 
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
   public WorkCompletedException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
}
