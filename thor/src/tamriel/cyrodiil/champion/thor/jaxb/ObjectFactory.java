//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.30 at 05:22:16 PM EST 
//


package tamriel.cyrodiil.champion.thor.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tamriel.cyrodiil.champion.thor.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tamriel.cyrodiil.champion.thor.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Servers.AccumuloServer }
     * 
     */
    public Servers.AccumuloServer createServersAccumuloServer() {
        return new Servers.AccumuloServer();
    }

    /**
     * Create an instance of {@link Servers.NimbusServer }
     * 
     */
    public Servers.NimbusServer createServersNimbusServer() {
        return new Servers.NimbusServer();
    }

    /**
     * Create an instance of {@link Servers }
     * 
     */
    public Servers createServers() {
        return new Servers();
    }

}
