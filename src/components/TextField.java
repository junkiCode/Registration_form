package components;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

final public class TextField extends java.awt.TextField {
    private final JTextField input = new JTextField();
    private String value = null;
    private boolean showPlaceholderText = true;
    public TextField(Container container){
        addComponent(container);
        this.handleTypeEvent();
    }

    public TextField(Container container, String str){
        addComponent(container);
        TextField.defaultConfig(input);
        this.setValueIfNoWhiteSpace(str);
        this.handleTypeEvent();

    }

    public TextField(Container container, String str, String label){
        JPanel panel = new JPanel();
        BorderLayout lt = new BorderLayout();
        lt.setVgap(6);
        panel.setLayout(lt);
        JLabel inputLabel = new JLabel(label);
        inputLabel.setFont(new Font(null, Font.BOLD, 14));
        panel.add(inputLabel, BorderLayout.PAGE_START);
        input.setText(str);
        TextField.defaultConfig(input);

        this.setValueIfNoWhiteSpace(str);
        this.handleTypeEvent();

        panel.add(input, BorderLayout.PAGE_END);
        container.add(panel);
    }

    private void setValueIfNoWhiteSpace(String initialString){
        if(!initialString.trim().isEmpty()){
            value = initialString;
            input.setText(value);
        }
    }
    private void handleTypeEvent(){
        input.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                value = input.getText();
                input.setForeground(Color.BLACK);
            }
        });
    }

    public String getValue(){
        return this.value;
    }
    public void setPlaceholder(String text){

//        this.showPlaceholderText = true;
        input.setText(text);
        input.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);

                if(value != null) {
                    showPlaceholderText = false;
                }

                if(showPlaceholderText){
                    input.setText(text);
                    input.setForeground(new Color(0, 0, 0, 107));
                }
                else {
                    input.setForeground(new Color(0, 0, 0));
                }

            }

            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                System.out.println(showPlaceholderText);
                if(value == null){
                input.setText("");
                }
            }
        });
    }
    private void addComponent(Container c){
        c.add(TextField.this.input);
    }

    private static void defaultConfig(JTextField j){
        j.setSize(new Dimension(250, 42));
        j.setMinimumSize(new Dimension(250, 42));
        j.setPreferredSize(new Dimension(320, 42));
        j.setMargin(new Insets(6, 6, 6, 6));
    }
}
