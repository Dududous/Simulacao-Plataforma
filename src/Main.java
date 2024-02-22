public class Main {
    public static void main(String[] args) {
        // Criando um bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp de Desenvolvimento Web", "Bootcamp focado em desenvolvimento web", 40);

        // Criando e adicionando cursos
        Curso cursoJava = new Curso("Java Básico", "Curso introdutório de Java", 20, true);
        Curso cursoPOO = new Curso("POO em Java", "Curso de Programação Orientada a Objetos em Java", 30, true);
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoPOO);

        // Criando e adicionando mentorias
        Mentoria mentorJava = new Mentoria("Mentoria de Java", "Mentoria sobre desenvolvimento em Java", 10, "Segunda-feira, 14:00");
        Mentoria mentorPOO = new Mentoria("Mentoria de POO", "Mentoria sobre POO em Java", 15, "Quarta-feira, 10:00");
        bootcamp.adicionarMentoria(mentorJava);
        bootcamp.adicionarMentoria(mentorPOO);

        // Criando e adicionando devs
        Dev dev1 = new Dev("João", "joao@example.com");
        Dev dev2 = new Dev("Maria", "maria@example.com");
        bootcamp.adicionarDev(dev1);
        bootcamp.adicionarDev(dev2);

        // Progresso do dev no bootcamp
        for (Curso curso : bootcamp.getCursos()) {
            dev1.progredirCurso(curso);
            dev2.progredirCurso(curso);
        }

        for (Mentoria mentoria : bootcamp.getMentorias()) {
            dev1.progredirMentoria(mentoria);
            dev2.progredirMentoria(mentoria);
        }

        // Exibir XP total dos devs
        System.out.println("XP total do dev1: " + dev1.calcularXP());
        System.out.println("XP total do dev2: " + dev2.calcularXP());
    }
}

