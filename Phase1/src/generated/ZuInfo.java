//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.09 at 02:11:48 PM MESZ 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zuInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zuInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schwierigkeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brennwert" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Anleitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zuInfo", propOrder = {
    "arbeitszeit",
    "schwierigkeit",
    "brennwert",
    "anleitung"
})
public class ZuInfo {

    @XmlElement(required = true)
    protected String arbeitszeit;
    @XmlElement(required = true)
    protected String schwierigkeit;
    @XmlElement(required = true)
    protected String brennwert;
    @XmlElement(name = "Anleitung", required = true)
    protected String anleitung;

    /**
     * Gets the value of the arbeitszeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbeitszeit() {
        return arbeitszeit;
    }

    /**
     * Sets the value of the arbeitszeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbeitszeit(String value) {
        this.arbeitszeit = value;
    }

    /**
     * Gets the value of the schwierigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchwierigkeit() {
        return schwierigkeit;
    }

    /**
     * Sets the value of the schwierigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchwierigkeit(String value) {
        this.schwierigkeit = value;
    }

    /**
     * Gets the value of the brennwert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrennwert() {
        return brennwert;
    }

    /**
     * Sets the value of the brennwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrennwert(String value) {
        this.brennwert = value;
    }

    /**
     * Gets the value of the anleitung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnleitung() {
        return anleitung;
    }

    /**
     * Sets the value of the anleitung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnleitung(String value) {
        this.anleitung = value;
    }

}
