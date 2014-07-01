
package com.thomsonreuters.wokmws.v3.woksearch;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-17T11:07:28.996+08:00
 * Generated source version: 3.0.0
 */

@WebFault(name = "InternalServerException", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com")
public class InternalServerException_Exception extends Exception {
    
    private com.thomsonreuters.wokmws.v3.woksearch.InternalServerException internalServerException;

    public InternalServerException_Exception() {
        super();
    }
    
    public InternalServerException_Exception(String message) {
        super(message);
    }
    
    public InternalServerException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InternalServerException_Exception(String message, com.thomsonreuters.wokmws.v3.woksearch.InternalServerException internalServerException) {
        super(message);
        this.internalServerException = internalServerException;
    }

    public InternalServerException_Exception(String message, com.thomsonreuters.wokmws.v3.woksearch.InternalServerException internalServerException, Throwable cause) {
        super(message, cause);
        this.internalServerException = internalServerException;
    }

    public com.thomsonreuters.wokmws.v3.woksearch.InternalServerException getFaultInfo() {
        return this.internalServerException;
    }
}
