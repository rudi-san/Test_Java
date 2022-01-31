package de.rudi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcTest {

	public static void main(String[] args) {

		try {
			Properties prop = new Properties();
			prop.setProperty("userid", "dqq69669");
			prop.setProperty("your_password", "5k0p3m0MeQD9ctyC");
			Connection con = DriverManager.getConnection("jdbc:db2://54a2f15b-5c0f-46df-8954-7e38e612c2bd.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud:32733/bludb:user=<userid>;password=<your_password>;sslConnection=true;",prop);
			con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
