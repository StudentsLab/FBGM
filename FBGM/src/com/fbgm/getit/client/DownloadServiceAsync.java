package com.fbgm.getit.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DownloadServiceAsync
{
	void DownloadVideo(String input, AsyncCallback<Object> callback) throws IllegalArgumentException;
	
	void DownloadAudio(String input, AsyncCallback<Object> callback) throws IllegalArgumentException;
}
