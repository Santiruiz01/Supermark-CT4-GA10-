package supermark_GA10;

import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;

public class Registro {

	public static void main(String[] args) throws IOException {
		
		ConexionMSQL conn = new ConexionMSQL ();
		/*
		 * Scanner tc = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * System.out.println("INGRESE SU NOMBRE:"); String nombre = tc.next();
		 * 
		 * System.out.println("INGRESE SU APELLIDO:"); String apellido = tc.next();
		 * 
		 * System.out.println("INGRESAR UNA CONTRASEÑA:"); String contrasenia =
		 * tc.next();
		 * 
		 * System.out.println("INGRESE SU CORREO:"); String correo = tc.next();
		 * 
		 * System.out.println("INGRESE SU DNI:"); Integer dni = tc.nextInt();
		 * 
		 * System.out.println("INGRESE SU FECHA DE NACIMIENTO");
		 * 
		 * System.out.println("Dia: "); byte dia = tc.nextByte();
		 * System.out.println("Mes: "); byte mes = tc.nextByte();
		 * System.out.println("Anio: ");byte anio = tc.nextByte(); anio = (byte) (anio -
		 * 1900);
		 */
		
		conn.conectar();

		Date fecha = new Date(101, 8, 28);

		Usuario user = new Usuario(1 ,"Santiago", "Ruiz", "ybn3421", "santiruiz2001@outlook.com", 43640893, fecha);
		
		conn.registro(user);
		
		conn.close();
		
	}

}
