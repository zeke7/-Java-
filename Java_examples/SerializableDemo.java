import java.io.Serializable;

@SuppressWarnings("serial")
class Book implements Serializable{
	private String title;
	
	public Book(String title){
		this.title = title;
	}
	
	public String toString(){
		return "Book Name: " + this.title;
	}
}



public class SerializableDemo {

	public static void main(String[] args) {
		
	}

}
