package ifsp.lp3a5.lista2.ex4;

import java.util.Comparator;

public class Avaliacao implements Comparator<Avaliacao> {
    public String aluno, disciplina;
    public double nota;

    public Avaliacao(String aluno, String disciplina, double nota) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int compare(Avaliacao o1, Avaliacao o2) {
        return o1.getAluno().compareTo(o2.getAluno());
    }
}
