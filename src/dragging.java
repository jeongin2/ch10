

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class dragging extends JFrame {
	public dragging() {
		setTitle("�巡�뵿�� YELLOW");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);	//���� �ʷϻ����� set
		MyMouseMotionListener mo = new MyMouseMotionListener();
		c.addMouseMotionListener(mo);
		c.addMouseListener(mo);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyMouseMotionListener extends MouseAdapter implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {//���콺 �巡���Լ�
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {//���콺 �������� �Լ�
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN);
		}		
	}
	static public void main(String [] args) {
		new dragging();
	}
}
