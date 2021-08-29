/****************************************************************/
/*                      FECSource2	                            */
/*                                                              */
/****************************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
/**
 * Summary description for FECClient
 *
 */
public class FECSource2 extends JFrame
{
	// Variables declaration
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField jTextField1;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JProgressBar jProgressBar1;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JPanel contentPane;
	public byte filebyte[]=new byte[100000];
	public int filint[];
	public String filstr[];
	public String filmer[];
	public String filtfr[];
	public String filsep[][];	
	public String filorg[];
	public char pakch[][];
	public char shufch[][];
	String Dest1,Dest2;
	public int ch;
	Socket st;
	int i,j,k,l;
	public int flen;
	
	// End of variables declaration


	public FECSource2()
	{
		super();
		initializeComponent();
		//
		// TODO: Add any constructor code after initializeComponent call
		//

		this.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always regenerated
	 * by the Windows Form Designer. Otherwise, retrieving design might not work properly.
	 * Tip: If you must revise this method, please backup this GUI file for JFrameBuilder
	 * to retrieve your design properly in future, before revising this method.
	 */
	private void initializeComponent()
	{

		jLabel1 = new JLabel();
		jLabel1.setFont(new Font("Arial",Font.BOLD,14));
		jLabel2 = new JLabel();
		jLabel2.setFont(new Font("Arial",Font.BOLD,12));
		jLabel3 = new JLabel();
		jLabel3.setFont(new Font("Arial",Font.BOLD,12));
		jLabel4 = new JLabel();
		jLabel4.setFont(new Font("Arial",Font.BOLD,12));
		jTextField1 = new JTextField();
		jTextField1.setFont(new Font("Arial",Font.BOLD,12));
		jTextArea1 = new JTextArea();
		jTextArea1.setFont(new Font("Arial",Font.BOLD,12));
		jScrollPane1 = new JScrollPane();
		jProgressBar1 = new JProgressBar();
		jButton1 = new JButton(new ImageIcon("Sb1.jpg"));
		jButton2 = new JButton(new ImageIcon("Sb1.jpg"));
		jButton3 = new JButton(new ImageIcon("Sb1.jpg"));
		jButton4 = new JButton(new ImageIcon("Sb1.jpg"));
		jButton5 = new JButton(new ImageIcon("Sb1.jpg"));
		contentPane = (JPanel)this.getContentPane();

		//
		// jLabel1
		//
		jLabel1.setForeground(new Color(0, 0, 102));
		jLabel1.setText("SOURCE 2");
		//
		// jLabel2
		//
		jLabel2.setForeground(new Color(0, 0, 102));
		jLabel2.setText("Status Information");
		//
		// jLabel3
		//
		jLabel3.setForeground(new Color(0, 0, 102));
		jLabel3.setText("Open the Source File : ");
		//
		// jLabel4
		//
		jLabel4.setForeground(new Color(0, 0, 102));
		jLabel4.setText("");
		//
		// jTextField1
		//
		jTextField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jTextField1_actionPerformed(e);
			}

		});
		//
		// jTextArea1
		//
		//
		// jScrollPane1
		//
		jScrollPane1.setViewportView(jTextArea1);
		//
		// jProgressBar1
		//
		//
		// jButton1
		//
		//jButton1.setBackground(new Color(102, 102, 255));
		jButton1.setForeground(new Color(0, 0, 102));
		jButton1.setText("Browse");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton1_actionPerformed(e);
			}

		});
		//
		// jButton2
		//
		//jButton2.setBackground(new Color(102, 102, 255));
		jButton2.setForeground(new Color(0, 0, 102));
		jButton2.setText("Source Encoding");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton2_actionPerformed(e);
			}

		});
		//
		// jButton3
		//
		//jButton3.setBackground(new Color(102, 102, 255));
		jButton3.setForeground(new Color(0, 0, 102));
		//Button3.addImageIcon("Sb1.gif");
		jButton3.setText("SFCC-N4 Encoding");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton3_actionPerformed(e);
			}

		});
		//
		// jButton4
		//
		//jButton4.setBackground(new Color(102, 102, 255));
		jButton4.setForeground(new Color(0, 0, 102));
		jButton4.setText("Send Packets");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton4_actionPerformed(e);
			}

		});
		//
		// jButton5
		//
		//jButton5.setBackground(new Color(102, 102, 255));
		jButton5.setForeground(new Color(0, 0, 102));
		jButton5.setText("Exit");
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				jButton5_actionPerformed(e);
			}

		});
		//
		// contentPane
		//
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(255, 0, 255));
		contentPane.setForeground(new Color(51, 51, 51));
		addComponent(contentPane, jLabel1, 455,10,945,18);
		addComponent(contentPane, jLabel2, 750,38,184,18);
		addComponent(contentPane, jLabel3, 127,38,240,30);
		addComponent(contentPane, jLabel4, 27,410,200,20);
		addComponent(contentPane, jTextField1, 127,71,400,30);
		addComponent(contentPane, jScrollPane1, 667,67,256,333);
		addComponent(contentPane, jProgressBar1, 27,430,900,20);
		addComponent(contentPane, jButton1, 550,70,83,32);
		addComponent(contentPane, jButton2, 290,130,140,30);
		addComponent(contentPane, jButton3, 290,200,140,30);
		addComponent(contentPane, jButton4, 290,270,140,30);
		addComponent(contentPane, jButton5, 290,340,140,30);
		//
		// SourceClient
		//
		this.setTitle("Source Source 2");
		this.setLocation(new Point(0, 450));
		this.setSize(new Dimension(1026, 568));
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

	/** Add Component Without a Layout Manager (Absolute Positioning) */
	private void addComponent(Container container,Component c,int x,int y,int width,int height)
	{
		c.setBounds(x,y,width,height);
		container.add(c);
	}

	//
	// TODO: Add any appropriate code in the following Event Handling Methods
	//
	private void jTextField1_actionPerformed(ActionEvent e)
	{
		System.out.println("\nBrowse For File");
		// TODO: Add any handling code here

	}

	private void jButton1_actionPerformed(ActionEvent e)
	{
		k=5;
		System.out.println("\n*********************File Loaded********************");
		// TODO: Add any handling code here
		
				try
				{
					FileDialog fd=new FileDialog(this,"Open",FileDialog.LOAD);
					fd.show();
					FileInputStream fin=new FileInputStream(fd.getDirectory()+fd.getFile());
					jTextField1.setText(fd.getDirectory()+fd.getFile());
					File f = new File(fd.getDirectory()+fd.getFile());
					fin.read(filebyte);
					flen=(int)f.length();
					
					jTextArea1.setText("\n   File Loaded");
					filint=new int[flen];
					filstr=new String[flen];
					filmer=new String[flen];
					filtfr=new String[flen];
					filsep=new String[flen][100];
					filorg=new String[flen];
					pakch=new char[flen+25][100];
					shufch=new char[flen+25][100];
									
				}
				catch (Exception er)
				{
					System.out.println(er);
				}
	}

	private void jButton2_actionPerformed(ActionEvent e)
	{
		if (k!=5)
		{
			String msg="Load The File and then Start Source Encoding";
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(op,msg)	;
		}
		else
		{
			k=10;
		System.out.println("\n************************Source Encoding Started****************");
		// TODO: Add any handling code here
		//Conversion of Byte to Binary
		
		jTextArea1.append("\n\n   Source Encoding Started");
		System.out.println(flen);
		for(i=0;i<flen;i++)
		{
			
			filint[i]=(int)filebyte[i];
			System.out.println("Int Value : ["+i+"] = "+filint[i]);
			filstr[i] = Integer.toBinaryString(filint[i]);
			//filorg[i] = Integer.toBinaryString(filint[i]);
		}
			
		//Printing Binary Values of Each Character
		for(i=0;i<flen;i++)
		{
			
			System.out.println(filstr[i]);
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		
		//Separation of each binary values in to 2Dimensional String array
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				
				filsep[i][j]=Character.toString(filstr[i].charAt(j));
			}
		}
		
		//Printing This values
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				System.out.print(filsep[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}

		//Adding redundant Data to the Binary values
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				
				filsep[i][j]=filsep[i][j]+filsep[i][j]+filsep[i][j];
			}
		}

		//Printing the values
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filstr[i].length();j++)
			{
				System.out.print(filsep[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}

		//Merging for SFCC-N4 Encoding
		for(i=0;i<flen;i++)
		{
			filmer[i]="";
			for(j=0;j<filstr[i].length();j++)
			{
				filmer[i]+=filsep[i][j];
			}
		}
		
		//Printing the values
		for(i=0;i<flen;i++)
		{
			
			System.out.println(filmer[i]+" ");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
			
		}System.out.println("\n************************Source Encoding Completed****************");
		jTextArea1.append("\n\n   Source Encoding Completed");
		}
		
	}

	private void jButton3_actionPerformed(ActionEvent e)
	{
		if (k!=10)
		{
			String msg="Load The File, Complete the Source Encoding and then Start SFCC-N4 Encoding";
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(op,msg)	;
		}
		else
		{
			k=15;
		jTextArea1.append("\n\n   SFCC-N4 Encoding Process Started");
		System.out.println("\n***********************SFCC-N4 Encoding Started**************");
		// TODO: Add any handling code here
		//Seperating the String for SFCC-N4 Encoding
		
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filmer[i].length();j++)
			{
				pakch[i][j]=filmer[i].charAt(j);
			}
		}
		//Printing the values
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filmer[i].length();j++)
			{
				System.out.print(pakch[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}

		
		for(i=0;i<flen;i++)
		{
			for(j=0;j<1;j++)
			{
				if((filmer[i].length())==21)
				{
				shufch[i][0]=pakch[i][5];
				shufch[i][1]=pakch[i][12];
				shufch[i][2]=pakch[i][11];
				shufch[i][3]=pakch[i][9];
				shufch[i][4]=pakch[i][6];
				shufch[i][5]=pakch[i][10];
				shufch[i][6]=pakch[i][8];
				shufch[i][7]=pakch[i][20];
				shufch[i][8]=pakch[i][0];
				shufch[i][9]=pakch[i][4];
				shufch[i][10]=pakch[i][1];
				shufch[i][11]=pakch[i][19];
				shufch[i][12]=pakch[i][13];
				shufch[i][13]=pakch[i][7];
				shufch[i][14]=pakch[i][16];
				shufch[i][15]=pakch[i][3];
				shufch[i][16]=pakch[i][17];
				shufch[i][17]=pakch[i][15];
				shufch[i][18]=pakch[i][2];
				shufch[i][19]=pakch[i][18];
				shufch[i][20]=pakch[i][14];
				}
				else if((filmer[i].length())==18)
				{
				shufch[i][0]=pakch[i][5];
				shufch[i][1]=pakch[i][12];
				shufch[i][2]=pakch[i][11];
				shufch[i][3]=pakch[i][9];
				shufch[i][4]=pakch[i][6];
				shufch[i][5]=pakch[i][10];
				shufch[i][6]=pakch[i][8];
				shufch[i][7]=pakch[i][0];
				shufch[i][8]=pakch[i][4];
				shufch[i][9]=pakch[i][1];
				shufch[i][10]=pakch[i][15];
				shufch[i][11]=pakch[i][7];
				shufch[i][12]=pakch[i][16];
				shufch[i][13]=pakch[i][3];
				shufch[i][14]=pakch[i][17];
				shufch[i][15]=pakch[i][13];
				shufch[i][16]=pakch[i][2];
				shufch[i][17]=pakch[i][14];
				}
				else
				{
				shufch[i][0]=pakch[i][5];
				shufch[i][1]=pakch[i][11];
				shufch[i][2]=pakch[i][10];
				shufch[i][3]=pakch[i][9];
				shufch[i][4]=pakch[i][6];
				shufch[i][5]=pakch[i][2];
				shufch[i][6]=pakch[i][8];
				shufch[i][7]=pakch[i][0];
				shufch[i][8]=pakch[i][4];
				shufch[i][9]=pakch[i][1];
				shufch[i][10]=pakch[i][3];
				shufch[i][11]=pakch[i][7];
				}

			}
		}
		//Bottle neck
		
		if(flen<=50)
			{
			l=(int)(Math.random()*3);
			for(int a=0;a<=3;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else if(flen>=51&&flen<=210)
			{
				l=(int)(Math.random()*4);
				for(int a=31;a<=10;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else if(flen>=251&&flen<=500)
			{
				l=(int)(Math.random()*4);
				for(int a=110;a<=192;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else if(flen>=501&&flen<=750)
			{
				l=(int)(Math.random()*4);
				for(int a=440;a<=501;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else if(flen>=751&&flen<=1000)
			{
				l=(int)(Math.random()*4);
				for(int a=652;a<=751;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}
			else 
			{
				l=(int)(Math.random()*4);
				for(int a=500;a<=610;a+=l)
				{
				j=(int)(Math.random()*10);
				shufch[a][j]='\0';
				}
			}

		//Printing the values
		for(i=0;i<flen;i++)
		{
			for(j=0;j<filmer[i].length();j++)
			{
				System.out.print(shufch[i][j]+" ");
			}
			System.out.print("\n");
			try
				{
					Thread.sleep(2);
				}
				catch (Exception er)
				{
					System.out.println("Sleep Disturbed : "+er);
				}
		}
		//Merging for Transfering
		
		for(i=0;i<flen;i++)
		{
			filtfr[i]="";
			for(j=0;j<filmer[i].length();j++)
			{
				filtfr[i]+=shufch[i][j];
			}
		}
		for(i=0;i<flen;i++)
		{
			
			System.out.println("Packet ["+i+"] = "+filtfr[i]);
			try
			{
				Thread.sleep(2);
			}
			catch (Exception er)
			{
				System.out.println("Sleep Disturbed : "+er);
			}
			
		}
		System.out.println("\n********************SFCC-N4 Encoding Completed**************");
		jTextArea1.append("\n\n   SFCC-N4 Encoding Process Completed");
		}
		
	}

	private void jButton4_actionPerformed(ActionEvent e)
	{
		if (k!=15)
		{
			String msg="Complete the Source Encoding, SFCC-N4 Encoding and then Send the Packets";
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(op,msg)	;
		}
		else
		{
		jTextArea1.append("\n\n   Sending Packets to Destination");
		System.out.println("\nSending Packets Started");
		// TODO: Add any handling code here
		
		try
		{
				Dest1="";
				FileInputStream fis1=new FileInputStream("QueueAddress.txt");
				while((ch=fis1.read())!=-1)
				Dest1+=(char)ch;
				Dest1.trim();

				st=new Socket(Dest1,4500);
				DataOutputStream dos=new DataOutputStream(st.getOutputStream());
				dos.writeInt(flen);	
				dos.writeUTF("Dest2");	
				for(i=0;i<flen;i++)
				{
				dos.writeUTF(filtfr[i]);
				}
				
				
			
		}
		catch (Exception er)
		{
			System.out.println(er);
		}
		jTextArea1.append("\n\n   Packets Sent to Destination");
		System.out.println("\nSending Packets Completed");
		}

	}

	private void jButton5_actionPerformed(ActionEvent e)
	{
		System.out.println("\nExit");
		// TODO: Add any handling code here
		//System.exit(1);
		Runtime.getRuntime().exit(1);
 

	}

	//
	// TODO: Add any method code to meet your needs in the following area
	//






























 

//============================= Testing ================================//
//=                                                                    =//
//= The following main method is just for testing this class you built.=//
//= After testing,you may simply delete it.                            =//
//======================================================================//
	public static void main(String[] args)
	{
		/*JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception ex)
		{
			System.out.println("Failed loading L&F: ");
			System.out.println(ex);
		}*/
		new FECSource2();
	}
//= End of Testing =


}
