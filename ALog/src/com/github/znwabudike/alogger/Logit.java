package com.github.znwabudike.alogger;

public interface Logit {

	public void log(String tolog, boolean calling_method, boolean calling_class);
	public void onTraceFinish();
}
