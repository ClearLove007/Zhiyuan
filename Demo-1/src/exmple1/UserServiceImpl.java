package exmple1;

public class UserServiceImpl implements UserService {

	private BookDao book;
	
	public void setBook(BookDao book) {
		this.book = book;
	}
	
	public UserServiceImpl() {
		System.out.println("������");
	}
	
	@Override
	public void addUser() {
		// TODO �Զ����ɵķ������
		System.out.println("a_ioc add user");
		book.bookDao();
	}

}
