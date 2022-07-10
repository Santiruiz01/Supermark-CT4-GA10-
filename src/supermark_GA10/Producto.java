package supermark_GA10;

public class Producto {

	// Atributos

	private Integer id;
	private String nombre;
	private String marca;
	private double precio;
	private Integer stock;
	private String vencimiento;

	// Metodos

	public Producto(Integer id, String nombre, String marca, double precio, Integer stock, String vencimiento) {
		this.id=id;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
		this.vencimiento = vencimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMarca() {
		return marca;
	}

	public double getPrecio() {
		return precio;
	}

	public Integer getStock() {
		return stock;
	}

	public String getVencimiento() {
		return vencimiento;
	}
	

}
