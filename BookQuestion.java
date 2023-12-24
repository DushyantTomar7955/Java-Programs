package programs.com;

import java.util.Objects;

class Book{
	String name;
	int price;
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	
	
}

public class BookQuestion {

	public static void main(String[] args) {
	Book b1=new Book("The Alcamist",300);
	Book b2=new Book("The Way of Thinking",500);
	Book b3=new Book("The Alcamist",300);
	System.out.println(b1==b2);
    System.out.println(b1==b3);
    System.out.println(b1.name.equals(b3.name));
    System.out.println(b1.price==b2.price);

	}

}
