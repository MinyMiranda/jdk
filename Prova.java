import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Prova extends JFrame{
  
    Double F, P, R;
	private Label l1;
	private Label l2;
	private Label l3;
	
	private TextField tf1;
	private TextField tf2;
	private TextField tf3;

	private Button b1;
	private Button b2;
	private Button b3;
	
	private Panel p1;
	private Panel p2;
	private Panel p3;
	private Panel p4;
	private Panel p5;

    
	public Prova(){
	
	l1= new Label("Frequencia(HZ): ");
	l2= new Label("Numero de polos: ");
	l3= new Label("Rotacoes por minuto: ");
	
	tf1= new TextField();
	tf2= new TextField();
	tf3= new TextField();

		
	b1= new Button("Limpar");
	b2= new Button("Sair");
	b3= new Button ("Calcular");

	p1= new Panel();
	p2= new Panel();
	p3= new Panel();
	p4= new Panel();
	p5= new Panel();
	

	p1.setLayout(new GridLayout(2,2));
	p2.setLayout(new GridLayout(2,1));
	p3.setLayout(new GridLayout(1,2));
	p4.setLayout(new GridLayout(1,1));
	p5.setLayout(new GridLayout(3,1));
	

	setLayout( new BorderLayout());

	p1.add(l1);
	p1.add(l2);
	p1.add(tf1);
	p1.add(tf2);
	
	p2.add(l3);
	p2.add(tf3);

	p3.add(b1);
	p3.add(b2);
	
	p4.add(b3);
    
	p5.add(p1);
	p5.add(p2);
	p5.add(p3);
	
	b1.addActionListener(new Acaob1());
    b2.addActionListener(new Acaob2()); 
	b3.addActionListener(new Acaob3()); 

	add(p5, BorderLayout.CENTER);
	add(p4, BorderLayout.EAST);	
	


	
	
	
	
}
	   

//LIMPAR
 
	

class Acaob1 implements ActionListener{
	  public void actionPerformed(ActionEvent evt){
	  tf2.setText("");
	  tf1.setText("") ;
	  tf3.setText("");
	  
	  
	  
//SAIR
	 }
       }

	   class Acaob2 implements ActionListener{
	public void actionPerformed(ActionEvent evt){
	   System.exit(0);
	    }
	}


//CALCULAR

	class Acaob3 implements ActionListener{
	
	public void actionPerformed(ActionEvent evt){
	F=Double.parseDouble(tf1.getText());
	P=Double.parseDouble(tf2.getText());
	R=(120*F)/P;
	tf3.setText(""+R);
	
	}
	}
   

public static void main(String [] arg){
	
	Prova p2 = new Prova();
	p2.pack();
	p2.setVisible(true);

	}
}