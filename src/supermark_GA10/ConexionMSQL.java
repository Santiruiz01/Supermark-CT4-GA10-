package supermark_GA10;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class ConexionMSQL {

	// DEFINIR LAS CONSTANTES PARA LA CONEXION DE LA BASE DE DATOS:

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static String DB_URL = "jdbc:mysql://localhost:3306/";

	// DEFINIR LAS CREDENCIALES DE LA BASE DE DATOS:

	static final String USER = "root";
	static final String PASS = "user2791"; // SE COLOCA LA CLAVE Y LA CONTRASEÑA DEL HOST A CONECTAR

	private Connection connection = null;
	private Statement stmt = null; // ------> OBJETO PARA REALIZAR LAS PETICIONES EN SQL
	private ResultSet rs = null; // ------> CONJUNTO DE RESULTADOS

	public ConexionMSQL(String db) {
		this.DB_URL += db;
	}
	
	public Statement getStmt() {
		return stmt;
	}
	
	public Connection getConnection() {
		return connection;
	}

	public ResultSet getRs() {
		return rs;
	}
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public void conectar() {
		try {
			Class.forName(JDBC_DRIVER); // INSTANCIAR EL DRIVER

			System.out.println("CONECTANDO A LA BASE DE DATOS...");
			connection = DriverManager.getConnection(DB_URL, USER, PASS); // PARA CONECTARSE A LA BDD

			System.out.println("CREANDO SENTENCIAS SQL...");
			stmt = connection.createStatement(); // VAMOS A CREAR UNA SENTENCIA EN SQL

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} /*finally {
			try {
				rs.close();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}*/
		}

	}
	

