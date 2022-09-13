package ex06;

import java.util.Properties;

public interface MemberDao {

	
	public static final String ORACLE_DB = "ex06.MemberDaoOracle";
	public static final String MYSQL_DB = "ex06.MemberDaoByMySQL";
	
	void selectAll();
	
}
