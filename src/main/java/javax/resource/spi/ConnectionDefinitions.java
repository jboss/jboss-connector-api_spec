package javax.resource.spi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Defines a set of connection definitions that the JavaBean, that has been
 * annotated with this annotation, is a part of. This annotation can be placed
 * only on a JavaBean that implements the {@link ManagedConnectionFactory
 * ManagedConnectionFactory} interface.
 * 
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */

@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface ConnectionDefinitions 
{
   
   /**
    * An array of {@link ConnectionDefinition ConnectionDefinition}s associated
    * with the <code>ManagedConectionFactory</code> JavaBean.
    * 
    * @return an array of <code>ConnectionDefinition</code>s associated with
    * the <code>ManagedConnectionFactory</code> instance.
    */
   ConnectionDefinition[] value();
}
