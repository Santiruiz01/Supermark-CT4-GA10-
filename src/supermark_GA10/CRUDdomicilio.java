package supermark_GA10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDdomicilio {
	
	private ConexionMSQL conexion;
	private String sql;
	
	public CRUDdomicilio () {
		super();
		this.conexion = new ConexionMSQL("supermark_ct4_ga10");
		this.conexion.conectar();
		this.sql = "";
		
	}
	
	public void registro(Domicilio domUsuario) {
		this.sql = "INSERT INTO domicilio " + 
				"(id,calle,altura,piso,deptoNum)" + 
				"VALUE ( " +
				domUsuario.getId() + ", '" +
				domUsuario.getCalle() + "' , " +
				domUsuario.getAltura() + " , " +
				domUsuario.getPiso() + " , " +
				domUsuario.getDeptoNum() + ")";
	
		try {
			conexion.getStmt().executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Usuario Registrado");
		}
	

}

}
