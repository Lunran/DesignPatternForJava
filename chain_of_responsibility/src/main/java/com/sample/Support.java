package com.sample;

public abstract class Support {

	String name;
	Support next;

	public Support(String string) {
		this.name = string;
	}

	public Support setNext(Support support) {
		this.next = support;
		return this.next;
	}

	public void support(Trouble trouble) {
		boolean result = resolve(trouble);
		if (result) {
			System.out.println(done(trouble));
		}
		else if (next != null) {
			next.support(trouble);
		}
		else {
			System.out.println(fail(trouble));
		}
	}

	protected abstract boolean resolve(Trouble trouble);

	private String done(Trouble trouble) {
		return trouble + " is resolved by " + this + ".";
	}

	private String fail(Trouble trouble) {
		return trouble + " cannot be resolved.";
	}

	public String toString() {
		return "[" + name + "]";
	}

}
