package br.com.moraes.negocios;

import java.security.MessageDigest;

public class Hasher
{
	// Retorna uma string com hash SHA-256 em uppercase
	public static String toSha256(String inString) throws Exception
	{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		String text = inString.toLowerCase();
		md.update(text.getBytes("ASCII"));
		byte[] hash = md.digest();
		
		StringBuilder sb = new StringBuilder();
		for(byte b : hash)
		{
			sb.append(String.format("%02x", b));
		}
		return sb.toString().toUpperCase();
	}
}
