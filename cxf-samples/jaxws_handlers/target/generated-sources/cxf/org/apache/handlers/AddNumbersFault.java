
package org.apache.handlers;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-21T00:16:24.259+08:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "FaultDetail", targetNamespace = "http://apache.org/handlers/types")
public class AddNumbersFault extends Exception {
    
    private org.apache.handlers.types.FaultDetail faultDetail;

    public AddNumbersFault() {
        super();
    }
    
    public AddNumbersFault(String message) {
        super(message);
    }
    
    public AddNumbersFault(String message, Throwable cause) {
        super(message, cause);
    }

    public AddNumbersFault(String message, org.apache.handlers.types.FaultDetail faultDetail) {
        super(message);
        this.faultDetail = faultDetail;
    }

    public AddNumbersFault(String message, org.apache.handlers.types.FaultDetail faultDetail, Throwable cause) {
        super(message, cause);
        this.faultDetail = faultDetail;
    }

    public org.apache.handlers.types.FaultDetail getFaultInfo() {
        return this.faultDetail;
    }
}