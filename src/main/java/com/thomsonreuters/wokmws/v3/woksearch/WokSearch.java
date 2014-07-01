package com.thomsonreuters.wokmws.v3.woksearch;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2014-06-17T11:07:29.052+08:00
 * Generated source version: 3.0.0
 * 
 */
@WebService(targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", name = "WokSearch")
@XmlSeeAlso({ObjectFactory.class})
public interface WokSearch {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "citedReferencesRetrieve", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.CitedReferencesRetrieve")
    @WebMethod
    @ResponseWrapper(localName = "citedReferencesRetrieveResponse", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.CitedReferencesRetrieveResponse")
    public java.util.List<com.thomsonreuters.wokmws.v3.woksearch.CitedReference> citedReferencesRetrieve(
        @WebParam(name = "queryId", targetNamespace = "")
        java.lang.String queryId,
        @WebParam(name = "retrieveParameters", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.RetrieveParameters retrieveParameters
    ) throws InternalServerException_Exception, QueryException_Exception, SessionException_Exception, AuthenticationException_Exception, InvalidInputException_Exception, ESTIWSException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "relatedRecords", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.RelatedRecords")
    @WebMethod
    @ResponseWrapper(localName = "relatedRecordsResponse", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.RelatedRecordsResponse")
    public com.thomsonreuters.wokmws.v3.woksearch.FullRecordSearchResults relatedRecords(
        @WebParam(name = "databaseId", targetNamespace = "")
        java.lang.String databaseId,
        @WebParam(name = "uid", targetNamespace = "")
        java.lang.String uid,
        @WebParam(name = "editions", targetNamespace = "")
        java.util.List<com.thomsonreuters.wokmws.v3.woksearch.EditionDesc> editions,
        @WebParam(name = "timeSpan", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.TimeSpan timeSpan,
        @WebParam(name = "queryLanguage", targetNamespace = "")
        java.lang.String queryLanguage,
        @WebParam(name = "retrieveParameters", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.RetrieveParameters retrieveParameters
    ) throws InternalServerException_Exception, QueryException_Exception, SessionException_Exception, AuthenticationException_Exception, InvalidInputException_Exception, ESTIWSException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "citingArticles", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.CitingArticles")
    @WebMethod
    @ResponseWrapper(localName = "citingArticlesResponse", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.CitingArticlesResponse")
    public com.thomsonreuters.wokmws.v3.woksearch.FullRecordSearchResults citingArticles(
        @WebParam(name = "databaseId", targetNamespace = "")
        java.lang.String databaseId,
        @WebParam(name = "uid", targetNamespace = "")
        java.lang.String uid,
        @WebParam(name = "editions", targetNamespace = "")
        java.util.List<com.thomsonreuters.wokmws.v3.woksearch.EditionDesc> editions,
        @WebParam(name = "timeSpan", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.TimeSpan timeSpan,
        @WebParam(name = "queryLanguage", targetNamespace = "")
        java.lang.String queryLanguage,
        @WebParam(name = "retrieveParameters", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.RetrieveParameters retrieveParameters
    ) throws InternalServerException_Exception, QueryException_Exception, SessionException_Exception, AuthenticationException_Exception, InvalidInputException_Exception, ESTIWSException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "citedReferences", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.CitedReferences")
    @WebMethod
    @ResponseWrapper(localName = "citedReferencesResponse", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.CitedReferencesResponse")
    public com.thomsonreuters.wokmws.v3.woksearch.CitedReferencesSearchResults citedReferences(
        @WebParam(name = "databaseId", targetNamespace = "")
        java.lang.String databaseId,
        @WebParam(name = "uid", targetNamespace = "")
        java.lang.String uid,
        @WebParam(name = "queryLanguage", targetNamespace = "")
        java.lang.String queryLanguage,
        @WebParam(name = "retrieveParameters", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.RetrieveParameters retrieveParameters
    ) throws InternalServerException_Exception, QueryException_Exception, SessionException_Exception, AuthenticationException_Exception, InvalidInputException_Exception, ESTIWSException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "retrieve", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.Retrieve")
    @WebMethod
    @ResponseWrapper(localName = "retrieveResponse", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.RetrieveResponse")
    public com.thomsonreuters.wokmws.v3.woksearch.FullRecordData retrieve(
        @WebParam(name = "queryId", targetNamespace = "")
        java.lang.String queryId,
        @WebParam(name = "retrieveParameters", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.RetrieveParameters retrieveParameters
    ) throws InternalServerException_Exception, QueryException_Exception, SessionException_Exception, AuthenticationException_Exception, InvalidInputException_Exception, ESTIWSException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "retrieveById", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.RetrieveById")
    @WebMethod
    @ResponseWrapper(localName = "retrieveByIdResponse", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.RetrieveByIdResponse")
    public com.thomsonreuters.wokmws.v3.woksearch.FullRecordSearchResults retrieveById(
        @WebParam(name = "databaseId", targetNamespace = "")
        java.lang.String databaseId,
        @WebParam(name = "uid", targetNamespace = "")
        java.util.List<java.lang.String> uid,
        @WebParam(name = "queryLanguage", targetNamespace = "")
        java.lang.String queryLanguage,
        @WebParam(name = "retrieveParameters", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.RetrieveParameters retrieveParameters
    ) throws InternalServerException_Exception, QueryException_Exception, SessionException_Exception, AuthenticationException_Exception, InvalidInputException_Exception, ESTIWSException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "search", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.Search")
    @WebMethod
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://woksearch.v3.wokmws.thomsonreuters.com", className = "com.thomsonreuters.wokmws.v3.woksearch.SearchResponse")
    public com.thomsonreuters.wokmws.v3.woksearch.FullRecordSearchResults search(
        @WebParam(name = "queryParameters", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.QueryParameters queryParameters,
        @WebParam(name = "retrieveParameters", targetNamespace = "")
        com.thomsonreuters.wokmws.v3.woksearch.RetrieveParameters retrieveParameters
    ) throws InternalServerException_Exception, QueryException_Exception, SessionException_Exception, AuthenticationException_Exception, InvalidInputException_Exception, ESTIWSException_Exception;
}
