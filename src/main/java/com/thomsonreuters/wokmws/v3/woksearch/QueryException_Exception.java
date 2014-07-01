
package com.thomsonreuters.wokmws.v3.woksearch;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-17T11:07:29.006+08:00
 * Generated source version: 3.0.0
 */

@WebFault(name = "QueryException", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com")
public class QueryException_Exception extends Exception {
    
    private com.thomsonreuters.wokmws.v3.woksearch.QueryException queryException;

    public QueryException_Exception() {
        super();
    }
    
    public QueryException_Exception(String message) {
        super(message);
    }
    
    public QueryException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryException_Exception(String message, com.thomsonreuters.wokmws.v3.woksearch.QueryException queryException) {
        super(message);
        this.queryException = queryException;
    }

    public QueryException_Exception(String message, com.thomsonreuters.wokmws.v3.woksearch.QueryException queryException, Throwable cause) {
        super(message, cause);
        this.queryException = queryException;
    }

    public com.thomsonreuters.wokmws.v3.woksearch.QueryException getFaultInfo() {
        return this.queryException;
    }
}
