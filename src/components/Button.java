package components;

import javax.swing.*;
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
        setBackground(btn, defaultColor);
        container.add(btn);
    }

    private static void setBackground(JButton btn, Color c){
        btn.setBackground(c);
        btn.setForeground(Color.white);
    }
    private  static  void defaultConfig(JButton btn){
        btn.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        btn.setRolloverEnabled(false);
        btn.setFocusPainted(false);
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

