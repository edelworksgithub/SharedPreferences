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
