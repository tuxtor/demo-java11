
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
 *         &lt;element name="TipoCambioFechaInicialMonedaResult" type="{http://www.banguat.gob.gt/variables/ws/}DataVariable" minOccurs="0"/>
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
    "tipoCambioFechaInicialMonedaResult"
})
@XmlRootElement(name = "TipoCambioFechaInicialMonedaResponse")
public class TipoCambioFechaInicialMonedaResponse {

    @XmlElement(name = "TipoCambioFechaInicialMonedaResult")
    protected DataVariable tipoCambioFechaInicialMonedaResult;

    /**
     * Gets the value of the tipoCambioFechaInicialMonedaResult property.
     * 
     * @return
     *     possible object is
     *     {@link DataVariable }
     *     
     */
    public DataVariable getTipoCambioFechaInicialMonedaResult() {
        return tipoCambioFechaInicialMonedaResult;
    }

    /**
     * Sets the value of the tipoCambioFechaInicialMonedaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataVariable }
     *     
     */
    public void setTipoCambioFechaInicialMonedaResult(DataVariable value) {
        this.tipoCambioFechaInicialMonedaResult = value;
    }

}
