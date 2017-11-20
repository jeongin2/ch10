

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class dragging extends JFrame {
	public dragging() {
		setTitle("드래깅동안 YELLOW");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);	//배경색 초록색으로 set
		MyMouseMotionListener mo = new MyMouseMotionListener();
		c.addMouseMotionListener(mo);
		c.addMouseListener(mo);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyMouseMotionListener extends MouseAdapter implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {//마우스 드래그함수
			Container c = (Container)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {//마우스 떼었을때 함수
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN);
		}		
	}
	static public void main(String [] args) {
		new dragging();
	}
}
