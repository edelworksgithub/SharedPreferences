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

###Uninstallation
#####$> cd project-path
#####$> cordova plugin remove in.edelworks.sharedpreferences

###Reference for Shared Preferences in Android
[Android Developer - Saving Key-Value Sets](http://developer.android.com/training/basics/data-storage/shared-preferences.html)

###How to
#####Initialize shared Preference file

###### sharedpreferences.getSharedPreferences(filename, mode, successHandler, errorHandler);
filename - SharedPrefernces File Name

mode - mode of Preference file. two accepted (MODE_APPEND, MODE_PRIVATE)


#####Save String value into Preference file
###### sharedpreferences.putString(key, value, successHandler, errorHandler);

#####Save Integer value into Preference file
###### sharedpreferences.putInt(key, value, successHandler, errorHandler);

#####Save Long value into Preference file
###### sharedpreferences.putLong(key, value, successHandler, errorHandler);

#####Save Boolean value into Preference file
###### sharedpreferences.putBoolean(key, value, successHandler, errorHandler);

#####Get String value from Preference file
###### sharedpreferences.getString(key, value, successHandler, errorHandler);

#####Get Integer value from Preference file
###### sharedpreferences.getInt(key, value, successHandler, errorHandler);

#####Get Long value from Preference file
###### sharedpreferences.getLong(key, value, successHandler, errorHandler);
######NOTE: returned value will be in String type. Please use eval() or parseInt() for calculation use

#####Get Boolean value from Preference file
###### sharedpreferences.getBoolean(key, value, successHandler, errorHandler);
######NOTE: returned value will be 0 - for false and 1 - true


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

