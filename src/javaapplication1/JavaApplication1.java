
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class JavaApplication1 {

  
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maria",31);
        Aluno a2 = new Aluno("Maria",33);
        Aluno a3 = new Aluno("Marta",45);
         //para fazer list
        List<Aluno> listaAluno = new ArrayList<>();
//        listaAluno.add(a1);
//        listaAluno.add(a2);
//        listaAluno.add(a3);
        //'ctrl + /' para comenta varias linhas
        
        listaAluno.addAll(Arrays.asList(a1,a2,a3));
         
        
        //para ver a lista por inteiro
      
        for (Aluno listaAluno1 : listaAluno) {
            System.out.println("Nome: "+listaAluno1.getNome()
                    +" com idade: "+listaAluno1.getIdade()
                    +" anos");
            
        }
    }
    
}
