package Assignment3;

public class ShowBookInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Author a1=new Author("Juee","juee@gmail.com",'F');
       Author a2=new Author("William Shakespeare","willi@gmail.com",'M');
       Author a3=new Author("Laay Twin Thar Saw Chit","sawchit@gmail.com",'M');
       
       Book b1=new Book("A Mat Ta Ya",a1,2000.0);
       Book b2=new Book("Lwan Pwit Ta Wai Wai",a2,3000.0);
       Book b3=new Book("Chit Thu Si Thoe",a3,4000.0,3);
       
       b1.display();
       System.out.println();
       b2.display();
       System.out.println();
       b3.display();
	}

}
