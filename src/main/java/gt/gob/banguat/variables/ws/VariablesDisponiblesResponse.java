
package gt.gob.banguat.variables.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="VariablesDisponiblesResult" type="{http://www.banguat.gob.gt/variables/ws/}InfoVariable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "variablesDisponiblesResult"
})
@XmlRootElement(name = "VariablesDisponiblesResponse")
public class VariablesDisponiblesResponse {

    @XmlElement(name = "VariablesDisponiblesResult")
    protected InfoVariable variablesDisponiblesResult;

    /**
     * Gets the value of the variablesDisponiblesResult property.
     * 
     * @return
     *     possible object is
     *     {@link InfoVariable }
     *     
     */
    public InfoVariable getVariablesDisponiblesResult() {
        return variablesDisponiblesResult;
    }

    /**
     * Sets the value of the variablesDisponiblesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoVariable }
     *     
     */
    public void setVariablesDisponiblesResult(InfoVariable value) {
        this.variablesDisponiblesResult = value;
    }

}
