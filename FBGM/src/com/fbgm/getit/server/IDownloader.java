package com.fbgm.getit.server;

public interface IDownloader
{
	/**
	 * Methode, die eine Ressource auf einer Webseite herunterl�dt.
	 * TODO: R�ckgabewert muss noch identifiziert werden.
	 * @param url - Eine valide URL, die normalisiert wurde.
	 */
	public void Download(String url);
}
