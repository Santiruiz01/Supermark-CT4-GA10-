package supermark_GA10;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


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
	"(nombre,apellido,contraseña,correo,dni,nacimiento_fecha)" + 
	"VALUE (' " +
	usuario.getNombre() + " ','" + 
	usuario.getApellido() + " ',' " +
	usuario.getContrasenia() + " ',' " +
	usuario.getCorreo() + " ', " +
	usuario.getDni() + " ,' " +
	usuario.getNacimiento_fecha() +" ')";
	
		try {
			conexion.getStmt().executeUpdate(this.sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Usuario Registrado");
		}
	

}
}	

	
