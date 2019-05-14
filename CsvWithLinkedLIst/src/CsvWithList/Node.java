package CsvWithList;


public class Node {
	
	    private String data;  
	    private Node next; 
	    private  Node down;
	     Node(){}
	         
	     Node(String d) 
	     {
	        data = d;  
	        next=null;
	        down=null;
	     }

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getDown() {
			return down;
		}

		public void setDown(Node down) {
			this.down = down;
		}  
	     
	

}