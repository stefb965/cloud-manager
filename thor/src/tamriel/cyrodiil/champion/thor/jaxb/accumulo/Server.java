//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.28 at 01:45:55 AM EST 
//


package tamriel.cyrodiil.champion.thor.jaxb.accumulo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}hostname"/>
 *         &lt;element ref="{}lastContact"/>
 *         &lt;element ref="{}osload"/>
 *         &lt;element ref="{}compactions"/>
 *         &lt;element ref="{}tablets"/>
 *         &lt;element ref="{}loggers"/>
 *         &lt;element ref="{}ingest"/>
 *         &lt;element ref="{}query"/>
 *         &lt;element ref="{}ingestMB"/>
 *         &lt;element ref="{}queryMB"/>
 *         &lt;element ref="{}scans"/>
 *         &lt;element ref="{}scansessions"/>
 *         &lt;element ref="{}holdtime"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="10.35.56.93:9997"/>
 *             &lt;enumeration value="10.35.56.94:9997"/>
 *             &lt;enumeration value="10.35.56.95:9997"/>
 *             &lt;enumeration value="10.35.56.97:9997"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hostname",
    "lastContact",
    "osload",
    "compactions",
    "tablets",
    "loggers",
    "ingest",
    "query",
    "ingestMB",
    "queryMB",
    "scans",
    "scansessions",
    "holdtime"
})
@XmlRootElement(name = "server")
public class Server {

    @XmlElement(required = true)
    protected String hostname;
    protected short lastContact;
    @XmlElement(required = true)
    protected BigDecimal osload;
    @XmlElement(required = true)
    protected Compactions compactions;
    protected short tablets;
    @XmlElement(required = true)
    protected Loggers loggers;
    protected double ingest;
    protected double query;
    protected double ingestMB;
    protected double queryMB;
    protected byte scans;
    @XmlElement(required = true)
    protected BigDecimal scansessions;
    protected byte holdtime;
    @XmlAttribute(required = true)
    protected String id;

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the lastContact property.
     * 
     */
    public short getLastContact() {
        return lastContact;
    }

    /**
     * Sets the value of the lastContact property.
     * 
     */
    public void setLastContact(short value) {
        this.lastContact = value;
    }

    /**
     * Gets the value of the osload property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOsload() {
        return osload;
    }

    /**
     * Sets the value of the osload property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOsload(BigDecimal value) {
        this.osload = value;
    }

    /**
     * Gets the value of the compactions property.
     * 
     * @return
     *     possible object is
     *     {@link Compactions }
     *     
     */
    public Compactions getCompactions() {
        return compactions;
    }

    /**
     * Sets the value of the compactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compactions }
     *     
     */
    public void setCompactions(Compactions value) {
        this.compactions = value;
    }

    /**
     * Gets the value of the tablets property.
     * 
     */
    public short getTablets() {
        return tablets;
    }

    /**
     * Sets the value of the tablets property.
     * 
     */
    public void setTablets(short value) {
        this.tablets = value;
    }

    /**
     * Gets the value of the loggers property.
     * 
     * @return
     *     possible object is
     *     {@link Loggers }
     *     
     */
    public Loggers getLoggers() {
        return loggers;
    }

    /**
     * Sets the value of the loggers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loggers }
     *     
     */
    public void setLoggers(Loggers value) {
        this.loggers = value;
    }

    /**
     * Gets the value of the ingest property.
     * 
     */
    public double getIngest() {
        return ingest;
    }

    /**
     * Sets the value of the ingest property.
     * 
     */
    public void setIngest(double value) {
        this.ingest = value;
    }

    /**
     * Gets the value of the query property.
     * 
     */
    public double getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     */
    public void setQuery(double value) {
        this.query = value;
    }

    /**
     * Gets the value of the ingestMB property.
     * 
     */
    public double getIngestMB() {
        return ingestMB;
    }

    /**
     * Sets the value of the ingestMB property.
     * 
     */
    public void setIngestMB(double value) {
        this.ingestMB = value;
    }

    /**
     * Gets the value of the queryMB property.
     * 
     */
    public double getQueryMB() {
        return queryMB;
    }

    /**
     * Sets the value of the queryMB property.
     * 
     */
    public void setQueryMB(double value) {
        this.queryMB = value;
    }

    /**
     * Gets the value of the scans property.
     * 
     */
    public byte getScans() {
        return scans;
    }

    /**
     * Sets the value of the scans property.
     * 
     */
    public void setScans(byte value) {
        this.scans = value;
    }

    /**
     * Gets the value of the scansessions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScansessions() {
        return scansessions;
    }

    /**
     * Sets the value of the scansessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScansessions(BigDecimal value) {
        this.scansessions = value;
    }

    /**
     * Gets the value of the holdtime property.
     * 
     */
    public byte getHoldtime() {
        return holdtime;
    }

    /**
     * Sets the value of the holdtime property.
     * 
     */
    public void setHoldtime(byte value) {
        this.holdtime = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
