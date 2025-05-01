import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper

class JMdict {
    @JacksonXmlElementWrapper(useWrapping = false)
    var entry = arrayListOf<Entry>()
}