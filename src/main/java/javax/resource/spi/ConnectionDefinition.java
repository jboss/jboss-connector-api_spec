package javax.resource.spi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Defines a set of connection interfaces and classes pertaining to a particular
 * connection type. This annotation can be placed only on a JavaBean that
 * implements the {@link ManagedConnectionFactory ManagedConnectionFactory}
 * interface.
 * 
 * @since 1.6
 * 
 * @version Java EE Connector Architecture 1.6
 */

@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface ConnectionDefinition 
{

   /**
    * Specifies the ConnectionFactory interface supported by the resource
    * adapter. Example: javax.resource.cci.ConnectionFactory or
    * com.wombat.ConnectionFactory
    */
   Class connectionFactory();
   
   /**
    * Specifies the Class provided by the resource adapter that implements the
    * resource adapter specific ConnectionFactory interface. Example:
    * com.wombat.ConnectionFactoryImpl
    */
   Class connectionFactoryImpl();
   
   /**
    * Specifies the Connection interface supported by the resource adapter.
    * Example: javax.resource.cci.Connection or com.wombat.Connection
    */
   Class connection();
   
   /**
    * Specifies the class provided by the resource adapter that implements the
    * resource adapter specific Connection interface. Example:
    * com.wombat.ConnectionImpl
    */
   Class connectionImpl();
}
