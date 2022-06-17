package supermark_GA10;

public class Usuario {

	// Atributos
	private String nombre;
	private String apellido;
	private Integer id;
	private Domicilio domicilio;

	// Metodos
	public Usuario(String nombre, String apellido, Integer id, Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.domicilio = domicilio;	
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

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
}
