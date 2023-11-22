package Abstruct;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.StringValueExp;
import javax.swing.*;

public class caculator {
	double firstnum;
	double senum;
	double result;
	String operator;
	caculator(){
JFrame jf=new JFrame("Caculator");
		
		JTextArea t=new JTextArea();
		t.setBounds(0,0, 200, 50);
		t.setBackground(Color.gray);
		
		JButton a = new JButton("1");
		a.setBounds(0, 200, 50, 50);
a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+a.getText();
				t.setText(con);
				
				
			}
		});
		JButton b = new JButton("2");
		b.setBounds(50, 200, 50, 50);
b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+b.getText();
				t.setText(con);
			
			}
		});
		JButton c = new JButton("3");
		c.setBounds(100, 200, 50, 50);
c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+c.getText();
				t.setText(con);
				
			}
		});
		
		JButton d = new JButton("4");
		d.setBounds(0, 150, 50, 50);
d.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+d.getText();
				t.setText(con);
				
			}
		});
		JButton e5 = new JButton("5");
		e5.setBounds(50, 150, 50, 50);	
e5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+e5.getText();
				t.setText(con);
				
			}
		});
		JButton f = new JButton("6");
		f.setBounds(100, 150, 50, 50);
f.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+f.getText();
				t.setText(con);
				
			}
		});
		JButton g = new JButton("7");
		g.setBounds(0,100, 50, 50);	
g.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+g.getText();
				t.setText(con);
				
			}
		});
		JButton h = new JButton("8");
		h.setBounds(50, 100, 50, 50);
h.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+h.getText();
				t.setText(con);
				
			}
		});
		JButton i = new JButton("9");
		i.setBounds(100, 100, 50, 50);	
i.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+i.getText();
				t.setText(con);
				
			}
		});
		JButton z = new JButton("0");
		z.setBounds(0, 250, 50, 50);
z.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+z.getText();
				t.setText(con);
				
			}
		});
		JButton z2 = new JButton("00");
		z2.setBounds(50, 250, 50, 50);
z2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+z2.getText();
				t.setText(con);
				
			}
		});
		JButton dot = new JButton(".");
		dot.setBounds(100, 250, 50, 50);
dot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String con=t.getText()+dot.getText();
				t.setText(con);
				
			}
		});
		
		JButton ac = new JButton("AC");
		ac.setBounds(0, 50, 50, 50);
ac.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t.setText(null);
				
			}
		});
		JButton clear = new JButton("De");
		clear.setBounds(50, 50, 50, 50);
clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				 String st=t.getText();
				 t.setText(null);
	                for (int i =0 ; i< st.length()-1;i++)
	                    t.setText(t.getText()+st.charAt(i));
				
			}
		});
		
		
		JButton sum = new JButton("+");
		sum.setBounds(150, 200, 50, 50);
sum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				firstnum=Double.parseDouble(t.getText());
				t.setText("");
				operator="+";
				
				
			}
		});
		JButton sub = new JButton("-");
		sub.setBounds(150, 150, 50, 50);
sub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstnum=Double.parseDouble(t.getText());
				t.setText("");
				operator="-";
				
			}
		});
		JButton mul = new JButton("x");
		mul.setBounds(150, 100, 50, 50);
mul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstnum=Double.parseDouble(t.getText());
				t.setText("");
				operator="*";
				
				
			}
		});
		JButton div = new JButton("/");
		div.setBounds(150, 50, 50, 50);
div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstnum=Double.parseDouble(t.getText());
				t.setText("");
				operator="/";
				
			}
		});
		JButton mod = new JButton("%");
		mod.setBounds(100, 50, 50, 50);
mod.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				firstnum=Double.parseDouble(t.getText());
				t.setText("");
				operator="%";
				
			}
		});
		JButton eq = new JButton("=");
		eq.setBounds(150, 250, 50, 50);
eq.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				senum=Double.parseDouble(t.getText());
				if (operator == "+"){
                    result = firstnum + senum;
                    t.setText(String.valueOf(result));
                }
                if (operator == "-"){
                    result = firstnum - senum ;
                    t.setText(String.valueOf(result));
                }
                if (operator == "*"){
                    result = firstnum * senum ;
                    t.setText(String.valueOf(result));
                }
                if (operator == "/"){
                    result = firstnum / senum ;
                    t.setText(String.valueOf(result));
                }
                if (operator == "%"){
                    result = firstnum % senum ;
                    t.setText(String.valueOf(result));
                }
				
				
				
			}
		});
		
		
		jf.setSize(215, 350);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.add(ac);
		jf.add(t);
		jf.add(a);
		jf.add(b);
		jf.add(c);
		jf.add(d);
		jf.add(e5);
		jf.add(f);
		jf.add(g);
		jf.add(h);
		jf.add(i);
		jf.add(z);
		jf.add(z2);
		jf.add(dot);
		jf.add(clear);
		jf.add(mod);
		jf.add(div);
		jf.add(mul);
		jf.add(sub);
		jf.add(sum);
		jf.add(eq);
		
		
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new caculator();
		
	}
}
		