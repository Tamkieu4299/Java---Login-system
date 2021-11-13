package loginSystem;

import java.util.HashMap;

public class IDandPasswords {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("tamkieu","042127");
		logininfo.put("hangbao","042127");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}
