import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(CustomSuite.class)
@Suite.SuiteClasses({
        PersoanaMockTest.class,
        PersoanaT.class
})
public class NewSuiteTests {
}
