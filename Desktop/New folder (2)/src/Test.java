import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class Test extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");

            PrintWriter out = resp.getWriter();

                out.print("gwapo");

        //        resp.setContentType("application/json");
//        PrintWriter prt = resp.getWriter();
//
//        JSONObject jo = new JSONObject();
//
//        String name = "ian";
//        String surname = "himaya";
//
//        jo.put("name",name);
//        jo.put("last",surname);
//        jo.put("Strings","qwertys");
////
//        jo.names();
//        prt.print(jo);
//
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);

    }
}




