package com.java8Features_All;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	public static void main(String[] args) throws Exception {
		String pswd = "charan@@1018";
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pswd.getBytes());
		String encodedpwd = new String(encode);
		System.out.println(encodedpwd);

		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedpwd);
		String decodedPwd = new String(decode);
		System.out.println(decodedPwd);
		// -------------------
		String pwd = "charan@@10";
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(pwd.getBytes());
		String encrypted = new String(digest);
		System.out.println(encrypted);
		
		Encoder encoder1=Base64.getEncoder();
		byte[] ency_encod=encoder1.encode(digest);
		System.out.println("Encrypted+Encoded ::"+new String(ency_encod));

	}
}
