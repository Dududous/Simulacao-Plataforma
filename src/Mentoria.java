public class Mentoria {
    private String nome;
    private String descricao;
    private int cargaHoraria;
    private String horario;

    public Mentoria(String nome, String descricao, int cargaHoraria, String horario) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.horario = horario;
    }

    // Método para obter o nome da mentoria
    public String getNome() {
        return nome;
    }

    // Método para obter a descrição da mentoria
    public String getDescricao() {
        return descricao;
    }

    // Método para obter a carga horária da mentoria
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Método para obter o horário da mentoria
    public String getHorario() {
        return horario;
    }

    // Getters e Setters adicionais (se necessário)
}
