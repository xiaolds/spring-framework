package test;

public class Foo {

	private int fooId;
	private String fooName;


	public int getFooId() {
		return fooId;
	}

	public void setFooId(int fooId) {
		this.fooId = fooId;
	}

	public String getFooName() {
		return fooName;
	}

	public void setFooName(String fooName) {
		this.fooName = fooName;
	}

	@Override
	public String toString() {
		return "Foo{" +
				"fooId=" + fooId +
				", fooName='" + fooName + '\'' +
				'}';
	}
}
