package Activities;

public class Activity5 {

	public static void main(String[] args) {
		Book newNovel =new MyBook();
		String title="Hover car racer";
		newNovel.setTitle(title);
		
		System.out.println("Title of novel is :"+ newNovel.getTitle());

	}

}

abstract class Book
{
	String title;

	public String getTitle() {
		return title;
	}

	abstract void setTitle(String s);
	
	
}

class MyBook extends Book
{

	@Override
	void setTitle(String s) {
		title=s;
		
	}
	
	
	
	
}