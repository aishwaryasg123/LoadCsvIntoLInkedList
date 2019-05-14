package CsvWithList;

import java.io.IOException;

public class App {
	
	public static void main(String[] args) throws IOException {
		StoreCsvFileInLinkedList s=new StoreCsvFileInLinkedList();
		list list=null;
		
		if (0 < args.length) {
			//list=s.create_list("src/Upload.csv");
			list=s.create_list(args[0]);
			s.search(list);
		}
		else {
				   System.err.println("Invalid arguments count:" + args.length);
				   System.exit(0);
		}
		
	}

}
