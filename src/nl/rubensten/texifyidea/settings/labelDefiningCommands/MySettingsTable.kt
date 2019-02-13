package nl.rubensten.texifyidea.settings.labelDefiningCommands

import com.intellij.ui.SimpleTextAttributes
import com.intellij.ui.table.JBTable
import com.intellij.util.ui.StatusText
import java.awt.event.ActionListener
import javax.swing.table.TableModel

/**
 * JBTable is extended to set own text when table is empty and define action
 */
class MySettingsTable(model: TableModel, private var listener: ActionListener) : JBTable(model) {

    /**
     * create empty text and define a clickable link to add new command
     */
    override fun getEmptyText(): StatusText {
        val test = object: StatusText(this) {
            override fun isStatusVisible(): Boolean {
                return isEmpty
            }
        }
        test.text = "No command defined"
        test.appendSecondaryText("Define new command", SimpleTextAttributes.LINK_ATTRIBUTES, listener)
        return test
    }
}