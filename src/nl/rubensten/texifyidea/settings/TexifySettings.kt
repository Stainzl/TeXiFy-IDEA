package nl.rubensten.texifyidea.settings

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil
import nl.rubensten.texifyidea.run.LatexCompiler

/**
 *
 * @author Sten Wessel
 */
@State(name = "TexifySettings", storages = [(Storage("texifySettings.xml"))])
class TexifySettings : PersistentStateComponent<TexifySettings> {

    companion object {

        @JvmStatic
        fun getInstance(): TexifySettings = ServiceManager.getService(TexifySettings::class.java)
    }

    // Options for smart quote replacement, in the order as they appear in the combobox
    enum class QuoteReplacement {
        NONE,
        LIGATURES,
        COMMANDS
    }

    var automaticSoftWraps = false
    var automaticSecondInlineMathSymbol = true
    var automaticUpDownBracket = true
    var automaticItemInItemize = true
    var automaticQuoteReplacement = QuoteReplacement.NONE
    var compilerCompatibility = LatexCompiler.PDFLATEX

    override fun getState() = this

    override fun loadState(state: TexifySettings) {
        XmlSerializerUtil.copyBean(state, this)
    }
}
