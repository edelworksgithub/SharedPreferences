package in.edelworks.sharedpreferences;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.content.SharedPreferences;

public class Sharedpreferences extends CordovaPlugin {
	public static final String GET_SHARED_PREFERENCES = "getSharedPreferences";
	public static final String SHARED_PREFERENCES = "SharedPreferences";
	public static String PREF_FILE = "";
	public static final String[] MODE_ARRAY = {"MODE_APPEND", "MODE_PRIVATE"};
	SharedPreferences SharedPref;

	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (GET_SHARED_PREFERENCES.equals(action)) {
			PREF_FILE = args.getString(0);
			String modeType = args.getString(0);
			
			Context context = cordova.getActivity();
			if(in_array(MODE_ARRAY, modeType)){
				switch(modeType){
				case "MODE_APPEND":
					try{
						SharedPref = context.getSharedPreferences(PREF_FILE, Context.MODE_APPEND);
						callbackContext.success("Shared Preferences Created with " + modeType);
						return true;
					}catch(Exception e){
						callbackContext.error("Error creating Shared Preferences" + e.getMessage());
						return false;
					}
					break;
				case "MODE_PRIVATE":
					try{
						SharedPref = context.getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
						callbackContext.success("Shared Preferences Created with " + modeType);
						return true;
					}catch(Exception e){
						callbackContext.error("Error creating Shared Preferences" + e.getMessage());
						return false;
					}
					break;
				}
			}
			callbackContext.error("Invalid Mode provided");
			return false;
		}else{
			callbackContext.error("Invalid Action");
			return false;
		}
    }
	
	public static boolean in_array(String[] haystack, String needle) {
	    for(int i=0;i<haystack.length;i++) {
	        if(haystack[i].equals(needle)) {
	            return true;
	        }
	    }
	    return false;
	}
}
