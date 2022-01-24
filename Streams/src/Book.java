import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Book {
	String bname;
	Double price;
	Long bpages;
	Integer nbooks;
	public Book(String bname, Double price, Long bpages, Integer nbooks) {
		super();
		this.bname = bname;
		this.price = price;
		this.bpages = bpages;
		this.nbooks = nbooks;
	}
	@Override
	public String toString() {
		return "Book [bname=" + bname + ", price=" + price + ", bpages=" + bpages + ", nbooks=" + nbooks + "]";
	}
	
	public static void main(String[] args) {
		Book b1=new Book("corejava",500.00,(long) 1000,5);
		Book b2=new Book("corejava",600.00,(long) 2000,6);
		Book b3=new Book("corejava",400.00,(long) 500,8);
		Book b4=new Book("corejava",200.00,(long) 3000,4);
		
		List<Book> li=new ArrayList<Book>();
		li.add(b1);
		li.add(b2);
		li.add(b3);
		li.add(b4);
		System.out.println(li);
		Long nob=li.stream().collect(Collectors.counting());
		System.out.println(nob);
		
		Integer sumNbooks=li.stream().collect(Collectors.summingInt((p)->p.nbooks));
		System.out.println(sumNbooks);
		
		
	}
	
}


