package in.edelworks.sharedpreferences;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

public class SharedPreferences extends CordovaPlugin {
	public static final String GET_SHARED_PREFERENCES = "getSharedPreferences";
	public static final String SHARED_PREFERENCES = "SharedPreferences";
	public static final String PREF_FILE = "";

	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (GET_SHARED_PREFERENCES.equals(action)) {
			 
			 return true;
		}else{
			return false;
		}
    }
}
