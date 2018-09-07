package practica.colecciones.test;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;



public class TestCollections {


	
	@Test
	public void comprobarQueUnaListaAdmitaDuplicados() {
		
		List<String> lista1 = new ArrayList<String>();
		
		lista1.add("Romagnolli");
		lista1.add("Mercier");
		lista1.add("Acosta");
		lista1.add("Mercier");
		
		Integer valorEsperado = 4;
		Integer valorObtenido = lista1.size();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
		
		
	}
	
	@Test
	public void comprobarQueNoAdmitaDuplicados() {
		
		Set<String> lista1 = new LinkedHashSet<String>();
	
		lista1.add("Romagnolli");
		lista1.add("Mercier");
		lista1.add("Acosta");
		lista1.add("Mercier");
		
		Integer valorEsperado = 4;
		Integer valorObtenido = lista1.size();
		
		Assert.assertFalse(valorObtenido == valorEsperado);
	
		
		
	}
}
