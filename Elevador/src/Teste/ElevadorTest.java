package Teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Elevador.Elevador;

public class ElevadorTest {
    
	 @Test
	    public void testEntrarSairPessoa() {
	        Elevador elevador = new Elevador();
	        assertTrue(elevador.entrarPessoa(70)); // Pessoa entra
	        assertEquals(70, elevador.getCargaAtual());
	        assertTrue(elevador.entrarPessoa(50)); // Pessoa entra
	        assertEquals(120, elevador.getCargaAtual());
	        assertTrue(elevador.sairPessoa(70)); // Pessoa sai
	        assertEquals(50, elevador.getCargaAtual());
	    }
	    
	    
	    public void testAvaliarPeso() {
	        Elevador elevador = new Elevador();
	        assertFalse(elevador.avaliarPeso(150)); 
	        assertTrue(elevador.avaliarPeso(200)); // Peso excede a capacidade
	    }
	
	    @Test
	    public void testEntrarElevador100kg() {
	        Elevador elevador = new Elevador();
	        elevador.setCargaAtual(0);
	        assertEquals(elevador.entrarPessoa(50),)
	        
	    }
	    
	    @Test
	    public void testSubtrair() {
	        assertEquals(1, CalculadoraPeso.subtrair(3, 2));
	        assertEquals(5, CalculadoraPeso.subtrair(2, -3));
	    }
	}

