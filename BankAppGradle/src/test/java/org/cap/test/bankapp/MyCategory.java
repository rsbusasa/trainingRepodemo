package org.cap.test.bankapp;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ BankAppTestCase.class, DemoTestCases.class })
//@IncludeCategory({GoodTestCategory.class})
@ExcludeCategory({BadTestCategory.class})
public class MyCategory {

}
