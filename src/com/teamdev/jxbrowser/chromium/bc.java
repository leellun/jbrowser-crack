package com.teamdev.jxbrowser.chromium;

import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public abstract class bc {
	public static final SimpleDateFormat a = new SimpleDateFormat(bb.d("-1f7zk41inyuazbev"), Locale.ENGLISH);

	protected String b;

	protected String c;

	private bd d;

	private long e = 0L;
	private bb f = null;

	protected bc(String paramString1, String paramString2, bd paramBd) {
		c = paramString1;
		b = paramString2;
		d = paramBd;
	}

	public final synchronized void b() {
		try {
			Date localDate;

			long l = (localDate = new Date()).getTime();
			if ((e != 0L) && (l - e < 86400000L)) {
				return;
			}

			String str = null;
			be localBe = null;
			Iterator iterator = d.a().iterator();
			while (iterator.hasNext()) {

				try {
					localBe = (be) iterator.next();
					String message = MessageFormat.format(bb.d("p93g9dnjhp3v7wc8kkv5gf5wts2fxu4lrkegxm"),
							new Object[] { c, localBe.b() });
					b(message);
					bb localObject2 = localBe.a();
					if (!localObject2.b()) {
//						throw a(c, bb.d("-1koxh9ny992ac6ta5sop8ylctlxlppcydnte"));
					}

					a((bb) localObject2, localDate);
					f = localBe.a();
				} catch (RuntimeException localRuntimeException2) {
					str = localRuntimeException2.getMessage();
				}
			}
			if (f == null) {
				if (str != null) {
					int i;
					if ((i = str.indexOf(": ")) != -1) {
						str = str.substring(i + 2);
					}
				}
				StringBuffer localObject1 = new StringBuffer();
				(localObject1).append(bb.d("-1h5z6hxxos0zbox3xolmba48qlwwd7x6uwuq"));
				((StringBuffer) localObject1).append(' ');
				if (localBe != null) {
					((StringBuffer) localObject1).append(localBe.b());
					((StringBuffer) localObject1).append(" - ");
				}
				if (str != null) {
					((StringBuffer) localObject1).append(str);
				}
				throw a(c, ((StringBuffer) localObject1).toString());
			}

			b(MessageFormat.format(bb.d("-2q85h5qltpmyrcjwru3sej0uxscy"), new Object[] { c }));

			e = l;

			return;
		} catch (RuntimeException localRuntimeException1) {
			a(localRuntimeException1);
			throw localRuntimeException1;
		} catch (Error localError) {
			a(localError);
			throw localError;
		}
	}

	protected void a(bb paramBb, Date paramDate) {
		a(paramBb, paramDate, true);
	}

	protected void a(bb paramBb, Date paramDate, boolean paramBoolean) {
		String str1 = paramBb.a(bb.d("1q7n272qd84"));
		String str2 = paramBb.a(bb.d("19fxiwileni"));
		String str3 = paramBb.a(bb.d("iagms4wv805n13wj3"));
		String str4 = paramBb.a(bb.d("36xzg4lboedkeoqf811"));
		Date localDate = b(paramBb);
		c(paramBb);
		String str5 = paramBb.a(bb.d("36xzg4lboedkelo46lr"));
		String str6 = paramBb.a(bb.d("5j1bhimjm9oboxe6h14nh47"));
		String str7 = paramBb.b(bb.d("mwlw9w46mxsl96fjodecolv9odg7e7"));

		long l = localDate != null ? localDate.getTime() : 0L;
		Date var18 = a(paramBb);

		Object localObject;
		if (str4.equals(bb.d("-24jl5nttfop484gi"))) {
			localObject = new bh(str1, b, localDate);
			localObject = new bg((bh) localObject,
					new bf[] { new bi("ecjgpw1257bg77iav"), new bi("-5fz9u9b1d9n77sjezuuai80ktm4k8yjirbsplio9m6yt0"),
							new bj(), new bk("-6bspffqi914xs2ut3d0ieleutxmzj0t4zx"),
							new bk("ws9f9lj0luj1n2woe9gkorn") });
			String str8;
			int i = (str8 = str5.toLowerCase()).indexOf(bb.d("-wl8msznmkuqk")) != -1 ? 1 : 0;
			boolean bool2 = str8.indexOf(bb.d("-2ky68kd0oyfkualsija98isgr")) != -1;
			if ((i != 0) || (bool2)) {
				((bg) localObject).b();
			}

//			if ((bool2 = ((bg) localObject).a(paramDate))) {
//				paramBb = a(((bg) localObject).a());
//				throw a(c, paramBb);
//			}
		}

		b(bb.d("-fx8zfkfilg7q65z9rg5h0o0ijk") + str1);
		b(bb.d("-167tchxq4gzzfmthz9d865k9y0ulaxxi8") + str2);
		b(bb.d("-65a0ibucyq8yra7nbat84f74w") + str3);
		b(bb.d("-fx8zfqjxqhmbqr30hhe34xcbfk") + str4);
		if (str6 != null)
			b(bb.d("-959y3b7csqivsggnhg7uok7zdrrznrixf5xqftd6cmx9c") + str6);
		b(bb.d("e1d5mpyagfb433m5qissnmbqgvialnk") + a(paramBb));
		b(bb.d("e1d5mp53qy18l2b0dpetgwio6nsn6sg") + (localDate != null ? a(localDate) : bb.d("1js3qp8y")));
		b(bb.d("-fx8zfqjxqhmbqr30hlp1429bs0") + str5);
		b(bb.d("-fx8zg44ytfet74z7tml7k25n1c") + a(paramDate));

		if (!c.equals(str1))
			throw a(c, bb.d("1v35k8qx4wmssyw4qti519lbpqfktq"));
		if ((paramBoolean) && (!str2.startsWith(b))) {
			throw a(c, bb.d("iot24yas8cuw44n62hrb3zbbn2hxxfnkivget9kl2amnhmkrqcg") + b + bb.d("-20x74pe1ewn8x0ps")
					+ str2 + '.');
		}
		if (str6 != null) {
			try {
				Class.forName(str7);
			} catch (ClassNotFoundException localClassNotFoundException) {
				throw a(c, bb.d("lifgy671svju3mpdy4x1uivfkfwfz332tp0qxyulqcleoi59pc8h0g") + str6);
			}
		}

		if ((localDate != null) && (paramDate.getTime() >= l)) {
			localObject = a(a(localDate));
			throw a(c, (String) localObject);
		}
	}

	protected abstract String a(String paramString);

	protected void b(String paramString) {
		System.out.println(paramString);
	}

	protected void a(String paramString, Throwable paramThrowable) {
		System.out.println(paramString);
		paramThrowable.printStackTrace();
	}

	private void a(Throwable paramThrowable) {
		for (Throwable localThrowable = paramThrowable; localThrowable != null; localThrowable = localThrowable
				.getCause())
			localThrowable.setStackTrace(new StackTraceElement[0]);
		try {
			a(paramThrowable.getMessage(), paramThrowable);
			return;
		} catch (Exception localException) {
			System.out.println(paramThrowable.getMessage());
		}
	}

	private static String a(Date paramDate) {
		return SimpleDateFormat.getDateInstance(2).format(paramDate);
	}

	public static RuntimeException a(String paramString1, String paramString2) {
		paramString1 = MessageFormat.format(bb.d("-4njllqpr2n2m62h303cst4lers4j13jyuqjklo6u2i743"),
				new Object[] { paramString1, paramString2 });

		return new RuntimeException(paramString1);
	}

	private Date a(bb var1) {
		String var3;
		if ((var3 = var1.a(bb.d("1m81b2vpljtfnxmoxaelbol"))) == null) {
			throw a(this.c, bb.d("86te4jjcjrfpf5hiittrs2noi8xih2kw8qbdkkxc5toub15ciaq0t12hkni4pfb6dvvacmoc03ucl"));
		} else {
			try {
				return a.parse(var3);
			} catch (ParseException var2) {
				throw a(this.c, bb.d("-benuth93s2hx673qi3yqnuqt9z5k2zctv3l2og3efiyr6mx3lf2gdco4np4b1c") + var3);
			}
		}
	}

	private Date b(bb var1) {
		String var3;
		if ((var3 = var1.a(bb.d("28lqbdq6yls9p1vraqtfplx"))) == null) {
			throw a(this.c, bb.d("86te4furtvk2113ylh2tuqu6j8d2bxwiaq6f6i873lq9d4bjn95lxc12ka8prybplz15qe10dx9ph"));
		} else if (var3.toUpperCase().equals(bb.d("1js3qp8y"))) {
			return null;
		} else {
			try {
				return a.parse(var3);
			} catch (ParseException var2) {
				throw a(this.c, bb.d("-benuth93s2hx673qi3yqnuqt9z5k2zctv3l2p9a3wsu97y2get1n35qeverpwg") + var3);
			}
		}
	}

	private static Date c(bb var0) {
		try {
			String var2;
			return (var2 = var0.a(bb.d("-1kmye09ftyxuehndrac3s0nt019y7bospggr"))) != null ? a.parse(var2) : null;
		} catch (ParseException var1) {
			return null;
		}
	}
}
