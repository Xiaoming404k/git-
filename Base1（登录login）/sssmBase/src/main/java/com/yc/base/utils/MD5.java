package com.yc.base.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	/**
	 * MD5加密
	 * 
	 * @param val
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String getMD5(String val) {
		MessageDigest md5;
		try {
			md5 = MessageDigest.getInstance("MD5");
//			md5.update(new String(val.getBytes(System.getProperty("file.encoding")), "UTF-8").getBytes("UTF-8"));
			md5.update(val.getBytes());
			byte[] m = md5.digest();// 加密
			return getString(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * MD5加密
	 * 
	 * @param val
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String getMD5(String val, String charset) {
		MessageDigest md5;
		try {
			md5 = MessageDigest.getInstance("MD5");
//			md5.update(new String(val.getBytes(System.getProperty("file.encoding")), "UTF-8").getBytes("UTF-8"));
			md5.update(val.getBytes(charset));
			byte[] m = md5.digest();// 加密
			return getString(m).toUpperCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将MD5生成的二进制转换为字符串
	 * 
	 * @param b
	 * @return
	 */
	private static String getString(byte[] b) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			String s = Integer.toHexString(b[i]);
			if (s.length() == 8) {
				sb.append(s.substring(6, 8));
			} else if (s.length() < 2) {
				sb.append("0" + s);
			} else {
				sb.append(s);
			}

		}
		return sb.toString();
	}

	public final static String getMessageDigest(byte[] buffer) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(buffer);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}
}