import java.swing.*;
import java.io.*;

 public class Cadastro{
	public static void main(String [] arg){
	
		Funcionario f[];
		f=new Funcionario[20];
		Aluno a[];
		a=new Aluno[20];
		int opcao, op;
		opcao=Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n1-Cadastro \n2-Pesquisa \n3-Impressao \n4-Sair"));
		while(opcao!=4)){
		
		
		if(opcao==1){
		op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n1-Aluno    \n2-Funcionario \n3-Voltar);
		 if(op==1){
		
          for (int i=0; i<20; i++){
           f[i]=new Aluno();
		   f[i].setNome(JOptionPane.showInputDialog("Informe o nome do Aluno"));
           f[i].setNome(JOptionPane.showInputDialog("Informe o nome da mãe do Aluno"));
           f[i].setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a Matricula do seu novo Aluno")));
           f[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Aluno")));
           f[i].setSexo(JOptionPane.showInputDialog("Informe qual o sexo").charAt(0));
           f[i].setMedia(Double.parseDouble(JOptionPane.showInputDialog("informe qual a media")));
}

		}








		}

  
}
}
}