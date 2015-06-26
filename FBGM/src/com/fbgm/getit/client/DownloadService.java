package com.fbgm.getit.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("greet")
public interface DownloadService extends RemoteService
{
	Object DownloadVideo(String url) throws IllegalArgumentException;
	
	Object DownloadAudio(String url) throws IllegalArgumentException;
}

