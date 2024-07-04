import java.awt.*;
import java.awt.event.*;

class Program17 extends Frame implements ActionListener{

	Label L1,L2,L3,L4;
	TextField T1,T2,T3,T4;
	Button B1;
	Program17()
	{
		

		setLayout(new FlowLayout());

		L1 = new Label("Num 1");
		T1 = new TextField(10);

		L2 = new Label("Num 2");
		T2 = new TextField(10);

		L3 = new Label("Num 3");
		T3 = new TextField(10);
		
		B1 = new Button("Largest");

		L4 = new Label("Result");
		T4 = new TextField(10);

		add(L1);
		add(T1);

		add(L2);
		add(T2);
		
		add(L3);
		add(T3);

		add(B1);
		B1.addActionListener(this);

		add(L4);
		add(T4);


	}

	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c,large; 
		//System.out.println(ae.getSource());
		if (ae.getSource()==B1)
		{
			a = Integer.parseInt(T1.getText());
			b = Integer.parseInt(T2.getText());
			c = Integer.parseInt(T3.getText());

			large=0;
			if(a>b && a>c)
			{
				large=a;
			}
			else if(b>c && b>a)
				large=b;
			else
				large=c;
			String result=String.valueOf(large);
			T4.setText(result);
		}
		
	}	

	public static void main(String args[])
	{
		
		Program17 obj = new Program17();

		obj.setSize(500,400);

		obj.setVisible(true);
		
	}
}