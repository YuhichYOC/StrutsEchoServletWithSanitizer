package TS05onEureka3dotCom;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String execute() throws Exception {
		if (this.myBean.getSearchKey().equals("test")) {
			return "replay";
		} else {
			return "success";
		}
	}
	
	private InputBean myBean;
	public void setInputBean(InputBean value) {
		this.myBean = value;
	}
	public InputBean getInputBean() {
		return this.myBean;
	}
	
}
