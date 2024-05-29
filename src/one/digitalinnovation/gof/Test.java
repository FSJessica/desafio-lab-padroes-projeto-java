package one.digitalinnovation.gof;

import one.digitalinnovation.gof.adapter.Adapter;
import one.digitalinnovation.gof.adapter.CaixaTomada;
import one.digitalinnovation.gof.adapter.TomadaDoisPinos;
import one.digitalinnovation.gof.adapter.TomadaTresPinos;
import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		// Adapter
		TomadaDoisPinos tomadaDoisPinos = new TomadaDoisPinos("Tomada de dois pinos");
		CaixaTomada caixaTomada = new CaixaTomada(tomadaDoisPinos);
		caixaTomada.imprimeNomeTomada();

		TomadaTresPinos tomadaTresPinos	= new TomadaTresPinos("Tomada de três pinos");
		caixaTomada = new CaixaTomada(Adapter.adaptarTomada(tomadaTresPinos));
		caixaTomada.imprimeNomeTomada();

		// Singleton
		
//		SingletonLazy lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//		lazy = SingletonLazy.getInstancia();
//		System.out.println(lazy);
//
//		SingletonEager eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//		eager = SingletonEager.getInstancia();
//		System.out.println(eager);
//
//		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//		System.out.println(lazyHolder);
//		lazyHolder = SingletonLazyHolder.getInstancia();
//		System.out.println(lazyHolder);
//
//		// Strategy
//
//		Comportamento defensivo = new ComportamentoDefensivo();
//		Comportamento normal = new ComportamentoNormal();
//		Comportamento agressivo = new ComportamentoAgressivo();
//
//		Robo robo = new Robo();
//		robo.setComportamento(normal);
//		robo.mover();
//		robo.mover();
//		robo.setComportamento(defensivo);
//		robo.mover();
//		robo.setComportamento(agressivo);
//		robo.mover();
//		robo.mover();
//		robo.mover();
//
//		// Facade
//
//		Facade facade = new Facade();
//		facade.migrarCliente("Venilton", "14801788");
	}

}
