package supermark_GA10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


	public class CRUDusuario {
		
		
		
	private ConexionMSQL conexion;
	private String sql;

	public CRUDusuario() {
		super();
		this.conexion = new ConexionMSQL("supermark_ct4_ga10");
		this.conexion.conectar();
		this.sql = "";
		
	}

	public void registro(Usuario usuario) {
		this.sql = "INSERT INTO usuario " + 
				"(id,nombre,apellido,contraseña,correo,dni,nacimiento_fecha)" + 
				"VALUE ( " +
				usuario.getId() + " ,' " +
				usuario.getNombre() + " ','" + 
				usuario.getApellido() + " ',' " +
				usuario.getContrasenia() + " ',' " +
				usuario.getCorreo() + " ', " +
				usuario.getDni() + " ,' " +
				usuario.getNacimiento_fecha() +" ')";
	
		try {
			conexion.getStmt().executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Usuario Registrado");
		}
	

}
}	

	
