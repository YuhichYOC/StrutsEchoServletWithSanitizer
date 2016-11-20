package TS05onEureka3dotCom;

import java.io.IOException;

import javax.servlet.*;

public class Sanitizer implements Filter {
	
	public void init(FilterConfig config) {}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Filter on request.");
		
		String parameter = req.getParameter("value01");
		String retParameter = "";
		
		if (parameter == null || parameter.isEmpty()) {
			
			retParameter = parameter;
			
		} else {
			
			for(char oneChar : parameter.toCharArray()) {
				
				switch (oneChar) {
				
				case '&':
					retParameter += "&amp;";
					break;
				
				case '<':
					retParameter += "&lt;";
					break;
				
				case '>':
					retParameter += "&gt;";
					break;
				
				default :
					retParameter += oneChar;
					break;
				
				}
			}
			
		}
		
		req.setAttribute("value01", retParameter);
		
		chain.doFilter(req, res);
		
	}
	
	public void destroy() {}
	
}
