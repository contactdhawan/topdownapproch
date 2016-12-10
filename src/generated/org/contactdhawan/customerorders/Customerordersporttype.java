package org.contactdhawan.customerorders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-12-10T01:12:27.347-06:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://www.contactdhawan.org/customerorders/", name = "customerordersporttype")
@XmlSeeAlso({ObjectFactory.class})
public interface Customerordersporttype {

    @WebResult(name = "order", targetNamespace = "")
    @RequestWrapper(localName = "getOrders", targetNamespace = "http://www.contactdhawan.org/customerorders/", className = "org.contactdhawan.customerorders.GetOrders")
    @WebMethod(action = "http://www.contactdhawan.org/customerorders/getOrders")
    @ResponseWrapper(localName = "getOrdersResponse", targetNamespace = "http://www.contactdhawan.org/customerorders/", className = "org.contactdhawan.customerorders.GetOrdersResponse")
    public java.util.List<org.contactdhawan.customerorders.Order> getOrders(
        @WebParam(name = "customerId", targetNamespace = "")
        int customerId
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "createOrders", targetNamespace = "http://www.contactdhawan.org/customerorders/", className = "org.contactdhawan.customerorders.CreateOrders")
    @WebMethod
    @ResponseWrapper(localName = "createOrdersResponse", targetNamespace = "http://www.contactdhawan.org/customerorders/", className = "org.contactdhawan.customerorders.CreateOrdersResponse")
    public boolean createOrders(
        @WebParam(name = "customerId", targetNamespace = "")
        int customerId,
        @WebParam(name = "order", targetNamespace = "")
        org.contactdhawan.customerorders.Order order
    );
}
