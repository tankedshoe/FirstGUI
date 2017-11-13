package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a friggin button!");
		baseLayout  = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Used to add all components to the subclass of JPanel.
	 * This installs them into the panel so they are seen in the GUI.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(baseLayout);
		this.add(firstButton);
	}
	
	/**
	 * This is used to hold all the layout and arrangement code for SpringLayout.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 131, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 135, SpringLayout.WEST, this);
		
	}
	
	/**
	 * This helper method is used to link any GUI components to the associated listeners.
	 */
	private void setupListeners()
	{
		
	}
}
