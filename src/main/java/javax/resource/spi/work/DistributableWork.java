package javax.resource.spi.work;

import java.io.Serializable;

/**
 * This models a <code>Work</code> instance that would be distributed by a 
 * <code>DistributableWorkManager</code> for execution in a remote 
 * <code>DistributableWorkManager</code>
 *
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */
public interface DistributableWork extends Work, Serializable 
{
}
