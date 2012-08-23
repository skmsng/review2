package jp.co.dhw.review2;

import java.util.ArrayList;

public class User{

	public Integer	id;
	public String	firstName;
	public String	lastName;

	//初期化コンストラクタ
	public User(Integer id, String firstName, String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void showName(){
		System.out.println(this.lastName + ":" + this.firstName);
	}


	public static void main(String[] args){

		//4のコード
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User(1, "憲隆", "武田"));
		list.add(new User(2, "尭", "今田"));
		list.add(new User(3, "真悟", "酒見"));
		list.add(new User(4, "初美", "内藤"));
		list.add(new User(5, "有希子", "長尾"));
		list.add(new User(6, "大悟", "榎枝"));
		list.add(new User(7, "憲和", "武末"));
		list.add(new User(8, "清司", "原田"));
		list.add(new User(9, "香", "高木"));
		list.add(new User(10, "修平", "永野"));

		for(User user : list){
			System.out.println("id→" + user.id);
			System.out.print("氏名→");
			user.showName();
		}


		//7のコード
		ArrayList<User> list2 = new ArrayList<User>();
		list2.add(new Student(1, "憲隆", "武田"));
		list2.add(new Student(2, "尭", "今田"));
		list2.add(new Student(3, "真悟", "酒見"));
		list2.add(new Student(4, "初美", "内藤"));
		list2.add(new Student(5, "有希子", "長尾"));
		list2.add(new Student(6, "大悟", "榎枝"));
		list2.add(new Student(7, "憲和", "武末"));
		list2.add(new Student(8, "清司", "原田"));
		list2.add(new Student(9, "香", "高木"));
		list2.add(new Student(10, "修平", "永野"));
		list2.add(new Student(11, "龍真 ", "野口"));
		list2.add(new Student(12, "恒一", "花田"));
		list2.add(new Student(13, "耕治", "鐘ヶ江"));
		list2.add(new Student(14, "純一", "奈木野"));
		list2.add(new Student(15, "洋介", "割鞘"));
		list2.add(new Student(16, "宏治", "國崎"));
		list2.add(new Student(17, "裕介", "徳永"));
		list2.add(new Student(18, "伊織", "柴田"));
		list2.add(new Student(19, "洋介", "皆川"));
		list2.add(new Student(20, "恭子", "松隈"));
		list2.add(new Student(21, "兼治", "山野"));
		list2.add(new Student(22, "洋平", "山之内"));

		list2.add(new Teacher(101, "大輔", "長澤", "デザイン"));
		list2.add(new Teacher(102, "ジェイソン", "ラディ", "デザイン"));
		list2.add(new Teacher(103, "隆", "薄井", "Web/アプリ"));
		list2.add(new Teacher(104, "浩司", "山本", "3DCG"));
		list2.add(new Teacher(105, "ノブユキ", "ハナブサ", "デザイン"));
		list2.add(new Teacher(106, "ヨシツグ", "コヌマ", "Web/アプリ"));
		list2.add(new Teacher(107, "昇治", "渡部", "Web/アプリ"));

		for(User user : list2){
			System.out.print("氏名→");
			user.showName();
			
			if(user instanceof Teacher){
				System.out.println("教科→" + ((Teacher)user).getSubject());
			}
		}
	}
}