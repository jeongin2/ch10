import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class keyplusminus extends JFrame {
 public keyplusminus() {
  setTitle("+,- Ű�� ��Ʈ ũ�� ����");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JLabel la = new JLabel("Love Java");
  Container c = getContentPane(); 
  la.addKeyListener(new MyKeyListener());
  c.setLayout(new FlowLayout());
  c.add(la);
  la.setFont(new Font("Arial", Font.PLAIN, 10));//Arial ��Ʈ�� 10�ȼ� ũ��
  setSize(300,150);
  setVisible(true);
  
  la.setFocusable(true);
  la.requestFocus();
 }
 class MyKeyListener extends KeyAdapter {
  public void keyPressed(KeyEvent e) {
   if(e.getKeyChar() == '+') {//+Ű ������
    JLabel la= (JLabel)e.getSource();
    Font f = la.getFont();
    int size = f.getSize();
    la.setFont(new Font("Arial", Font.PLAIN, size+5));//ũ��5����
   }
   else if(e.getKeyChar() == '-') {//-Ű ������
    JLabel la= (JLabel)e.getSource();
    Font f = la.getFont();
    int size = f.getSize();
    if(size <= 5)//ũ�� 5����
     return;
    la.setFont(new Font("Arial", Font.PLAIN, size-5));
   }
 }
 }
 
 public static void main(String[] args) {
  new keyplusminus();
 }
 }