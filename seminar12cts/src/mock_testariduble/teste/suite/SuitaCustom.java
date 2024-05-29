package mock_testariduble.teste.suite;

import mock_testariduble.teste.PachetTuristicTest;
import mock_testariduble.teste.PersoanaTest;
import mock_testariduble.teste.categorii.FaraMock;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(FaraMock.class)
public class SuitaCustom {

}
