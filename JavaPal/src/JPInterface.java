    import java.net.URI;
	import java.awt.event.*;
	import javax.swing.*;
	import java.awt.*;	

	public class JPInterface extends JFrame{

		private JButton item1;
		private JButton item2;
		private JButton item3;
		private JButton item4;	
		private JButton item5;
		private JButton item6;
	    private JButton item8;
	    private JButton item9;
	    private JLabel item10;
	   
		public JPInterface(){
			super("Welcome to JAVAPAL! An Interactive Guide to Basic Java Programming!");
			
			setLayout(new FlowLayout());
			//User Input
			item1=new JButton("User Input");
			item1.setBackground(Color.WHITE);
			item1.setForeground(Color.BLACK);
			item1.setFont(new Font("Arial", Font.PLAIN, 40));
			add(item1);
			//If Statements
			item2=new JButton("If statements and loops");
			item2.setBackground(Color.WHITE);
			item2.setForeground(Color.BLACK);
			item2.setFont(new Font("Arial", Font.PLAIN, 40));
			add(item2);
			//Arrays
			item3=new JButton("Arrays");
			item3.setBackground(Color.WHITE);
			item3.setForeground(Color.BLACK);
			item3.setFont(new Font("Arial", Font.PLAIN, 40));
			add(item3);
			//Files
			item4= new JButton("Files");
			item4.setBackground(Color.WHITE);
			item4.setForeground(Color.BLACK);
			item4.setFont(new Font("Arial", Font.PLAIN, 40));
			add(item4);
			//Exceptions
			item5= new JButton("Exceptions");
			item5.setBackground(Color.WHITE);
			item5.setForeground(Color.BLACK);
			item5.setFont(new Font("Arial", Font.PLAIN, 40));
			add(item5);
			//Methods
			item6= new JButton("Methods");
			item6.setBackground(Color.WHITE);
			item6.setForeground(Color.BLACK);
			item6.setFont(new Font("Arial", Font.PLAIN, 40));
			add(item6);
			
			
			item8= new JButton("Play Music");
			item8.setBackground(Color.WHITE);
			item8.setForeground(Color.BLACK);
			item8.setFont(new Font("Arial", Font.PLAIN, 20));
			add(item8);
			
			item9= new JButton("EXTRA: Time Management App");
			item9.setBackground(Color.WHITE);
			item9.setForeground(Color.BLACK);
			item9.setFont(new Font("Arial", Font.PLAIN, 20));
			add(item9);
			
			item10=new JLabel(new ImageIcon("C:\\Users\\dany4\\Pictures\\JavaPalLogo.jpg"));
			add(item10);
			
			TheHandler handler=new TheHandler();
			item1.addActionListener(handler);
			item2.addActionListener(handler);
			item3.addActionListener(handler);
			item4.addActionListener(handler);
			item5.addActionListener(handler);
			item6.addActionListener(handler);
			item8.addActionListener(handler);
			item9.addActionListener(handler);
	
	
		}
		
		private class TheHandler implements ActionListener{
			int count1=1;
			int count2=1;
			int count3=1;
			int count4=1;
			int count5=1;
			int count6=1;
			int count7=1;
		
			public void actionPerformed(ActionEvent event){
				
				
				if(event.getSource()==item1&&count1==1){
					item1.setBackground(Color.YELLOW);
					System.out.println("USER INPUT");
				    JPApp.openURL(1);
				
					count1=0;
				}else if(event.getSource()==item1&&count1==0){
					item1.setBackground(Color.WHITE);
					count1=1;
					
				}else if(event.getSource()==item2&&count2==1){
					item2.setBackground(Color.YELLOW);
					System.out.println("IF STATEMENTS & LOOPS");
				    JPApp.openURL(2);
					count2=0;
				}else if(event.getSource()==item2&&count2==0){
					item2.setBackground(Color.WHITE);
					count2=1;
					
				}else if(event.getSource()==item3&&count3==1){
					item3.setBackground(Color.YELLOW);
					System.out.println("ARRAYS");
				    JPApp.openURL(3);
					count3=0;
				}else if(event.getSource()==item3&&count3==0){
					item3.setBackground(Color.WHITE);
					count3=1;	
					
				}else if(event.getSource()==item4&&count4==1){
					item4.setBackground(Color.YELLOW);
					System.out.println("FILES");
				    JPApp.openURL(4);
					count4=0;
				}else if(event.getSource()==item4&&count4==0){
					item4.setBackground(Color.WHITE);
					count4=1;
					
				}else if(event.getSource()==item5&&count5==1){
					item5.setBackground(Color.YELLOW);
					System.out.println("EXCEPTIONS");
				    JPApp.openURL(5);
					count5=0;
				}else if(event.getSource()==item5&&count5==0){
					item5.setBackground(Color.WHITE);
					count5=1;
					
				}else if(event.getSource()==item6&&count6==1){
					item6.setBackground(Color.YELLOW);
					System.out.println("METHODS");
				    JPApp.openURL(6);
					count6=0;
				}else if(event.getSource()==item6&&count6==0){
					item6.setBackground(Color.WHITE);
					count6=1;	
					
				}else if(event.getSource()==item9&&count7==1){
					item9.setBackground(Color.YELLOW);
					System.out.println("TIME MANAGEMENT APP");
					Scan.main(new String[0]);
					count7=0;
				}else if(event.getSource()==item9&&count7==0){
					item9.setBackground(Color.WHITE);
					count7=1;	
					
				}else if(event.getSource()==item8){
					JPApp.playSound();
				}				
				}	
	
		}}
