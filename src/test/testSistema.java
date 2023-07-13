package test;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

import metodos.Administrador;
import metodos.Basico;
import metodos.Sistema;
import metodos.UserNotFound;
import metodos.Usuario;
import metodos.UsuarioDuplicadoException;
import metodos.UsuarioNoEsEliminable;

public class testSistema {

	@Test
	public void queSePuedaAgregarUsuarios() throws UsuarioDuplicadoException {
		Sistema sistema = new Sistema();
		
		
		Basico usuario1 = new Basico("Mau");
		Administrador usuario2 = new Administrador("Mauricio");
		
		sistema.agregarUsuario(usuario1);
		sistema.agregarUsuario(usuario2);
		
		Integer valorEsperado = 2;
		assertEquals(valorEsperado, sistema.cantUsuarios());
			
		
		
	}

	@Test
	public void OrdenarUsuarioPorNombre() throws UsuarioDuplicadoException {
		Sistema sistema = new Sistema();
		
		
		Basico usuario1 = new Basico("abel");
		Administrador usuario2 = new Administrador("Mauricio");
		Administrador usuario3 = new Administrador("gabriel");
		Administrador usuario4 = new Administrador("carlos");
		
		sistema.agregarUsuario(usuario1);
		sistema.agregarUsuario(usuario2);
		sistema.agregarUsuario(usuario3);
		sistema.agregarUsuario(usuario4);
	
		TreeSet<Usuario> usuariosOrdenadosPorNombre = sistema.usuariosOrdenados();
		
	}




	@Test (expected = UsuarioDuplicadoException.class)
	public void queNoSePuedanAgregarUsuariosConELmismoNombre() throws UsuarioDuplicadoException {
		Sistema sistema = new Sistema();
		
		
		Basico usuario1 = new Basico("Mauricio");
		Administrador usuario2 = new Administrador("Mauricio");
		
		sistema.agregarUsuario(usuario1);
		
		sistema.agregarUsuario(usuario2);
		
		Integer valorEsperado = 2;
		assertEquals(valorEsperado, sistema.cantUsuarios());
			
		
		
	}
	@Test
	public void queUnUsuarioSeBloquee() throws UsuarioDuplicadoException, UserNotFound {
		Sistema sistema = new Sistema();
		
		
		Basico usuario1 = new Basico("Mau");
	
		
		sistema.agregarUsuario(usuario1);
		
		String contraseña = "asd" ;
		
//		sistema.login(contraseña, usuario1);
//		sistema.login(contraseña, usuario1);
//		sistema.login(contraseña, usuario1);
//		assertTrue(sistema.bloqueaUsuario(usuario1));
//		
//			
	}
	
	@Test (expected =  UsuarioNoEsEliminable.class)
	public void siSeIntentaEliminarUnUsuarioQueNoSeEliminableSaltaERROR() throws Exception {
		
	Sistema sistema = new Sistema();
		
		
		Administrador usuario1 = new Administrador("Mau");
		
		sistema.agregarUsuario(usuario1);
		
		sistema.eliminaUsuario(usuario1);
		Integer valorEsperado = 1;
		
		assertEquals(valorEsperado, sistema.cantUsuarios());
		
		
	
		
	}
	

	
	
	


}
