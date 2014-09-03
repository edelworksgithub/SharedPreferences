SharedPreferences
=================

Cordova Plugin for Android SharedPreferences

###in.edelworks.sharedpreferences

#####Author: R. Pramod Nair
#####Organization: EdelWorks [edelworks.in](http://edelworks.in)

###Platform Support
Android

###Installation
#####$> cd project-path
#####$> cordova plugin add https://github.com/edelworksgithub/SharedPreferences.git

###How to
#####Initialize shared Preference file

###### sharedpreferences.getSharedPreferences(filename, mode, successHandler, errorHandler);



###Examples
#####Initialize shared Preference file

function createPref(filename, mode){

	sharedpreferences.getSharedPreferences(filename, mode, successHandler, errorHandler);
	
}
   

function successHandler(result){

	alert("SUCCESS: \r\n"+result );
	
}

function errorHandler(result){

	alert("ERORR: \r\n"+result );
	
}

#####Put Values

function putValue(key, value, type){

	switch(type){
		case "string":
		sharedpreferences.putString(key, value, successHandler, errorHandler);
		break;
		case "int":
		sharedpreferences.putInt(key, value, successHandler, errorHandler);
		break;
		case "long":
		sharedpreferences.putLong(key, value, successHandler, errorHandler);
		break;
		case "boolean":
		sharedpreferences.putBoolean(key, value, successHandler, errorHandler);
		break;
	}
	
}


#####Get Values

function getValue(key, type){

	switch(type){
		case "string":
		sharedpreferences.getString(key, successHandler, errorHandler);
		break;
		case "int":
		sharedpreferences.getInt(key, successHandler, errorHandler);
		break;
		case "long":
		sharedpreferences.getLong(key, successHandler, errorHandler);
		break;
		case "boolean":
		sharedpreferences.getBoolean(key, successHandler, errorHandler);
		break;
	}
	
}


#####Remove a Key from Preference file

function remove(key){

	sharedpreferences.remove(key, successHandler, errorHandler);
	
}

#####Clear a preference file

function clearAll(){

	sharedpreferences.clear(successHandler, errorHandler);
	
}

