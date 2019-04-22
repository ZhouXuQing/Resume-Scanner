package pdf;

public class testPostgreSQLJDBCclass {

	public static void main(String[] args) {
		String email = "ABC@g";
		String firstName = "xuqing";
		String lastName = "zhou";
		//System.out.println("insert into skill values ('" + email + "','" + skill + "');");
		PostgreSQLJDBC dblink = new PostgreSQLJDBC();
		System.out.println(dblink.skillQuery("C++")[0]);
	}
}
