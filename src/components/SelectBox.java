package components;

import javax.swing.*;
import java.awt.*;
import java.util.List;

interface Select {
	public String getSelected();
}
public class SelectBox {

	private JComboBox selectBox = null;
	public SelectBox(Container container, Object[] items, String label){
		selectBox = new JComboBox(items);

		JPanel panel = new JPanel();
		BorderLayout lt = new BorderLayout();
		lt.setVgap(6);
		panel.setLayout(lt);
		JLabel inputLabel = new JLabel(label);
		inputLabel.setFont(new Font(null, Font.BOLD, 14));
		panel.add(inputLabel, BorderLayout.PAGE_START);
		panel.add(selectBox, BorderLayout.PAGE_END);
		container.add(panel);
		SelectBox.defaultConfig(selectBox);

	}

	public String getSelected(){
		Object selected = selectBox.getSelectedItem();
		return selected.toString();
	}
	private static void defaultConfig(JComboBox cmp){
		cmp.setMinimumSize(new Dimension(120, 42));
		cmp.setMaximumSize(new Dimension(120, 42));
		cmp.setPreferredSize(new Dimension(120, 42));
		cmp.setSize(new Dimension(120, 42));

		cmp.setBackground(new Color(255, 250, 250));
		cmp.setInheritsPopupMenu(false);
	}
}
