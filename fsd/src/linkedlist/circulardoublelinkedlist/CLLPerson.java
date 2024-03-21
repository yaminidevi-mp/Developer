package linkedlist.circulardoublelinkedlist;

public class CLLPerson {
	String name;
	CLLPerson connectNext = null;
	CLLPerson connectPrev = null;
    public CLLPerson(String name) {
		this.name = name;
	}
}
