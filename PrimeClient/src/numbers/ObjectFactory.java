
package numbers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the numbers package. 
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

    private final static QName _IsPrimeResponse_QNAME = new QName("http://numbers/", "isPrimeResponse");
    private final static QName _IsPrime_QNAME = new QName("http://numbers/", "isPrime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: numbers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsPrime }
     * 
     */
    public IsPrime createIsPrime() {
        return new IsPrime();
    }

    /**
     * Create an instance of {@link IsPrimeResponse }
     * 
     */
    public IsPrimeResponse createIsPrimeResponse() {
        return new IsPrimeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPrimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://numbers/", name = "isPrimeResponse")
    public JAXBElement<IsPrimeResponse> createIsPrimeResponse(IsPrimeResponse value) {
        return new JAXBElement<IsPrimeResponse>(_IsPrimeResponse_QNAME, IsPrimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPrime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://numbers/", name = "isPrime")
    public JAXBElement<IsPrime> createIsPrime(IsPrime value) {
        return new JAXBElement<IsPrime>(_IsPrime_QNAME, IsPrime.class, null, value);
    }

}
