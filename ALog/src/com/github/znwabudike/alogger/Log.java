package com.github.znwabudike.alogger;

import java.lang.SecurityManager;

import com.github.znwabudike.alogger.BuildConfig;

public class Log extends SecurityManager{

	static String line = "-----------------------------------";
	static String n = "\n";


	public static void v(String msg) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getElement();
			android.util.Log.v(getClassName(element), buildTrace(element) + n + msg + n + line);
		}

	}
	public static void v(String TAG, String msg) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getElement();				
			android.util.Log.v(TAG, buildTrace(element) + n + msg + n + line);
		}

	}
	public static void v(String TAG, String msg, Thread thread) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getThreadedElement(thread);			
			android.util.Log.v(TAG, buildTrace(element) + n + msg + n + line);
		}

	}
	public static void v(String msg, Thread thread) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getThreadedElement(thread);			
			android.util.Log.v(getClassName(element), buildTrace(element) + n + msg + n + line);
		}

	}


	public static void i(String msg) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getElement();
			android.util.Log.i(getClassName(element), buildTrace(element) + n + msg + n + line);
		}

	}
	public static void i(String TAG, String msg) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getElement();
			android.util.Log.v(TAG, buildTrace(element) + n + msg + n + line);
		}

	}
	public static void i(String TAG, String msg, Thread thread) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getThreadedElement(thread);
			android.util.Log.v(TAG, buildTrace(element) + n + msg + n + line);
		}

	}
	public static void i(String msg, Thread thread) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getThreadedElement(thread);
			android.util.Log.i(getClassName(element), buildTrace(element) + n + msg + n + line);
		}

	}

	public static void d(String msg) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getElement();
			android.util.Log.d(getClassName(element), buildTrace(element) + n + msg + n + line);
		}

	}
	public static void d(String TAG, String msg) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getElement();
			android.util.Log.v(TAG, buildTrace(element) + n + msg + n + line);
		}

	}
	public static void d(String TAG, String msg, Thread thread) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getThreadedElement(thread);
			android.util.Log.v(TAG, buildTrace(element) + n + msg + n + line);
		}

	}
	public static void d(String msg, Thread thread) 
	{
		if (BuildConfig.DEBUG){
			StackTraceElement element = getThreadedElement(thread);
			android.util.Log.d(getClassName(element), buildTrace(element) + n +  msg + n + line);
		}

	}

	public static String buildTrace(StackTraceElement element){
		return getClassName(element) + "." + getMethodName(element) + "()" + "  Line = " + getLineNumber(element);
	}
	public static StackTraceElement getElement(){
		return Thread.currentThread().getStackTrace()[5];
	}
	public static StackTraceElement getThreadedElement(Thread thread){
		return thread.getStackTrace()[5];
	}
	private static String getMethodName(StackTraceElement element) {
		return element.getMethodName();
	}
	private static int getLineNumber(StackTraceElement element) {
		return element.getLineNumber();
	}
	private static String getClassName(StackTraceElement element) {
		return element.getClassName().substring(element.getClassName().lastIndexOf(".") + 2);
	}
}
