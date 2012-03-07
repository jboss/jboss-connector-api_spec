package javax.resource.cci;

import javax.resource.ResourceException;

/** 
 * This serves as a request-response message listener type that message
 * endpoints (message-driven beans) may implement. This allows an EIS to
 * communicate with an endpoint using a request-response style.
 *
 *  @author  Ram Jeyaraman
 *  @version 1.0
 */    
public interface MessageListener
{
   /**
    * This method allows an EIS to call a message endpoint using a 
    * request-response style communication.
    *
    * @param inputData a <code>Record</code> instance.
    *
    * @return a <code>Record</code> instance or null.
    *
    * @throws ResourceException indicates an exceptional condition.
    */
   Record onMessage(Record inputData) throws ResourceException;
}
