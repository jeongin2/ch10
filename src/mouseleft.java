
import java.awt.event.*; 
import javax.swing.*; 
import java.util.*; 
public class mouseleft extends JFrame { 
 	JPanel pa = new JPanel(); 
 	JLabel la = new JLabel("Love Java "); 
 	public mouseleft() { 
 		setTitle("Left 키로 문자열 교체"); 
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 		setContentPane(pa);//컨탠트팬에 패널 붙이기
 		pa.addKeyListener(new MyKeyListener()); 
 		pa.add(la);
 		 
 		setSize(300,150); 
 		setVisible(true); 
 		pa.requestFocus();
 	} 
 	
 	class MyKeyListener extends KeyAdapter { 
 		String s = la.getText();//라벨의 문자 읽어오기
 		int i = 0; 
 		public void keyPressed(KeyEvent e) { 
 			int key = e.getKeyCode(); 
 			if(key == KeyEvent.VK_LEFT) {//왼쪽 키 누르면
 				i++; 
 				la.setText(s.substring(i) + s.substring(0, i));//왼쪽으로 한칸씩 이동
 			} 
 			if(i == s.length()) i = 0;
 		} 
 	} 
 	public static void main(String[] args) { 
 		new mouseleft(); 
 	} 
} 
