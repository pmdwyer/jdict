import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper

class ReadingElement {
    constructor(@JsonProperty("reb") reading: String) {
        reb = reading
    }

    var reb: String = ""
    var re_nokanji: String? = null
    @JacksonXmlElementWrapper(useWrapping = false)
    var re_restr = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var re_inf = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var re_pri= arrayListOf<String>()
}