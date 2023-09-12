package p1;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.LineBorder;

public  class AWTDemo extends JFrame
{
	
	JLabel l;
	public AWTDemo()
	{
		l=new JLabel("Mouse Clicked");
		setLayout(null);
		l.setBounds(150, 130, 100, 20);
		l.setBorder(new LineBorder(Color.BLACK,1,true));
		add(l);
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				int a=me.getX();
				int b=me.getY();
				
				l.setText(a+","+b);
			}
		});
	}
}