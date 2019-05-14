package CsvWithList;



public class list {
	private int row;
	private Node link;
	private list next;
	public list(int i) {
		super();
		this.row = i;
		this.link = null;
		this.next = null;
	}
	
	public list() {}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	public list getNext() {
		return next;
	}

	public void setNext(list next) {
		this.next = next;
	};
	
}
	


