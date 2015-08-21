package sistemahistorico;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Limitador extends PlainDocument {
    private JTextField editor;
    private int num;

    public Limitador(JTextField editor, int num) {
        this.editor = editor;
        this.num = num;
    }
    public void insertString(int arg0,String arg1, AttributeSet arg2) throws BadLocationException{
    if((editor.getText().length()+arg1.length()) > this.num) {
        return;
    }  super.insertString(arg0, arg1, arg2);
    }
}
