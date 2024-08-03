
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class Person {
    private String name, address;
    private int id,age ;

    public Person(){}

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

}


