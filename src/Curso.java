import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

class Testa {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        cursos.sort(Comparator.comparing(Curso::getAlunos));
//        cursos.forEach(al -> System.out.println(al.getAlunos()));

//        cursos.stream()
//                .filter(curso -> curso.getAlunos() >= 150)
//                .findAny()
//                .ifPresent(curso -> System.out.println(curso.getNome()));

        List<Curso> cursoList = new ArrayList<>();
        cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .findFirst();

        cursoList.forEach(Curso::getNome);

//        Curso cursoOptional = any.orElse(null);
//        any.ifPresent(curso -> System.out.println(curso.getNome()));
    }
}