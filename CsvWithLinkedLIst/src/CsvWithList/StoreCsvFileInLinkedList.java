package CsvWithList;
import java.io.FileReader;
import java.util.Scanner;

import CsvWithList.Node;
import CsvWithList.list;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class StoreCsvFileInLinkedList {

	
	public  void display(list h) {
		System.out.println("list content is:");
		System.out.println();
		System.out.println("Name"+"\t\t"+"City"+"\t\t"+"Age\n");
		while(h.getNext()!=null)
		{
			Node cur=h.getLink();
			while(cur!=null)
			{
				System.out.print(cur.getData()+"\t\t");
				cur=cur.getNext();
			}
			System.out.println();
			h=h.getNext();	
		}
		System.out.println();
		
	}
	public Node sub_list(String name,String city,String age)
	{
		 Node fst = new Node(name);  
	     Node second = new Node(city);  
	     Node third = new Node(age); 
	         
	     fst.setNext(second); // Link first node with the second node  
	     second.setNext(third);
	     return fst;
	}
	
	public  list create_list(String fileName) {
		
	
	     BufferedReader br = null;
	     String line = "";
	     String cvsSplitBy = ",";
	     list first=null,temp=null;
	     try {
	              int i=0;
	             br = new BufferedReader(new FileReader(fileName));
	              list mainlist=new list(i);
	              first=mainlist;
	              temp=mainlist;
	             
	              while ((line = br.readLine()) != null){
	            	
	            	String[] data = line.split(cvsSplitBy);
	            	//link points to sublist
	                temp.setLink(sub_list(data[0],data[1],data[2]));
	                i++;
	                temp.setNext(new list(i)); 
	                temp=temp.getNext();
	                
	               }
			        display(first);
			           
	          }
	      catch (FileNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	      catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        return first;
		}

	 public  void search(list h) {
		  String name;
		  System.out.println("Enter name to search");
		  Scanner scn=new Scanner(System.in);
		  name=scn.nextLine();
			
			while(h.getNext()!=null)
			{
				
				Node cur=h.getLink();
				while(cur!=null)
				{
					if(name.equals(cur.getData()))
					{
						System.out.println("given name present in "+(h.getRow()+1)+" row");
						cur=cur.getNext();
					}else
					{
						
					    cur=cur.getNext();
					}
				}
				System.out.println();
				h=h.getNext();
				
			}
			
		}
	
	
}
