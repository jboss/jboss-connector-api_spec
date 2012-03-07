package javax.resource.spi;

/**
 * This is thrown to indicate a connection sharing violation. 
 *
 * <p>This may be thrown by a resource adapter when an application 
 * uses a shareable connection in an unshareable manner.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public class SharingViolationException extends javax.resource.ResourceException 
{
   /** Serial version uid */
   private static final long serialVersionUID = -1280304091132682215L;

   /**
    * Constructs a new instance with null as its detail message.
    */
   public SharingViolationException() 
   { 
      super(); 
   }

   /**
    * Constructs a new instance with the specified detail message.
    *
    * @param message the detail message.
    */
   public SharingViolationException(String message) 
   {
      super(message);
   }
   
   /**
    * Constructs a new throwable with the specified cause.
    *
    * @param cause a chained exception of type 
    * <code>Throwable</code>.
    */
   public SharingViolationException(Throwable cause) 
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
   public SharingViolationException(String message, Throwable cause) 
   {
      super(message, cause);
   }

   /**
    * Constructs a new throwable with the specified detail message and
    * error code.
    *
    * @param message a description of the exception.
    * @param errorCode a string specifying the vendor specific error code.
    */
   public SharingViolationException(String message, String errorCode) 
   {
      super(message, errorCode);
   }
}
