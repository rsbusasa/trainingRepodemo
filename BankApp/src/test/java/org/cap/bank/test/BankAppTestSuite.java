package org.cap.bank.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
@RunWith(Categories.class)
@SuiteClasses({ BankAppTestCase.class, TestApplication.class })
//@IncludeCategory({GoodTestCategory.class})
@ExcludeCategory({BadTestCategory.class})
public class BankAppTestSuite {

}
