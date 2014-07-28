
package schemas.dynamics.microsoft.page.pedidoscompra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Job_Line_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Job_Line_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_blank_"/>
 *     &lt;enumeration value="Schedule"/>
 *     &lt;enumeration value="Contract"/>
 *     &lt;enumeration value="Both_Schedule_and_Contract"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Job_Line_Type")
@XmlEnum
public enum JobLineType {

    @XmlEnumValue("_blank_")
    BLANK("_blank_"),
    @XmlEnumValue("Schedule")
    SCHEDULE("Schedule"),
    @XmlEnumValue("Contract")
    CONTRACT("Contract"),
    @XmlEnumValue("Both_Schedule_and_Contract")
    BOTH_SCHEDULE_AND_CONTRACT("Both_Schedule_and_Contract");
    private final String value;

    JobLineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobLineType fromValue(String v) {
        for (JobLineType c: JobLineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
