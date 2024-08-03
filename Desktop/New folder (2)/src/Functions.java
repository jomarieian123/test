import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.DriverManager;

public class Functions extends HttpServlet {


            public Connection getConnection(){
                Connection con = null;

                String sqlDriver = "org.mariadb.jdbc.Driver";
                String url = "jdbc:mysql://localhost:8080/" ;


                try {
                    Class.forName(sqlDriver);
                    con = DriverManager.getConnection(url);

                }catch (Exception e){}


                return con;
            }



}
