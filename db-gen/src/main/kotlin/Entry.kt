import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper

class Entry {
    var ent_seq = 0
    @JacksonXmlElementWrapper(useWrapping = false)
    var k_ele = arrayListOf<KanjiElement>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var r_ele = arrayListOf<ReadingElement>()
    @JacksonXmlElementWrapper(useWrapping = false)
    var sense = arrayListOf<Sense>()
}
