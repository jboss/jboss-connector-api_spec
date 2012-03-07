package javax.resource.spi.work;

/**
 * A common base class for all <code>Work</code> processing related exceptions.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public class WorkException extends javax.resource.ResourceException 
{
   /** Serial version uid */
   private static final long serialVersionUID = 6360106395593829940L;

   /**
    * Indicates an internal error condition.
    */
   public static final String INTERNAL = "-1";
   
   /**
    * Undefined error code.
    */
   public static final String UNDEFINED = "0";
   
   /**
    * Indicates start timeout expiration.
    */
   public static final String START_TIMED_OUT = "1";
   
   /**
    * Indicates that concurrent work within a transaction is
    * disallowed. That is, there is already another <code>Work</code>
    * instance associated with the specified transaction context.
    */
   public static final String TX_CONCURRENT_WORK_DISALLOWED = "2";
   
   /**
    * Indicates a failure in recreating the specified transaction context.
    */
   public static final String TX_RECREATE_FAILED = "3";
   
   /**
    * Constructs a new instance with null as its detail message.
    */
   public WorkException() 
   {
      super();
   }
   
   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public WorkException(String message) 
   {
      super(message);
   }

   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type
    * <code>Throwable</code>.
    */
   public WorkException(Throwable cause) 
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
   public WorkException(String message, Throwable cause) 
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
   public WorkException(String message, String errorCode)
   {
      super(message, errorCode);
   }
}
