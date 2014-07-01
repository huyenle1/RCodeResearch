
package com.thomsonreuters.wokmws.v3.woksearchlite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       In version 2, the faultInformation and rawFaultInformation elements did not exist. It is not required that the service return 
 *       these elements. 
 *       
 * 
 * <p>InvalidInputException complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InvalidInputException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faultInformation" type="{http://woksearchlite.v3.wokmws.thomsonreuters.com}FaultInformation" minOccurs="0"/>
 *         &lt;element name="rawFaultInformation" type="{http://woksearchlite.v3.wokmws.thomsonreuters.com}RawFaultInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidInputException", propOrder = {
    "faultInformation",
    "rawFaultInformation"
})
public class InvalidInputException {

    protected FaultInformation faultInformation;
    protected RawFaultInformation rawFaultInformation;

    /**
     * 获取faultInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FaultInformation }
     *     
     */
    public FaultInformation getFaultInformation() {
        return faultInformation;
    }

    /**
     * 设置faultInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FaultInformation }
     *     
     */
    public void setFaultInformation(FaultInformation value) {
        this.faultInformation = value;
    }

    /**
     * 获取rawFaultInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RawFaultInformation }
     *     
     */
    public RawFaultInformation getRawFaultInformation() {
        return rawFaultInformation;
    }

    /**
     * 设置rawFaultInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RawFaultInformation }
     *     
     */
    public void setRawFaultInformation(RawFaultInformation value) {
        this.rawFaultInformation = value;
    }

}
