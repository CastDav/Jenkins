
package schemas.dynamics.microsoft.page.loginweblist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para role.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="role">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Administrador"/>
 *     &lt;enumeration value="_Usuario"/>
 *     &lt;enumeration value="_Comercial"/>
 *     &lt;enumeration value="_Cliente"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "role")
@XmlEnum
public enum Role {

    @XmlEnumValue("Administrador")
    ADMINISTRADOR("Administrador"),
    @XmlEnumValue("_Usuario")
    USUARIO("_Usuario"),
    @XmlEnumValue("_Comercial")
    COMERCIAL("_Comercial"),
    @XmlEnumValue("_Cliente")
    CLIENTE("_Cliente");
    private final String value;

    Role(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Role fromValue(String v) {
        for (Role c: Role.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
