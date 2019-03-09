import java.io.*;
import javax.swing.*;

public class Aluno3{
  
  public static void main(String [] arg){

    int op, cont=0;
    Aluno a[];
    a=new Aluno[50];

    op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada\n1-Inserir\n2-Pesquisar\n3-Excluir\n4-Imprimir\n5-Sair"));
   
    while (op!=5){
      if(op==1){
        a[cont]=new Aluno();
        a[cont].setNome(JOptionPane.showInputDialog("Digite o Nome do Aluno " + (cont+1) + ":"));
        a[cont].setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a Matricula do Aluno " + (cont+1) + ":")));
        a[cont].setCurso(JOptionPane.showInputDialog("Digite o Curso do Aluno " + (cont+1) + ":"));
        a[cont].setSexo(JOptionPane.showInputDialog("Digite o Sexo do Aluno " + (cont+1) + ":").charAt(0));
        a[cont].setMedia(Double.parseDouble(JOptionPane.showInputDialog("Digite a Media do Aluno " + (cont+1) + ":")));
        cont++;   
      }

      if(op==2){
        String nome= JOptionPane.showInputDialog("Digite o nome do aluno que deseja pesquisar: ");
        for(int i=0; i<cont; i++){
          if(nome.equals(a[i].getNome())){
            JOptionPane.showMessageDialog(null,"Aluno " + (i+1) + ":" + "\nNome: " + a[i].getNome() + "\nMatricula: " + a[i].getMatricula() + "\nCurso: " + a[i].getCurso() + "\nSexo: " + a[i].getSexo() + "\nMedia: " + a[i].getMedia());

          }
        }
      }
      
      if(op==3){
        int mat= Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da matricula que deseja excluir"));
        int cont2=0;
        for(int i=0; i<cont; i++){
          if(mat!=(a[i].getMatricula())&& cont2<cont){
            cont2++;
          }
        } 
        
        for(int i=cont2; i<cont; i++){
          a[i]=new Aluno();
          a[i]= a[i+1];
        }
        
        cont--;
      }
      
      if(op==4){
        for(int i=0; i<cont; i++){
          JOptionPane.showMessageDialog(null, "Aluno" + (i+1) + ":" + "\nNome: " + a[i].getNome() + "\nMatricula: " + a[i].getMatricula() + "\nCurso: " + a[i].getCurso() + "\nSexo: " + a[i].getSexo() + "\nMedia: " + a[i].getMedia());
        }
      }

      op= Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada\n1-Inserir\n2-Pesquisar\n3-Excluir\n4-Imprimir\n5-Sair"));
    } 
  }
}