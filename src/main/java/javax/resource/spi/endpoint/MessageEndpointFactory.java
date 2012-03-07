package javax.resource.spi.endpoint;

import javax.resource.spi.UnavailableException;
import javax.transaction.xa.XAResource;

/**
 * This serves as a factory for creating message endpoints.
 *
 * @version 1.0
 * @author  Ram Jeyaraman
 */
public interface MessageEndpointFactory 
{
   /**
    * This is used to create a message endpoint. The message endpoint is
    * expected to implement the correct message listener type.
    *
    * @param xaResource an optional <code>XAResource</code> 
    * instance used to get transaction notifications when the message delivery
    * is transacted.
    *
    * @return a message endpoint instance.
    *
    * @throws UnavailableException indicates a transient failure
    * in creating a message endpoint. Subsequent attempts to create a message
    * endpoint might succeed.
    */
   MessageEndpoint createEndpoint(XAResource xaResource)
      throws UnavailableException;
   
   /**
    * This is used to create a message endpoint. The message endpoint is
    * expected to implement the correct message listener type.
    *
    * @param xaResource an optional <code>XAResource</code> 
    * instance used to get transaction notifications when the message delivery
    * is transacted.
    * 
    * @param timeout an optional value used to specify the time duration
    * (in milliseconds) within which the message endpoint needs to be
    * created by the <code>MessageEndpointFactory</code>. Otherwise, the
    * <code>MessageEndpointFactory</code> rejects the creation of the
    * <code>MessageEndpoint</code> with an UnavailableException.  Note, this
    * does not offer real-time guarantees.
    * 
    * @return a message endpoint instance.
    *
    * @throws UnavailableException indicates a transient failure
    * in creating a message endpoint. Subsequent attempts to create a message
    * endpoint might succeed.
    */
   MessageEndpoint createEndpoint(XAResource xaResource, long timeout)
      throws UnavailableException;

   /**
    * This is used to find out whether message deliveries to a target method
    * on a message listener interface that is implemented by a message 
    * endpoint will be transacted or not. 
    *
    * The message endpoint may indicate its transacted delivery preferences 
    * (at a per method level) through its deployment descriptor. The message 
    * delivery preferences must not change during the lifetime of a 
    * message endpoint. 
    * 
    * @param method description of a target method. This information about
    * the intended target method allows an application server to find out 
    * whether the target method call will be transacted or not.
    *
    * @throws NoSuchMethodException indicates that the specified method
    * does not exist on the target endpoint.
    *
    * @return true, if message endpoint requires transacted message delivery.
    */
   boolean isDeliveryTransacted(java.lang.reflect.Method method)
      throws NoSuchMethodException;
}
