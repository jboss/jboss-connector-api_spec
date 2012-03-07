package javax.resource.cci;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/** 
 *  Streamable interface enables a resource adapter to extract data from
 *  an input Record or set data into an output Record as a stream of 
 *  bytes. 
 *
 *  <p>The Streamable interface provides a resource adapter's view
 *  of the data that has been set in a Record instance by a component.
 *  
 *  <p>The Streamable interface is not directly used by a component. It
 *  is used by a resource adapter implementation. A component uses Record 
 *  or any derived interfaces to manage records.
 *
 *  @author Rahul Sharma
 *  @since  0.8
 *  @see    javax.resource.cci.Record
**/
public interface Streamable 
{
   /** 
    *  Read data from an InputStream and initialize fields of a 
    *  Streamable object. 
    *
    *  @param  istream   InputStream that represents a resource
    *                    adapter specific internal representation
    *                    of fields of a Streamable object
    *  @exception IOException If an error occurs
    **/
   public void read(InputStream istream) throws IOException;
  
   /** 
    *  Write fields of a Streamable object to an OutputStream
    *  @param  ostream   OutputStream that holds value of a
    *                    Streamable object
    *  @exception IOException If an error occurs
    **/
   public void write(OutputStream ostream) throws IOException;
}

