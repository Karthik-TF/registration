//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.13 at 03:22:53 PM IST 
//


package io.mosip.kernel.core.cbeffutil.jaxbclasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurposeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Verify"/>
 *     &lt;enumeration value="Identify"/>
 *     &lt;enumeration value="Enroll"/>
 *     &lt;enumeration value="EnrollVerify"/>
 *     &lt;enumeration value="EnrollIdentify"/>
 *     &lt;enumeration value="Audit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PurposeType")
@XmlEnum
public enum PurposeType {

    @XmlEnumValue("Verify")
    VERIFY("Verify"),
    @XmlEnumValue("Identify")
    IDENTIFY("Identify"),
    @XmlEnumValue("Enroll")
    ENROLL("Enroll"),
    @XmlEnumValue("EnrollVerify")
    ENROLL_VERIFY("EnrollVerify"),
    @XmlEnumValue("EnrollIdentify")
    ENROLL_IDENTIFY("EnrollIdentify"),
    @XmlEnumValue("Audit")
    AUDIT("Audit");
    private final String value;

    PurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurposeType fromValue(String v) {
        for (PurposeType c: PurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
