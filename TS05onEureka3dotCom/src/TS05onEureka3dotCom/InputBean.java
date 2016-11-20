package TS05onEureka3dotCom;

import java.io.Serializable;

public class InputBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String searchKey = "";
	public void setSearchKey(String value) {
		this.searchKey = value;
	}
	public String getSearchKey() {
		return this.searchKey;
	}
	
}
