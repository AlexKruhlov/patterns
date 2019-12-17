package ua.com.patterns.command;

import static java.util.Objects.isNull;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (isNull(editor.clipboard) || editor.clipboard.isEmpty()) {
            return false;
        }
        super.backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
