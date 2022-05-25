
//50	WAP a JDBC program for -creating, inserting, selecting, updating records 	
import java.sql.*;

import javax.lang.model.element.QualifiedNameable;
import javax.management.Query;


class P50 {
	static final String DB_URL = "jdbc:mysql://localhost/test";
	static final String USER = "root";
	static final String PASS = "1234";
	static String QUERY = null;

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
			
			Statement s;
			ResultSet rs = null;
			
			String UPDATE = "create table t2(id int(4), name varchar(20))";
			s = c.createStatement();
			int success = s.executeUpdate(UPDATE);
			if(success == 0){
				System.out.println("CREATING:");
				System.out.println(UPDATE + " : Update success\n");
			}
			UPDATE = "insert into t2 values(1, \"Prakhar\")";
			success = s.executeUpdate(UPDATE);
			if(success >= 0){
				System.out.println("Inserting:");
				System.out.println(UPDATE + " : Update success");
			}
			UPDATE = "insert into t2 values(2, \"John\")";
			success = s.executeUpdate(UPDATE);
			if(success >= 0){
				System.out.println(UPDATE + " : Update success");
			}
			UPDATE = "insert into t2 values(3, \"Verghese\")";
			success = s.executeUpdate(UPDATE);
			if(success >= 0){
				System.out.println(UPDATE + " : Update success\n");
			}

			QUERY = "select * from t2";
			rs = s.executeQuery(QUERY);
			System.out.printf("SELECTING:\n%-10s %-10s\n", "ID", "Name");
			while(rs.next()){
				System.out.printf("%-10s %-10s\n", rs.getInt("id"), rs.getString("name"));

			}

			UPDATE = "update t2 set name=\"Josh\" where name like \"John\"";
			success = s.executeUpdate(UPDATE);
			if(success >= 0){
				System.out.println("UPDATING:\n" + UPDATE + " : Update success\n");
			}

			QUERY = "select * from t2";
			rs = s.executeQuery(QUERY);
			System.out.printf("SELECTING:\n%-10s %-10s\n", "ID", "Name");
			while(rs.next()){
				System.out.printf("%-10s %-10s\n", rs.getInt("id"), rs.getString("name"));

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}