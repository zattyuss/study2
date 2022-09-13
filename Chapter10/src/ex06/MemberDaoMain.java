package ex06;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class MemberDaoMain {
	public static void main(String[] args) {
		
		String choice = command();
		
		try {
			Class<?> clazz = Class.forName(choice);
			MemberDao dao = (MemberDao) clazz.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	private static String command() {
		Scanner scan = new Scanner(System.in);
		String choice;
		while(true) {
			System.out.println("DB선택 1.오라클 | 2.MySQL");
			choice = scan.nextLine();
			if(choice.equals("1")) {
				System.out.println("오라클 데이터베이스 선택");
				choice = MemberDao.ORACLE_DB;
				break;
			}else if(choice.equals("2")) {
				System.out.println("MySQL 데이터베이스 선택");
				choice = MemberDao.MYSQL_DB;
				break;
			}else {
				System.out.println("다시입력");
				
			}
			
		}
		scan.close();
		return choice;
	}
}
