import com.ctc.wstx.api.WstxInputProperties
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import java.io.File
import javax.xml.stream.XMLResolver

fun main() {
    var file = File("..\\jmdict")
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
    println(jmdict.entry[0].r_ele[0].reb)
    println(jmdict.entry[0].sense[0].gloss)
    println("done")
}