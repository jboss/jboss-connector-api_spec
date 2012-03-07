package javax.resource.spi;

import java.io.Serializable;

/**
 * A marker interface indicating that the Exception is transient. It is used
 * in situations where a previously failed operation might be able to succeed 
 * if the resource adapter performs some recovery steps and retries the
 * operation.
 * 
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */
public interface RetryableException extends Serializable 
{
}
