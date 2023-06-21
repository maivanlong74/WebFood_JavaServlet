package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class KetNoi {
	public Connection cn;

	public void KetNoi() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("xongb1");
			String url="jdbc:sqlserver://DESKTOP-6F96V1K\\SA:51232;databaseName=food;user=sa; password=1234";
			System.out.println("xongb2");
			//String url = "jdbc:sqlserver://DESKTOP-FF1278R\\SQLEXPRESS:1433;databaseName=QlSach;integratedSecurity=true";
			cn = DriverManager.getConnection(url);
			System.out.println("xongb3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void dbClose() {
		try {
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
        

	public static void main(String[] args) /* throws SQLException */{
		// TODO Auto-generated method stub
		KetNoi kn = new KetNoi();
		kn.KetNoi();
	}

}
