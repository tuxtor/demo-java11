
package gt.gob.banguat.variables.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfoVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoVariable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Variables" type="{http://www.banguat.gob.gt/variables/ws/}ArrayOfVariable" minOccurs="0"/>
 *         &lt;element name="CambioDia" type="{http://www.banguat.gob.gt/variables/ws/}ArrayOfVar" minOccurs="0"/>
 *         &lt;element name="CambioDolar" type="{http://www.banguat.gob.gt/variables/ws/}ArrayOfVarDolar" minOccurs="0"/>
 *         &lt;element name="TotalItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoVariable", propOrder = {
    "variables",
    "cambioDia",
    "cambioDolar",
    "totalItems"
})
public class InfoVariable {

    @XmlElement(name = "Variables")
    protected ArrayOfVariable variables;
    @XmlElement(name = "CambioDia")
    protected ArrayOfVar cambioDia;
    @XmlElement(name = "CambioDolar")
    protected ArrayOfVarDolar cambioDolar;
    @XmlElement(name = "TotalItems")
    protected int totalItems;

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVariable }
     *     
     */
    public ArrayOfVariable getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVariable }
     *     
     */
    public void setVariables(ArrayOfVariable value) {
        this.variables = value;
    }

    /**
     * Gets the value of the cambioDia property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVar }
     *     
     */
    public ArrayOfVar getCambioDia() {
        return cambioDia;
    }

    /**
     * Sets the value of the cambioDia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVar }
     *     
     */
    public void setCambioDia(ArrayOfVar value) {
        this.cambioDia = value;
    }

    /**
     * Gets the value of the cambioDolar property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVarDolar }
     *     
     */
    public ArrayOfVarDolar getCambioDolar() {
        return cambioDolar;
    }

    /**
     * Sets the value of the cambioDolar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVarDolar }
     *     
     */
    public void setCambioDolar(ArrayOfVarDolar value) {
        this.cambioDolar = value;
    }

    /**
     * Gets the value of the totalItems property.
     * 
     */
    public int getTotalItems() {
        return totalItems;
    }

    /**
     * Sets the value of the totalItems property.
     * 
     */
    public void setTotalItems(int value) {
        this.totalItems = value;
    }

}
