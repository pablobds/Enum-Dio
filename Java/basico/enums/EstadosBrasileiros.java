package java.basico.enums;

//Os enums sao objetos
public enum EstadosBrasileiros {
    SAO_PAULO("SP", "Sao Paulo"),
    RIO_DE_JANEIRO ("RJ", "Rio de Janeiro")
    //assim por diante
    ;
    private String sigla = null;
    private String nome = null;

    private EstadosBrasileiros(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }


    public String getName() {
        return this.nome;
    }

    public String getSigla() {
        return this.sigla;
    }

}
