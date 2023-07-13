package metodos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Sistema {

	Set<Usuario> usuarios;
	HashMap<String, Usuario> logeo;
	
	public Sistema() {
		usuarios = new HashSet<Usuario>();
		logeo = new HashMap<String, Usuario>();
	}
	
	
	
	
	public void agregarUsuario(Usuario usuario1) throws UsuarioDuplicadoException {

		for (Usuario actual : usuarios) {
			if(actual.getNombreUsuario().equals(usuario1.getNombreUsuario())) {
				 
				throw new UsuarioDuplicadoException("usuario duplicado");
				
				
			}	
	}
		
		usuarios.add(usuario1);
	}
	
	

	public Integer cantUsuarios() {
		// TODO Auto-generated method stub
		return usuarios.size();
	}




	public TreeSet<Usuario> usuariosOrdenados() {
		TreeSet<Usuario> usuarioOrdenado = new TreeSet<Usuario>();
		
		return usuarioOrdenado;

}




	public void login(String contraseña, Usuario nombreUsuario) throws UserNotFound {
		validarLogin(nombreUsuario);
		logeo.put(contraseña, nombreUsuario);
		
	}




	public Usuario validarLogin(Usuario nombreUsuario) throws UserNotFound {
		for (Usuario actual : usuarios) {
			if(actual.getNombreUsuario() != null) {
				 
			throw new UserNotFound("user no encontrado");
				
				
			}	
	}
		return nombreUsuario;
		
		
	}
		
	
	



	public boolean bloqueaUsuario(Basico usuario1) {
		if(usuario1.loguea > 3) {
			return usuario1.bloqueado;
		}
		return false;
		
	}




	public boolean eliminaUsuario(Usuario usuario1) throws UsuarioNoEsEliminable {
		
		if( usuario1 instanceof Basico) {
			return true;
		}
		
		throw new UsuarioNoEsEliminable("Usuario incorrecto");
		
	}
}
