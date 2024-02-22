public class Dev {
    private String nome;
    private String email;
    private int xp;

    public Dev(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.xp = 0;
    }

    // Método para progredir no curso e atualizar XP do dev
    public void progredirCurso(Curso curso) {
        curso.progredir(); // Chamando o método progredir do curso
        xp += curso.getCargaHoraria(); // Aumentando o XP do dev conforme carga horária do curso
    }

    // Método para progredir na mentoria e atualizar XP do dev
    public void progredirMentoria(Mentoria mentoria) {
        System.out.println("Participando da mentoria: " + mentoria.getNome());
        xp += mentoria.getCargaHoraria(); // Aumentando o XP do dev conforme carga horária da mentoria
    }

    // Método para calcular XP total obtido pelo dev
    public int calcularXP() {
        return xp;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
