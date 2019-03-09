import java.io.*;
import javax.swing.*;
public class Gerenciador{
      
     public static void main(String [] arg){
     CaixaDagua a;
     a=new CaixaDagua();
     int op;
	 
	 op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n1-Inicializar Caixa D'agua \n2- Adcionar Agua \n3- Retirar Agua \n4 Imprimir Situacao \n5-Sair "));
	 
	 while(op!=5 && (op==1 || op==2 || op==3 || op==4) ){
	     
		 if(op==1){
		 a.setCaixaCheia(false);
		 a.setCaixaVazia(true);
		 a.setLitros(0);
		 a.setCapacidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da caixa dagua ")));
	   }
	   
	     if(op==2){
		 int litros = a.getLitros()  + Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de litros"));
		 a.setLitros(litros);
		 if(a.getCaixaVazia()==true){
		 a.setCaixaVazia(false);
		 }
		 if(a.getLitros()>= a.getCapacidade() ){
		 a.setCaixaCheia(true);
		 JOptionPane.showMessageDialog(null,"Caixa Transbordando !");
		 }
		 }
		 
		 if(op==3){
		 if(a.getCaixaVazia()==true){
		 JOptionPane.showMessageDialog(null,"A caixa  esta vazia, nao podendo retirar agua");
		 }
		 else{
		 
		 int litros =(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de litros que deseja retirar")));
		 if(litros >= a.getLitros() ) {
		 a.setCaixaVazia(true);
		 JOptionPane.showMessageDialog(null,"Caixa Vazia");
		 }
		 
		 if(a.getCaixaCheia()==true){
		 a.setCaixaCheia(false);
		 }
		 
		 int litros2 = a.getLitros() - litros  ;
		 a.setLitros(litros2);
		 }
	 }
	 
	     if(op==4){
	     JOptionPane.showMessageDialog(null,"SITUACAO DA  CAIXA D'AGUA DO IFBA: \nCaixa Cheia: " + a.getCaixaCheia() + "\nCaixa Vazia: " + a.getCaixaVazia() + "\nLitros: " + a.getLitros() + "\nCapacidade: " + a.getCapacidade() );
	 
	    }
		
	     op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n1-Inicializar Caixa D'agua \n2- Adcionar Agua \n3- Retirar Agua \n4- Imprimir Situacao \n5-Sair "));
      
	 }  
	
}
}