package br.senac.projeto.DTO;

public class TarefaDTO {
    
    private Long id;
    private String titulo;
    private String descricao;
    private boolean concluida;

    public TarefaDTO(Long id, String titulo, String descricao, boolean concluida) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    //GETERS
    public Long getId() { 
        return id; 
    }
    public String getTitulo() { 
        return titulo; 
    }
    public String getDescricao() { 
        return descricao; 
    }
    public boolean getConcluida() { 
        return concluida; 
    }

    //SETERS
    public void setId(Long id) {
         this.id = id; 
    }
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }
    public void setDescricao(String descricao) {
         this.descricao = descricao; 
    }
    public void setConcluida(boolean concluida) {
         this.concluida = concluida; 
    }

}

