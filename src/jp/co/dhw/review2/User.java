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

	//mainメソッド
	public static void main(String[] args){

		//4のコード（ArrayList）
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
		
		//7のコード（ArrayList）
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
		
		
		//4のコード（配列）
		User[] user = new User[10];
		user[0] = new User(1, "憲隆", "武田");
		user[1] = new User(2, "尭", "今田");
		user[2] = new User(3, "真悟", "酒見");
		user[3] = new User(4, "初美", "内藤");
		user[4] = new User(5, "有希子", "長尾");
		user[5] = new User(6, "大悟", "榎枝");
		user[6] = new User(7, "憲和", "武末");
		user[7] = new User(8, "清司", "原田");
		user[8] = new User(9, "香", "高木");
		user[9] = new User(10, "修平", "永野");
		
		for(int i=0; i<user.length; i++){
			System.out.println("id→" + user[i].id);
			System.out.print("氏名→");
			user[i].showName();
		}
		
		//7のコード（配列）
		User[] user2 = new User[29];
		user2[0] = new User(1, "憲隆", "武田");
		user2[1] = new User(2, "尭", "今田");
		user2[2] = new User(3, "真悟", "酒見");
		user2[3] = new User(4, "初美", "内藤");
		user2[4] = new User(5, "有希子", "長尾");
		user2[5] = new User(6, "大悟", "榎枝");
		user2[6] = new User(7, "憲和", "武末");
		user2[7] = new User(8, "清司", "原田");
		user2[8] = new User(9, "香", "高木");
		user2[9] = new User(10, "修平", "永野");
		user2[10] = new Student(11, "龍真 ", "野口");
		user2[11] = new Student(12, "恒一", "花田");
		user2[12] = new Student(13, "耕治", "鐘ヶ江");
		user2[13] = new Student(14, "純一", "奈木野");
		user2[14] = new Student(15, "洋介", "割鞘");
		user2[15] = new Student(16, "宏治", "國崎");
		user2[16] = new Student(17, "裕介", "徳永");
		user2[17] = new Student(18, "伊織", "柴田");
		user2[18] = new Student(19, "洋介", "皆川");
		user2[19] = new Student(20, "恭子", "松隈");
		user2[20] = new Student(21, "兼治", "山野");
		user2[21] = new Student(22, "洋平", "山之内");
		user2[22] = new Teacher(101, "大輔", "長澤", "デザイン");
		user2[23] = new Teacher(102, "ジェイソン", "ラディ", "デザイン");
		user2[24] = new Teacher(103, "隆", "薄井", "Web/アプリ");
		user2[25] = new Teacher(104, "浩司", "山本", "3DCG");
		user2[26] = new Teacher(105, "ノブユキ", "ハナブサ", "デザイン");
		user2[27] = new Teacher(106, "ヨシツグ", "コヌマ", "Web/アプリ");
		user2[28] = new Teacher(107, "昇治", "渡部", "Web/アプリ");
		
		for(int i=0; i<user2.length; i++){
			System.out.print("氏名→");
			user2[i].showName();
			
			if(user2[i] instanceof Teacher){
				System.out.println("教科→" + ((Teacher)user2[i]).getSubject());
			}
		}
	}
}