package Assignment3;

public class Book extends Author{
 private String name;
 private Author author;
 private Double price;
 private int qty=1;
 
public Book(String name,Author author,Double price){
	super(author.getName(),author.getEmail(),author.getGender());
	this.name=name;
    this.price=price;
    
}
public Book(String name,Author author,Double price,int qty) {
	super(author.getName(),author.getEmail(),author.getGender());
	this.name=name;
	this.price=qty*price;
	this.qty=qty;
	
}
public String getName() {
	return name;
}
public Author getAuthor() {
	return author;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public void setName(String name) {
	this.name=name;
}
public void setAuthor(Author author) {
	this.author=author;
}
public void display() {
	System.out.println("Book Name:" + name);
	System.out.println("Author Name:" + super.getName());
	System.out.println("Author Email:" + super.getEmail());
	System.out.println("Gender:" + super.getGender());
	System.out.println("Book Price:" + price);
	System.out.println("Quantity:" + qty);
	
}

}
