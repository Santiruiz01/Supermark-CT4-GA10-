package supermark_GA10;


	public class Carrito {
		private Integer id;
		private Producto producto;
		private Integer cantidad;
		private Usuario usuario;

		public Carrito(Usuario usuario, Producto producto, Integer cantidad) {
			this.usuario=usuario;
			this.producto = producto;
			this.cantidad = cantidad;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Producto getProducto() {
			return producto;
		}

		public void setProducto(Producto producto) {
			this.producto = producto;
		}

		public Integer getCantidad() {
			return cantidad;
		}

		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}

		public Usuario getUsuario() {
			return usuario;
		}
		
		

	}

