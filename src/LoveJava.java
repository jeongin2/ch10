import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoveJava extends JFrame{
	public LoveJava() {
		setTitle("���콺 �ø��� ������"); 
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 		Container c = getContentPane();
 		c.setLayout(new FlowLayout());
 		JLabel la = new JLabel("�����");
 		la.addMouseListener(new MyMouseListener());
 		c.add(la);
 		
 		setSize(500,200);
 		setVisible(true);
	}

	public static void main(String[] args) {
		new LoveJava();
	}

}
class MyMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JLabel b = (JLabel)e.getSource();
		if(b.getText().equals("�����"))
			b.setText("Love Java");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JLabel b = (JLabel)e.getSource();
		if(b.getText().equals("Love Java"))
			b.setText("�����");
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
