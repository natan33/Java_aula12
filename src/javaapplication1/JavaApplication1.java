
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class JavaApplication1 {

  
    public static void main(String[] args) {
        
        //Instanciando Objetos
        Aluno a1 = new Aluno("Maria",33);
        Aluno a2 = new Aluno("Maria",33);
        Aluno a3 = new Aluno("Maria",33);
        
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
        
         //Para não fazer repetição "set".
        Set<Aluno> listaAlunoSet = new HashSet<>();
        listaAlunoSet.add(a1);
        listaAlunoSet.add(a2);
        listaAlunoSet.add(a3);
        
       
        for (Aluno listaAlunoSet1 : listaAlunoSet) {
            System.out.println("Nome: "+listaAlunoSet1.getNome()+"\nIdade: "+listaAlunoSet1.getIdade()+"anos");
        }
        
        //Para fazer comparação.
        System.out.println(a1.equals(a3));
    }
    
}
