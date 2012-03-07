package javax.resource.spi.work;

/**
 * A standard <code>WorkContext</code> that allows a <code>Work</code>
 * instance to propagate transaction related context information from an EIS to
 * an application server.<p>
 * 
 * This class extends <code>ExecutionContext</code> so that a resource adapter
 * developer could migrate their existing code from
 * <code>ExecutionContext</code> to <code>TransactionContext</code>
 * easily.<p>
 * 
 * @since 1.6
 * @see javax.resource.spi.work.WorkContext
 * @see javax.resource.spi.work.ExecutionContext
 * @version Java EE Connector Architecture 1.6
 */

public class TransactionContext extends ExecutionContext implements WorkContext 
{
   /**
    * Determines if a deserialized instance of this class
    * is compatible with this class.
    */
   private static final long serialVersionUID = 6205067498708597824L;

   /**
    * {@inheritDoc}
    */
   public String getDescription() 
   {
      return "Transaction Context";
   }

   /**
    * {@inheritDoc}
    */
   public String getName() 
   {
      return "TransactionContext";
   }
}
