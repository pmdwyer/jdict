import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper

class Sense {
    var stagk: String = ""
    var stagr: String = ""
    var pos: String? = null
    @JacksonXmlElementWrapper(useWrapping = false)
    var xref = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var ant = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var field = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var misc = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var lsource = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var dial = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var gloss = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var pri = arrayListOf<String>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var s_inf = arrayListOf<String>()
}