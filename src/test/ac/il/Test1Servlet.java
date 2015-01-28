package test.ac.il;

import java.io.IOException;
import javax.servlet.http.*;
import test.ac.il.model.*;
@SuppressWarnings("serial")
public class Test1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		
		farming farm = new farming();
		resp.getWriter().println(farm.liters(farm.farm1));
	}
}
