package supermark_GA10;

import java.sql.Date;

public class Usuario {

	// Atributos
	private String nombre;
	private String apellido;
	private Integer id;
	private String contrasenia;
	private String correo;
	private Integer dni;
	private Date nacimiento_fecha; 
	

	// Metodos
	public Usuario(Integer id, String nombre, String apellido, String contrasenia, String correo, Integer dni, Date fecha) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasenia = contrasenia;
		this.correo = correo;
		this.dni = dni;
		this.nacimiento_fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Date getNacimiento_fecha() {
		return nacimiento_fecha;
	}

	public void setNacimiento_fecha(Date fecha) {
		this.nacimiento_fecha = fecha;
	}
	 
	
	
}
