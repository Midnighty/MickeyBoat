package net.kodehawa.lib.mantarolang.objects;

public class LangString implements LangWrapped<String> {
	private final String s;

	public LangString(String s) {
		this.s = s;
	}

	@Override
	public String get() {
		return s;
	}

	@Override
	public String toString() {
		return "LangString{" + '\'' + s + '\'' + '}';
	}
}