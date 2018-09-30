package project;

public class InitialSchool {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    School center = new School();
    System.out.println("***初始化成员变量***");
    center.showCenter();
    center.schoolName="北京远航";
    center.classNumber= 10;
    center.labNumber=10;
    System.out.println("\n****初始化成员后******");
    center.showCenter();
	}

}
