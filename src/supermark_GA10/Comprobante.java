package supermark_GA10;

public class Comprobante {

	// Atributos
	private String fecha;
	private String[] productos;
	private Integer total;
	private Usuario receptor;

	// Metodos

	public String getFecha() {
		return fecha;
	}

	public String[] getProductos() {
		return productos;
	}

	public Integer getTotal() {
		return total;
	}

	public Usuario getReceptor() {
		return receptor;
	}

}
