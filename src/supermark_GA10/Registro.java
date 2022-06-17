package supermark_GA10;

public class Registro extends Usuario {
	
	//Atributos
	private String correo;
	private String contrasenia;
	
	//Metodos
	
	public Registro(String nombre, String apellido, Integer id,
			Domicilio domicilio, String correo, String contrasenia) {
		super (nombre, apellido, id, domicilio);
		this.correo=correo;
		this.contrasenia=contrasenia;
		
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	

}
