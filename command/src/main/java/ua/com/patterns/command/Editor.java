package ua.com.patterns.command;

import javax.swing.*;
import java.awt.*;

import static java.awt.FlowLayout.CENTER;
import static java.util.Objects.nonNull;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");
        Editor editor = this;
        ctrlC.addActionListener(e -> {
            executeCommand(new CopyCommand(editor));
        });
        ctrlX.addActionListener(e -> {
            executeCommand(new CutCommand(editor));
        });
        ctrlV.addActionListener(e -> {
            executeCommand(new PasteCommand(editor));
        });
        ctrlZ.addActionListener(e -> {
            undo();
        });
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void undo() {
        if (history.isEmpty()) {
            return;
        }
        Command command = history.pop();
        if (nonNull(command)) {
            command.undo();
        }
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }
}
