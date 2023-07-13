package metodos;

import java.util.Objects;

public class Usuario {
	String nombreUsuario;
	
	
	public Usuario(String nombreUsuario) {
		
		this.nombreUsuario = nombreUsuario;
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombreUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombreUsuario, other.nombreUsuario);
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
}
