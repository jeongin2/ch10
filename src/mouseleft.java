
import java.awt.event.*; 
import javax.swing.*; 
import java.util.*; 
public class mouseleft extends JFrame { 
 	JPanel pa = new JPanel(); 
 	JLabel la = new JLabel("Love Java "); 
 	public mouseleft() { 
 		setTitle("Left Ű�� ���ڿ� ��ü"); 
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 		setContentPane(pa);//����Ʈ�ҿ� �г� ���̱�
 		pa.addKeyListener(new MyKeyListener()); 
 		pa.add(la);
 		 
 		setSize(300,150); 
 		setVisible(true); 
 		pa.requestFocus();
 	} 
 	
 	class MyKeyListener extends KeyAdapter { 
 		String s = la.getText();//���� ���� �о����
 		int i = 0; 
 		public void keyPressed(KeyEvent e) { 
 			int key = e.getKeyCode(); 
 			if(key == KeyEvent.VK_LEFT) {//���� Ű ������
 				i++; 
 				la.setText(s.substring(i) + s.substring(0, i));//�������� ��ĭ�� �̵�
 			} 
 			if(i == s.length()) i = 0;
 		} 
 	} 
 	public static void main(String[] args) { 
 		new mouseleft(); 
 	} 
} 
