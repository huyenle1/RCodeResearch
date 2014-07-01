
package com.thomsonreuters.wokmws.cxf.auth;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-17T11:04:19.572+08:00
 * Generated source version: 3.0.0
 */

@WebFault(name = "InvalidInputException", targetNamespace = "http://auth.cxf.wokmws.thomsonreuters.com")
public class InvalidInputException_Exception extends Exception {
    
    private com.thomsonreuters.wokmws.cxf.auth.InvalidInputException invalidInputException;

    public InvalidInputException_Exception() {
        super();
    }
    
    public InvalidInputException_Exception(String message) {
        super(message);
    }
    
    public InvalidInputException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException_Exception(String message, com.thomsonreuters.wokmws.cxf.auth.InvalidInputException invalidInputException) {
        super(message);
        this.invalidInputException = invalidInputException;
    }

    public InvalidInputException_Exception(String message, com.thomsonreuters.wokmws.cxf.auth.InvalidInputException invalidInputException, Throwable cause) {
        super(message, cause);
        this.invalidInputException = invalidInputException;
    }

    public com.thomsonreuters.wokmws.cxf.auth.InvalidInputException getFaultInfo() {
        return this.invalidInputException;
    }
}
