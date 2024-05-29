package one.digitalinnovation.gof.adapter;

public interface Adapter {

    static TomadaDoisPinos adaptarTomada(TomadaTresPinos tomadaPrincipal){
        return new TomadaDoisPinos(tomadaPrincipal.getNomeTomada());
    }
}
