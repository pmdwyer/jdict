import com.ctc.wstx.api.WstxInputProperties
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import java.io.File
import javax.xml.stream.XMLResolver

fun main() {
    var file = File("C:\\Users\\patrick\\projects\\jdict\\JMdict_e")
    var mapper = XmlMapper()
    mapper.getFactory().getXMLInputFactory().setProperty(
        WstxInputProperties.P_UNDECLARED_ENTITY_RESOLVER,
        XMLResolver { publicId, systemId, baseUri, ns ->
            when (ns) {
                "&unc;" -> "unclassified"
                "nbsp" -> " "
                else -> ""
            }
        }
    )
    var jmdict: JMdict = mapper.readValue(file, JMdict::class.java)
    println("done")
}