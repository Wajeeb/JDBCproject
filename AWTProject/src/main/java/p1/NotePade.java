package p1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import com.ozten.font.JFontChooser;



public class NotePade extends JFrame implements ActionListener{

	public static void main(String[] args) {
		new NotePade();
		
	}
Font f=new Font("Arial",Font.PLAIN,30);		
	JTextArea txtarea=new JTextArea();
	JScrollPane scroll=new JScrollPane(txtarea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	JFrame jf=new JFrame();
	JMenuBar jmb=new JMenuBar();
	JMenu fileMenu=new JMenu("File");
	JMenu EditMenu=new JMenu("Edit");
	JMenu FormatMenu=new JMenu("Format");
	JMenu ViewMenu=new JMenu("View");
	JMenu HelpMenu=new JMenu("Help");
	
	
	JMenuItem fNew=new JMenuItem("New   Ctrl+N");
	JMenuItem fOpen=new JMenuItem("Open   Ctrl+O");
	JMenuItem fSave=new JMenuItem("Save   Ctrl+S");
	JMenuItem fSaveAs=new JMenuItem("Save As");
	JMenuItem fPageSetup=new JMenuItem("Page Setup");
	JMenuItem fPrint=new JMenuItem("Print");
	JMenuItem fExit=new JMenuItem("Exit");
	JMenuItem eUndo=new JMenuItem("Undo");
	JMenuItem eCut=new JMenuItem("Cut");
	JMenuItem eCopy=new JMenuItem("Copy");
	JMenuItem ePast=new JMenuItem("Past");
	JMenuItem eDelete=new JMenuItem("Delete");
	JMenuItem eFind=new JMenuItem("Find");
	JMenuItem eFindNext=new JMenuItem("Find Next");
	JMenuItem eReplace=new JMenuItem("Replace");
	JMenuItem eGoto=new JMenuItem("Go To");
	JMenuItem eSelectAll=new JMenuItem("Select All");
	JMenuItem eDate=new JMenuItem("Time");
	
	JMenuItem forWordRap=new JMenuItem("Wrap Word");
	JMenuItem forFont=new JMenuItem("Font");
	
	JMenuItem vStatusBar=new JMenuItem("Status Bar");
	
	JMenuItem hViewHelp=new JMenuItem("View Help");
	JMenuItem hAbout=new JMenuItem("About NotePad");
	
	
	
	public NotePade(){
		//FileMenu Items Adding
		fNew.addActionListener(this);
		fileMenu.add(fNew);
		fileMenu.add(fOpen);
		fileMenu.add(fSave);
		fileMenu.add(fSaveAs);
		fileMenu.add(fPageSetup);
		fileMenu.add(fPrint);
		fileMenu.add(fExit);
		
		//EditMenu Item s Adding
		EditMenu.add(eUndo);
		EditMenu.add(eCut);
		EditMenu.add(eCopy);
		EditMenu.add(ePast);
		EditMenu.add(eDelete);
		EditMenu.add(eFind);
		EditMenu.add(eFindNext);
		EditMenu.add(eReplace);
		EditMenu.add(eGoto);
		EditMenu.add(eSelectAll);
		EditMenu.add(eDate);
		
		//FormatMenu Items Adding
		FormatMenu.add(forWordRap);
		FormatMenu.add(forFont);
		
		//ViewMenu Items Adding
		ViewMenu.add(vStatusBar);
		
		//HelpMenu Items Adding
		HelpMenu.add(hViewHelp);
		HelpMenu.add(hAbout);
		txtarea.setFont(f);
		txtarea.setLineWrap(true);
		txtarea.setWrapStyleWord(true);
		scroll.setSize(795,495);
		
		jmb.add(fileMenu);
		jmb.add(EditMenu);
		jmb.add(FormatMenu);
		jmb.add(ViewMenu);
		jmb.add(HelpMenu);
		
		forFont.addActionListener(this);
		
		jf.add(txtarea);
		jf.setJMenuBar(jmb);
		jf.setTitle("NotePad");
		jf.setSize(800,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(fNew)){
			JOptionPane.showMessageDialog(null,"My New is Working");
		
	}
		else if(e.getSource()==forFont)
		
		{
			Font f=JFontChooser.showDialog(jf,"Font","Arial");
			txtarea.setFont(f);
		}
	}
}
