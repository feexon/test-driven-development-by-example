import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@SuiteClasses({
	MoneyTest.class,
	SumTest.class,
	BankTest.class
})
@RunWith(Suite.class)
public class AllTests{
}
