package javax.resource.spi.work;

/**
 * This interface models a <code>WorkManager</code> that supports distributed
 * execution of Work instances.
 * 
 * <p> A <code>DistributableWorkManager</code> may choose to distribute a
 * <code>Work</code> instance submitted by a resource adapter to another
 * <code>WorkManager</code> instance running in a different Java virtual 
 * machine (that is running in the same host or different hosts) for 
 * achieving optimal resource utilization or for providing better 
 * response times.
 * 
 * <p> A <code>WorkManager</code> implementation that supports the submission 
 * of <code>DistributableWork</code> instances must implement the
 * <code>DistributableWorkManager</code> marker interface.
 * 
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */
public interface DistributableWorkManager extends WorkManager 
{
}
