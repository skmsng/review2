package jp.co.dhw.review2;

public class Teacher extends User{
	public String subject;

	///初期化コンストラクタ
	public Teacher(Integer id, String firstName, String lastName, String subject){
		super(id, firstName, lastName);
		this.subject = subject;
	}

	public String getSubject(){
		return this.subject;
	}

}