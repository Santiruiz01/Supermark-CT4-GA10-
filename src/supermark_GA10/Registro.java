package supermark_GA10;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class Registro {

	public static void main(String[] args) throws IOException {
		
		CRUDusuario crud = new CRUDusuario();

		Date fecha = new Date(87, 5, 24);

		Usuario user = new Usuario(2,"Lionel", "Messi", "lam1010", "lionelmessi@outlook.com", 33016244, fecha);{

		}
		crud.registro(user);
	}

}
