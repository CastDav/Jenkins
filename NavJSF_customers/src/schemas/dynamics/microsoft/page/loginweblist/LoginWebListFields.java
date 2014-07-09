
package schemas.dynamics.microsoft.page.loginweblist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoginWebList_Fields.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginWebList_Fields">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="username"/>
 *     &lt;enumeration value="password"/>
 *     &lt;enumeration value="role"/>
 *     &lt;enumeration value="name"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoginWebList_Fields")
@XmlEnum
public enum LoginWebListFields {

    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("username")
    USERNAME("username"),
    @XmlEnumValue("password")
    PASSWORD("password"),
    @XmlEnumValue("role")
    ROLE("role"),
    @XmlEnumValue("name")
    NAME("name");
    private final String value;

    LoginWebListFields(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginWebListFields fromValue(String v) {
        for (LoginWebListFields c: LoginWebListFields.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
