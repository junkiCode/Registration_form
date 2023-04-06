package components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
        JButton btn = new JButton("Button");
        private static final Color defaultColor = new Color(102, 43, 214);
        public Button(){
            System.out.println("Im running");
        }
    public Button(Container container){
        container.add(btn);
    }

    public Button(Container container, String label){
        btn.setText(label);
        defaultConfig(btn);
        container.add(btn);
    }

    public void setBackground(Color c){
        btn.setBackground(c);
    }
    public void setForeground(Color c){
        btn.setForeground(c);
    }
    private static void defaultConfig(JButton btn){
        // Set the default background
        btn.setBackground(defaultColor);
        btn.setForeground(Color.white);

//        Set default border and border color
        Border border = BorderFactory.createLineBorder(defaultColor, 8, true);
        btn.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        btn.setBorder(border);

//        disable border text highlight and outline during click
        btn.setRolloverEnabled(false);
        btn.setFocusPainted(false);
        btn.setIgnoreRepaint(true);
    }

    public void onClick(OnClick cb){
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent)  {
                    cb.click(actionEvent);
                }
            });
    }

}

