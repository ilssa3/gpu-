import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Image;


public class tryous extends JFrame {

	Image image;//out of methods image => not a final value

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {//runnable
			public void run() {
				try {
					tryous frame = new tryous();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tryous() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500); // frame size + !!! icon and name bar!!!
		setLocationRelativeTo(null);
		setVisible(true);
		
		 image = new ImageIcon ("image :p").getImage(); //image here 
		
		
		
	}
	public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g; // draw with this
		
		g2d.setStroke(new BasicStroke(5)); // line thickness
		
		g2d.setPaint(Color.pink); // set color to the lines
		g2d.drawRect(50, 100, 50, 250);
		
		g2d.setPaint(new Color(164, 128, 128));
		g2d.drawLine(0, 20, 500, 500);
		
		g2d.setPaint(new Color(64, 128, 128));
		g2d.fillRect(100,100,25,25);
		
		g2d.setPaint(new Color(164, 18, 121));
		g2d.drawOval(200,200,100,100);
		g2d.fillOval(200,200,100,100);
		
		g2d.setPaint(new Color(70, 18, 141));
		g2d.drawArc(35, 35,100, 100, 0, 180);
		g2d.setPaint(new Color(164, 18, 121));
		g2d.drawArc(35, 35,100, 100, 180, 180);
		
		g2d.setPaint(Color.yellow);
		int[] px = {300,250,400};//points for x (x,y,?)
		int[] py = {250,100, 400};
		g2d.drawPolygon(px, py, 3);
		
		g2d.setPaint(Color.ORANGE);
		g2d.setFont(new Font("Times New Roman", Font.BOLD, 57));
		g2d.drawString("dummy", 70, 470);//sets bottom left corner to the (x;y)
		
		g2d.drawImage(image,70,70,null);// image upload inicialised = > 10;37
	}
}
