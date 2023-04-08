package components;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Flex {
	final Container flexContainer = new Container();

	public Flex(Container container, List<Component> components){
		container.add(flexContainer);
		configLayout(flexContainer, components);
	}

	private static void configLayout(Container flexContainer, List<Component> components){
		flexContainer.setLayout(new BoxLayout(flexContainer, BoxLayout.Y_AXIS));
		flexContainer.setBackground(Color.BLACK);
//		flexContainer.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
//		int count = 1;
		for (Component cmp: components) {
//		brag.fill = GridBagConstraints.HORIZONTAL;
//		brag.gridy = count;
//		count += 1;
			cmp.getBaseline(100, 20);
			flexContainer.add(cmp);
		}
	}
//	public Flex(Component component[]){
//
//	}
}
