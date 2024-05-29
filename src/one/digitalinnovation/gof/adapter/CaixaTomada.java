package one.digitalinnovation.gof.adapter;

public class CaixaTomada {

    private TomadaDoisPinos tomadaConectada;

    public CaixaTomada(TomadaDoisPinos tomadaDoisPinos){
        this.tomadaConectada = tomadaDoisPinos;
    }

    public void imprimeNomeTomada(){
        System.out.println(tomadaConectada.getNomeTomada());
    }
}
