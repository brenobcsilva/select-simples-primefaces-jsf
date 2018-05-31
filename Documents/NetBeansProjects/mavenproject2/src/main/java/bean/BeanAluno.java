
package bean;

import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class BeanAluno {
    
    private List<Aluno> alunos;
    private Aluno aluno;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
}
