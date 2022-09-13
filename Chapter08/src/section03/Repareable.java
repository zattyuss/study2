package section03;

public interface Repareable {
	void repareable();
	
	default void autoRecovery() {};
	default void test1() {};
	default void test2() {};
	default void test3() {};
}
