public class Curso {
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private boolean pago;
    private int xp;

    public Curso(String nome, String descricao, int cargaHoraria, boolean pago) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.pago = pago;
        this.xp = 0;
    }

    // Método para que o aluno progrida no curso e ganhe 100 XP
    public void progredir() {
        xp += 100; // Aumenta o XP em 100 a cada progresso no curso
        System.out.println("Aluno progrediu no curso: " + nome);
    }

    // Método para obter o XP do curso
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
