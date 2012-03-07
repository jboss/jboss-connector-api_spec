package javax.resource.spi;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Designates a JavaBean property as a configuration property
 * 
 * @since 1.6
 * @version Java EE Connector Architecture 1.6
 */

@Documented
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface ConfigProperty 
{
   /**
    * Inferred by the container if unspecified.
    */
   Class type() default Object.class;

   /**
    * Description of the configuration property
    */
   String[] description() default { };
   
   /**
    * Inferred by the container for field based annotations if possible
    */
   String defaultValue() default "";
   
   /**
    * Indicates that the configuration tools must ignore considering this
    * Property during auto-discovery of Configuration properties.
    */
   boolean ignore() default false;

   /**
    * Indicates that the configuration property supports
    * dynamic updates to its value during the lifetime of
    * the JavaBean
    */
   boolean supportsDynamicUpdates() default false;
   
   /**
    * Indicates that the configuration property is confidential and
    * recommends application server's configuration tools to 
    * use special visual aids for editing them. 
    */
   boolean confidential() default false;
}
