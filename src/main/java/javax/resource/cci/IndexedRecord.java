package javax.resource.cci;

/** IndexedRecord represents an ordered collection of record elements 
 *  based on the <code>java.util.List</code> interface. This interface 
 *  allows a client to access elements by their integer index (position
 *  in the list) and search for elements in the List.
 *
 *  @author  Rahul Sharma
 *  @since   0.8
**/
public interface IndexedRecord extends Record, java.util.List, java.io.Serializable 
{

}
