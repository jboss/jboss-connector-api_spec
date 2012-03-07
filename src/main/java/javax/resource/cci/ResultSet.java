package javax.resource.cci;

/** 
 *  A ResultSet represents tabular data that is retrieved from an EIS
 *  instance by the execution of an Interaction.. The CCI ResultSet is 
 *  based on the JDBC ResultSet.   
 *
 *  <p>Refer the CCI specification in Connectors 1.0 for detailed
 *  requirements on the implementation of a CCI ResultSet.
 *
 *  @author  Rahul Sharma
 *  @since   0.8
 *  @see     java.sql.ResultSet
**/
public interface ResultSet extends Record, java.sql.ResultSet
{

}
