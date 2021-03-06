/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamriel.cyrodiil.champion.thor.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;
import tamriel.cyrodiil.champion.thor.ui.NewLoggerDialog;


@ActionID(
        category = "File",
        id = "tamriel.cyrodiil.champion.thor.actions.TailLogAction"
)
@ActionRegistration(
        iconBase = "tamriel/cyrodiil/champion/thor/report_magnify.png",
        displayName = "#CTL_TailLogAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 950),
    @ActionReference(path = "Toolbars/File", position = 200),
    @ActionReference(path = "Shortcuts", name = "D-L")
})
@Messages("CTL_TailLogAction=Tail Log...")
public final class TailLogAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       
          NewLoggerDialog nds = new NewLoggerDialog(null, true);
        nds.setLocationRelativeTo(WindowManager.getDefault().getMainWindow());
        nds.setVisible(true);
        
       
    }
}
