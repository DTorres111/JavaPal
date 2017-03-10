import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import java.awt.*;
import sun.audio.*;
import java.io.*;
import java.net.URI;
import java.util.*;


public class JPApp{
	
	public static void main(String args[]) throws Exception{
		
		JPInterface project=new JPInterface();
		project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		project.setSize(1000,1000);
		project.setVisible(true);		
        System.out.println("Choose your tutorial.");
    
	}
	public static void openURL(double choice){
		if(choice==1){ //User Input
		try{
		Desktop d = Desktop.getDesktop();
		d.browse(new URI("https://www.youtube.com/watch?v=5DdacOkrTgo"));
		} catch(Exception ex) {
			System.out.println("Error with opening link.");
			ex.printStackTrace();
		}}else if(choice==2){ //If statements and loops
			try{
				Desktop d = Desktop.getDesktop();
				d.browse(new URI("https://www.youtube.com/watch?v=cVGK_oO-n1A"));
				d.browse(new URI("https://www.youtube.com/watch?v=iMeaovDbgkQ"));
				} catch(Exception ex) {
					System.out.println("Error with opening link.");
					ex.printStackTrace();
				}
		}
		else if(choice==3){ //Arrays
			try{
				Desktop d = Desktop.getDesktop();
				d.browse(new URI("https://www.youtube.com/watch?v=L06uGnF4IpY"));
				} catch(Exception ex) {
					System.out.println("Error with opening link.");
					ex.printStackTrace();
				}
		}
		else if(choice==4){ //Files
			try{
				Desktop d = Desktop.getDesktop();
				d.browse(new URI("https://www.youtube.com/watch?v=jha3T_NmC5A"));
				} catch(Exception ex) {
					System.out.println("Error with opening link.");
					ex.printStackTrace();
				}
		}
		else if(choice==5){ //Exceptions
			try{
				Desktop d = Desktop.getDesktop();
				d.browse(new URI("https://www.youtube.com/watch?v=K_-3OLkXkzY"));
				} catch(Exception ex) {
					System.out.println("Error with opening link.");
					ex.printStackTrace();
				}
		}
		else if(choice==6){ //METHODS
			try{
				Desktop d = Desktop.getDesktop();
				d.browse(new URI("https://www.youtube.com/watch?v=-IJ5izjbWIA"));
				} catch(Exception ex) {
					System.out.println("Error with opening link.");
					ex.printStackTrace();
				}
		}
	}
	public static void playSound() {
		try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\dany4\\Music\\Merchants-Of-Novigrad-feat.wav").getAbsoluteFile());
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
	
        clip.start();
	
		} catch(Exception ex) {
		System.out.println("Error with playing sound.");
		ex.printStackTrace();
		}
	}
	

}