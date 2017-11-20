import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class clickrandom extends JFrame {
private JLabel la = new JLabel("C");//"C"를 출력하는 라벨
 
 public clickrandom() {
  setTitle("클릭 연습용 응용프로그램");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Container c = getContentPane();
  c.addMouseListener(new MyMouseAdapter());
  c.setLayout(null);
  c.setLocation(100,100);
  la.setSize(10,10);
  c.add(la);
  setSize(250,250);
  setVisible(true);
  la.requestFocus();
 }
 class MyMouseAdapter extends MouseAdapter
 {
  public void mousePressed(MouseEvent e) {//마우스 눌렀을 때 함수
   la.setLocation(((int)(Math.random()*200)+50),((int)(Math.random()*200)+50));// ġ (50~250)
  }//랜덤으로 위치 set
 }
 public static void main(String[] args) {
  new clickrandom();
 }
}