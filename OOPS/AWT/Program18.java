import java.awt.*;
import java.awt.event.*;

class Program18 extends Frame implements ActionListener{

    Label L1,L2,L3;
	TextField T1,T2,T3;
	Button B1,B2,B3,B4;

    Program18()
    {
        setLayout(null);

        L1 = new Label("Number 1");
		T1 = new TextField(10);

		L2 = new Label("Number 2");
		T2 = new TextField(10);

        B1 = new Button("Add");
        B2 = new Button("Subtract");
        B3 = new Button("Product");
        B4 = new Button("Division");

		L3 = new Label("Result");
		T3 = new TextField(10);
		
        L1.setBounds(100,100,60,20);
        add(L1);
        T1.setBounds(200,100,100,20);
        add(T1);

        L2.setBounds(100,130,60,20);
        add(L2);
        T2.setBounds(200,130,100,20);
        add(T2);
		
        B1.setBounds(80,180,50,20);
        add(B1);
        B1.addActionListener(this);

        B2.setBounds(160,180,50,20);
        add(B2);
        B2.addActionListener(this);

        B3.setBounds(240,180,50,20);
        add(B3);
        B3.addActionListener(this);

        B4.setBounds(320,180,50,20);
        add(B4);
        B4.addActionListener(this);

		L3.setBounds(100,230,60,20);
        add(L3);
        T3.setBounds(200,230,100,20);
        add(T3);
    }

    public void actionPerformed(ActionEvent ae)
	{
		int a,b,ans=0; 
        String result;
        a = Integer.parseInt(T1.getText());
		b = Integer.parseInt(T2.getText());
		//System.out.println(ae.getSource());
		if (ae.getSource()==B1)
		{
			ans=a+b;			
		}
        else if (ae.getSource()==B2)
		{
			ans=a-b;			
		}
        else if (ae.getSource()==B3)
		{
			ans=a*b;			
		}
        else if (ae.getSource()==B4)
		{
			ans=a/b;			
		}

        result=String.valueOf(ans);
        T3.setText(result);
		
	}	
    public static void main(String args[])
	{
		
		Program18 obj = new Program18();

		obj.setSize(500,400);

		obj.setVisible(true);
		
	}
}