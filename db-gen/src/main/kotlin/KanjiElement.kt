import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper

class KanjiElement {
    var keb: String = ""
    @JacksonXmlElementWrapper(useWrapping = false)
    var ke_inf = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var ke_pri = arrayListOf<String>()
}