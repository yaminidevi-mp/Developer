package linkedlist.doublelinkedlist;

public class DLLPerson {
	String name;
    DLLPerson connectNext = null;
    DLLPerson connectPrev = null;
    public DLLPerson(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public DLLPerson getConnectNext() {
		return connectNext;
	}
	public void setConnectNext(DLLPerson connectNext) {
		this.connectNext = connectNext;
	}
	public DLLPerson getConnectPrev() {
		return connectPrev;
	}
	public void setConnectPrev(DLLPerson connectPrev) {
		this.connectPrev = connectPrev;
	}
}
