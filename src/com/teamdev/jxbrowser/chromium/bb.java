package com.teamdev.jxbrowser.chromium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class bb {
	private static final byte[] a = { 120, -7, -64, -10, -27, 104, 124, -25, 102, 30, -19, 18, 71, 99, 64, -9, 66, 83,
			-126, 115, -75, 22, 106, -32, 48, -61, -39, 104, -119, -116, 5, -57, -57, -18, -46, -111, -14, -40, 8, 120,
			-82, 121, 18, 24, -83, 68, 60, Byte.MIN_VALUE, 116, 116 };
	private static final BigInteger b = new BigInteger(d("21"));
	private static final BigInteger c = new BigInteger(d("20"));

	private static final BigInteger d = new BigInteger(d(
			"2ag3jyqgv3cjfndlmicgeaqpytqgrezlv74q350p2u3sx205b3gw8nxayha7uxmm0733vt2tq9lnpvby2to4udh52n4l4t6ag3lmyx936i9fj7c4cumlgqo83rw0b2lrx10vt1bappvetmnv1fw09f2exj7230bmlptthjrutxuxkw3j37inmi2rk4h5lu633n"));
	private static final BigInteger e = new BigInteger(d(
			"2ag0dj43je3oxf22utaopxp61jqgc2epo0drzxzsf3uc12i4kzru7v17z9mv954zr81m1yl0k1c07y9adyzteowk0yt8xdn01qvtamv6b360we9k0z5mqq670yxu3yu4e4vmflp18ie8ojq2nabd2qdjb6wuwoejtllllkkd8hh5tvlbgr65tps5bukokdni2c"));
	private static final BigInteger f = new BigInteger(d(
			"29suwrt1kkridgt5sm6a1pb4q0hiwa3nskk7hdsvqw2fikywu1vvyp69k3msaezzcwi2k17lx13tqcpko0gxq2p00rkwc00dzfh5b3cgqz9kgh8v2qhveb8iak1mzov5889ws3xha13p2ntsd8j1iw81esznyktx8t6ahz6vfpt2uw4hxegllgp5bdwyco1stu"));

	private final Map g = new HashMap();
	private final List h = new java.util.ArrayList();

	public bb(InputStream paramInputStream) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(paramInputStream, "UTF-8"));
		a(br);
		br.close();
	}

	protected void a(BufferedReader paramBufferedReader) throws IOException {
		String str1;

		while ((str1 = paramBufferedReader.readLine()) != null) {
			int i;
			if ((i = str1.indexOf(":")) == -1)
				throw f(d("3bk5yychqbx6fu4yunqzdobuxpt0up1"));
			String str2 = str1.substring(0, i).trim();
			str1 = str1.substring(i + 1).trim();
			a(str2, str1);
		}
	}

	public final String a(String paramString) {
		paramString = paramString.trim();

		return paramString = (String) g.get(paramString);
	}

	protected final void a(String paramString1, String paramString2) {
		g.put(paramString1, paramString2);
		h.add(paramString1);
	}

	public final String b(String paramString) {
		if ((paramString = a(paramString)) == null) {
			return null;
		}
		return paramString = d(paramString);
	}

	public static String c(String var0) {
		byte[] var2;
		try {
			var2 = var0.getBytes("UTF-8");
		} catch (UnsupportedEncodingException var1) {
			throw f(var1.getMessage());
		}

		a(var2);
		return (new BigInteger(var2)).toString(36);
	}

	public static String d(String var0) {
		byte[] var2;
		a(var2 = (new BigInteger(var0, 36)).toByteArray());

		try {
			return new String(var2, "UTF-8");
		} catch (UnsupportedEncodingException var1) {
			throw f(var1.getMessage());
		}
	}

	private static void a(byte[] paramArrayOfByte) {
		int i = 0;
		for (int j = paramArrayOfByte.length; i < j; i++) {
			int tmp12_11 = 0;
			paramArrayOfByte[tmp12_11] = ((byte) (paramArrayOfByte[tmp12_11] ^ a[(i % 50)]));
		}
	}

	public final boolean b() {
		BigInteger var1 = new BigInteger(this.a(d("-7nkkov")), 36);
		BigInteger var2 = new BigInteger(this.a(d("-7nkkou")), 36);
		BigInteger var3 = this.d();
		BigInteger var4 = d.subtract(b);
		boolean var5;
		if (var3.compareTo(c) >= 0 && var3.compareTo(var4) < 0 && var1.compareTo(c) >= 0 && var1.compareTo(var4) < 0 && var2.compareTo(c) >= 0
				&& var2.compareTo(var4) < 0) {
			var5 = f.modPow(var1, d).multiply(var1.modPow(var2, d)).mod(d).equals(e.modPow(var3, d));
		} else {
			var5 = false;
		}
		System.out.println("boolean -> var5"+var5);
		return var5;
	}

	protected String a() {
		StringBuffer var1 = new StringBuffer();
		Iterator var2 = this.c();

		while (var2.hasNext()) {
			Entry var3;
			String var4 = (String) (var3 = (Entry) var2.next()).getKey();
			String var5 = (String) var3.getValue();
			var1.append(e(var4));
			var1.append(e(var5));
		}
		System.out.println("var1->a"+ var1.toString());
		return var1.toString();
	}

	private Iterator c() {
		TreeMap var1;
		(var1 = new TreeMap(this.g)).remove(d("-7nkkov"));
		var1.remove(d("-7nkkou"));
		return var1.entrySet().iterator();
	}

	protected static String e(String var0) {
		char[] var4 = var0.toCharArray();
		StringBuffer var1 = new StringBuffer(var4.length);

		for (int var2 = 0; var2 < var4.length; ++var2) {
			char var3;
			if (Character.isLetterOrDigit(var3 = var4[var2])) {
				var1.append(var3);
			}
		}

		return var1.toString();
	}

	private BigInteger d() {
		try {
			MessageDigest var1 = MessageDigest.getInstance(d("poht"));
			byte[] var5 = this.a(var1);
			byte[] var2 = this.a().getBytes("UTF-8");
			byte[] var3 = new byte[50];
			System.arraycopy(var5, 0, var3, 0, var5.length);
			System.arraycopy(var2, 0, var3, var5.length, Math.min(50 - var5.length, var2.length));
			
			return new BigInteger(1, var3);
		} catch (Exception var4) {
			throw f(var4.toString());
		}
	}

	protected byte[] a(MessageDigest var1) throws UnsupportedEncodingException {
		Iterator var2 = this.c();

		while (var2.hasNext()) {
			Entry var3;
			String var4 = (String) (var3 = (Entry) var2.next()).getKey();
			String var5 = (String) var3.getValue();
			var1.update(var4.getBytes("UTF-8"));
			var1.update(var5.getBytes("UTF-8"));
		}

		return var1.digest();
	}

	protected static RuntimeException f(String var0) {
		RuntimeException var1;
		(var1 = new RuntimeException(var0)).setStackTrace(new StackTraceElement[0]);
		return var1;
	}
}
