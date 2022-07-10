package supermark_GA10;

public class Domicilio {

	// Atributos
	private Integer id;
	private String calle;
	private int altura;
	private int piso;
	private int deptoNum;

	// Metodos
	
	public Domicilio (Integer id, String calle, int altura, int piso, int deptoNum) {
		this.id=id;
		this.calle=calle;
		this.altura=altura;
		this.piso=piso;
		this.deptoNum=deptoNum;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public void setDeptoNum(int deptoNum) {
		this.deptoNum = deptoNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public int getAltura() {
		return altura;
	}

	public int getPiso() {
		return piso;
	}

	public int getDeptoNum() {
		return deptoNum;
	}
	
	

}
