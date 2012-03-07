package javax.resource.spi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * The SecurityPermission annotation can be used by the developer, as part of
 * the Connector annotation, to specify the extended security permissions
 * required by the resource adapter
 * 
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */

@Documented
@Retention(RUNTIME)
@Target({ })
public @interface SecurityPermission 
{
   /**
    * Specifies an optional description to mention any specific reason that a
    * resource requires a given security permission.
    */
   String[] description() default { };

   /**
    * Specifies a security permission based on the Security policy file syntax.
    * These security permissions are different from those required by the
    * default permission set as specified in the connector specification.
    */
   String permissionSpec() default "";
}
