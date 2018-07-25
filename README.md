# logUtil_Android
Android library working with Log file in Android SDK

Step 1:
Add it in your root build.gradle(Project:project name) at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
 Step 2:  Add the dependency in buid.gradle(Module:app)

	dependencies {
	        compile 'com.github.akashk2512:logUtil_Android:0.1.1'
	}
  
  Step 3: Add in your activity to print log
  
  
  DoDebug.D("YourKey","Your debug message");
  
