package one.digitalinnovation.gof.adapter;

public class TomadaDoisPinos {

    private static final boolean PINO_CENTRAL = false;
    private static final int PINOS = 2;
    private String nomeTomada;

    public TomadaDoisPinos(String nomeTomada){
        this.nomeTomada = nomeTomada;
    }

    public String getNomeTomada(){
        return nomeTomada;
    }
}
