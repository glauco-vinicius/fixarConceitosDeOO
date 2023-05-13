package org.catolicasc.educational;

public class ExcecaoDeAlunoNaoMatriculadoNoCurso extends Exception {
    public ExcecaoDeAlunoNaoMatriculadoNoCurso(Aluno aluno, Curso curso) {
        super("O aluno [" + aluno.getMatricula() + "] " + aluno.getNome() + " no curso " + curso.getNome() );
    }
}
