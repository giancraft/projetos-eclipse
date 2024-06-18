package animal;

public class Animalmain {

	public static void main(String[] args) {
		
		Animal an = new Animal();
		an.setAlimentaçao("Carnívoro");
		an.setHabitat("Floresta");
		an.setPeso(38.5f);
		an.setTipoDeslocamento("Caminhada");
		an.comer(0.34f);
		an.deslocar();
		System.out.println(an);
		
		Mamifero ma = new Mamifero();
		ma.setAlimentaçao("Omnívoro");
		ma.setAmbiente("Terrestre");
		ma.setEspecie("Teste");
		ma.setHabitat("qualquerum");
		ma.setPelagem("Lisa");
		ma.setPeso(23.6f);
		ma.setQuantidadeMamas(6);
		ma.setTipoDeslocamento("Quadrúpede");
		ma.comer(0.12f);
		ma.deslocar();
		System.out.println(ma);
		
		Gato cat = new Gato();
		cat.setAlimentaçao("Qualquer coisa");
		cat.setAmbiente("Terrestre");
		cat.setEspecie("Gatus");
		cat.setHabitat("casa");
		cat.setHabitos("dormir");
		cat.setPelagem("Peludo");
		cat.setPeso(25.9f);
		cat.setQuantidadeMamas(4);
		cat.setRaca("vira-lata");
		cat.setTamanhoGarras(3.5f);
		cat.setTipoDeslocamento("Não desloca, dorme");
		System.out.println(cat);
		
		Cachorro dogu = new Cachorro();
		dogu.setAlimentaçao("Sim");
		dogu.setAmbiente("Sim");
		dogu.setEspecie("Caninus Animalis");
		dogu.setHabitat("Qualquer canto");
		dogu.setHabitos("Correr");
		dogu.setPelagem("curta");
		dogu.setPeso(50.234f);
		dogu.setQuantidadeMamas(6);
		dogu.setRaca("Pasto Alemão");
		dogu.setTipoDeslocamento("Corre");
		dogu.comer(0.34f);
		dogu.deslocar();
		System.out.println(dogu);
		
		Reptil rep = new Reptil();
		rep.setAlimentaçao("Comida");
		rep.setEspecie("Reptus us");
		rep.setEstruturaCorporal("Escamas");
		rep.setHabitat("Mato");
		rep.setPeso(29.54f);
		rep.setTipoDeslocamento("Quadrúpede");
		rep.comer(0.34f);
		rep.deslocar();
		System.out.println(rep);
		
		Tartaruga taruga = new Tartaruga();
		taruga.setAlimentaçao("Alga");
		taruga.setEspecie("Tartagurus");
		taruga.setEspecieTartaruga("Tartaruga Verde");
		taruga.setHabitat("Terrestre e Aquático");
		taruga.setEstruturaCorporal("Carapaça, Escama, Plastrão");
		taruga.setPeso(45.56f);
		taruga.setTipoCasco("Rígido");
		taruga.setTipoDeslocamento("Quadrúpede");
		taruga.comer(0.345f);
		taruga.deslocar();
		System.out.println(taruga);
		
		Lagarto lag = new Lagarto();
		lag.setAlimentaçao("inseto");
		lag.setEspecie("lagartus");
		lag.setEspecieLagarto("Lagarto");
		lag.setEstruturaCorporal("Escama");
		lag.setHabitat("Terrestre");
		lag.setPeso(34.85f);
		lag.setTamanhoCauda(1.3f);
		lag.setTipoDeslocamento("Quadrúpede");
		lag.comer(0.23f);
		lag.deslocar();
		System.out.println(lag);
		
	}

}
