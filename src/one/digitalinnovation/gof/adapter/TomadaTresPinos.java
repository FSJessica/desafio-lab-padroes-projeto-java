package one.digitalinnovation.gof.adapter;

public class TomadaTresPinos {

    private static final boolean PINO_CENTRAL = true;
    private static final int PINOS = 3;
    private String nomeTomada;

    public TomadaTresPinos(String nomeTomada){
        this.nomeTomada = nomeTomada;
    }

    public String getNomeTomada(){
        return nomeTomada;
    }
}
