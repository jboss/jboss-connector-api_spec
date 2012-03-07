package javax.resource.spi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Designates a JavaBean as an administered object.Administered objects are
 * specific to a messaging style or message provider.
 * 
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */

@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface AdministeredObject 
{
   
   /**
    * Specifies the Java type of the interface implemented by the administered
    * object.
    */
   Class[] adminObjectInterfaces() default { };
}
