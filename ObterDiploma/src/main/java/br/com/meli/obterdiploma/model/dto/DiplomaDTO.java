package br.com.meli.obterdiploma.model.dto;

public class DiplomaDTO {

    private Boolean aprovado;
    private Double media;
    private String diplomaMensagem;

    public DiplomaDTO() {
    }

    public void obterMedia(AlunoDTO alunoDTO) {
        media = alunoDTO.getAlunoDisciplina().stream().mapToDouble(e -> e.getNota()).sum() / alunoDTO.getAlunoDisciplina().size();
        aprovado = media >= 7;
        if(media >= 9) {
            diplomaMensagem = "Formação com média superior a 9!";
        }
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public String getDiplomaMensagem() {
        return diplomaMensagem;
    }

    public void setDiplomaMensagem(String diplomaMensagem) {
        this.diplomaMensagem = diplomaMensagem;
    }
}
