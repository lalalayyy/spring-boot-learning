package cn.lqdev.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-11-10T20:20:08.070+08:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://www.lqdev.cn/webservice", name = "authorPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface AuthorPortType {

    @WebMethod
    @RequestWrapper(localName = "getAuthorByName", targetNamespace = "http://www.lqdev.cn/webservice", className = "cn.lqdev.webservice.GetAuthorByName")
    @ResponseWrapper(localName = "getAuthorByNameResponse", targetNamespace = "http://www.lqdev.cn/webservice", className = "cn.lqdev.webservice.GetAuthorByNameResponse")
    @WebResult(name = "return", targetNamespace = "")
    public cn.lqdev.webservice.AuthorDto getAuthorByName(
        @WebParam(name = "authorName", targetNamespace = "")
        java.lang.String authorName
    );

    @WebMethod
    @RequestWrapper(localName = "getAuthorList", targetNamespace = "http://www.lqdev.cn/webservice", className = "cn.lqdev.webservice.GetAuthorList")
    @ResponseWrapper(localName = "getAuthorListResponse", targetNamespace = "http://www.lqdev.cn/webservice", className = "cn.lqdev.webservice.GetAuthorListResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<cn.lqdev.webservice.AuthorDto> getAuthorList();

    @WebMethod
    @RequestWrapper(localName = "getAuthorString", targetNamespace = "http://www.lqdev.cn/webservice", className = "cn.lqdev.webservice.GetAuthorString")
    @ResponseWrapper(localName = "getAuthorStringResponse", targetNamespace = "http://www.lqdev.cn/webservice", className = "cn.lqdev.webservice.GetAuthorStringResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getAuthorString(
        @WebParam(name = "authorName", targetNamespace = "")
        java.lang.String authorName
    );
}
