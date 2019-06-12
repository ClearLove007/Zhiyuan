package exmple1;

public class UserServiceImpl implements UserService {

	private BookDao book;
	
	public void setBook(BookDao book) {
		this.book = book;
	}
	
	public UserServiceImpl() {
		System.out.println("被加载");
	}
	
	@Override
	public void addUser() {
		// TODO 自动生成的方法存根
		System.out.println("a_ioc add user");
		book.bookDao();
	}

}
