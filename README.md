ALog
====

A different kind of Android Logger
====

Usage: 

Import the .jar file and configure your build path to include the .jar

The Log class is built to override the android.util.log class.
Please remove the import from your calss files and replace it with this new Log class.

    import com.github.znwabudike.alogger.Log;
    
Three types of logging are provided: 
Log.d == debug
Log.v == vebose
Log.i == info

Three types of method overrides for each logging type:

Methods:
public static void d(String TAG, String msg)
public static void d(String TAG, String msg, Thread thread) 
public static void d(String msg, Thread thread) 

Params:
String TAG == your tag.
String msg == your msg.
Thread thread == the thread you would like to trace.


