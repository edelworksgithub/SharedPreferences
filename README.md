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
