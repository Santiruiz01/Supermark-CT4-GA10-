package supermark_GA10;

import java.sql.SQLException;
import java.util.ArrayList;

//import com.supermark.models.*;

public class CRUDcarrito {

	private ConexionMSQL conexion;
	private String sql;

	public CRUDcarrito() {
		super();
		this.conexion = new ConexionMSQL("supermark_ct4_ga10"); // Ahi "" va el nombre del proyecto, no se
																// especificamente como lo colocaste
		this.conexion.conectar();
		this.sql = " ";
	}

	public boolean agregar(Carrito carrito) {
		this.sql = "INSERT INTO Carrito " + "(id_usuario,id_producto,cantidad) " + "VALUE ("
				+ carrito.getUsuario().getId() + "," + carrito.getProducto().getId() + "," + carrito.getCantidad()
				+ ")";
		boolean resultado = false;
		try {
			int rows = conexion.getStmt().executeUpdate(sql);
			if (rows > 0) {
				resultado = true;
			}
			System.out.println("Producto agregado al Carrito");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	public ArrayList<Detalle> getListado(Usuario usuario) {
		ArrayList<Detalle> detalles = new ArrayList<Detalle>();

		this.sql = "SELECT id_producto,cantidad FROM Carrito " + "WHERE id_usuario = " + usuario.getId();

		try {
			conexion.setRs(conexion.getStmt().executeQuery(sql));
			;
			while (conexion.getRs().next()) {
				detalles.add(new Detalle(new Producto(conexion.getRs().getInt("id_producto")),
						conexion.getRs().getInt("cantidad")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return detalles;
	}

	public boolean vaciar(Usuario usuario) {
		boolean resultado = false;
		this.sql = "DELETE FROM Carrito WHERE id_usuario = " + usuario.getId();

		try {
			int rows = conexion.getStmt().executeUpdate(sql);
			if (rows > 0) {
				resultado = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	}