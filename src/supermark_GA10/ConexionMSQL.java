package supermark_GA10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMSQL {

	// DEFINIR LAS CONSTANTES PARA LA CONEXION DE LA BASE DE DATOS:

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static String DB_URL = "jdbc:mysql://localhost:3306/supermark_ct4_ga10";

	// DEFINIR LAS CREDENCIALES DE LA BASE DE DATOS:

	static final String USER = "root";
	static final String PASS = "user2791"; // SE COLOCA LA CLAVE Y LA CONTRASEÑA DEL HOST A CONECTAR

	private Connection connection = null;
	private Statement stmt = null; // ------> OBJETO PARA REALIZAR LAS PETICIONES EN SQL
	private ResultSet rs = null; // ------> CONJUNTO DE RESULTADOs
	
	public void conectar () { 
		try {
			System.out.println("CONECTANDO A LA BASE DE DATOS...");
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	String sql;
	
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
			System.out.println("CREANDO SENTENCIAS SQL");
			stmt = connection.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	public void close () {
		try {
			//rs.close();
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
		}