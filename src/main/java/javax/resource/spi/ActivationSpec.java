package javax.resource.spi;

/**
 * This interface serves as a marker. An instance of an ActivationSpec must be a
 * JavaBean and must be serializable. This holds the activation configuration
 * information for a message endpoint.
 * 
 * @version 1.0
 * @author Ram Jeyaraman
 */
public interface ActivationSpec extends ResourceAdapterAssociation 
{
   
   /**
    * This method may be called by a deployment tool to validate the overall
    * activation configuration information provided by the endpoint deployer.
    * This helps to catch activation configuration errors earlier on without
    * having to wait until endpoint activation time for configuration
    * validation. The implementation of this self-validation check behavior is
    * optional.
    * 
    * Note: As of Java EE Connectors 1.6 specification, resource adapter
    *       implementations are recommended to use the annotations or the
    *       XML validation deployment descriptor facilities defined by
    *       the Bean Validation specification to express their validation
    *       requirements of its configuration properties to the
    *       application server.
    *
    * @throws InvalidPropertyException indicates invalid configuration property settings.
    */         
   void validate() throws InvalidPropertyException;
}
