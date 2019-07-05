package com.test.numberRangeSummarizer;

import com.test.numberRangeSummarizer.api.SummarizerApiTest;
import com.test.numberRangeSummarizer.service.SummarizeServiceTest;
import com.test.numberRangeSummarizer.summarizer.NumberRangeSummarizerTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Suite.class)
@Suite.SuiteClasses({SummarizerApiTest.class, SummarizeServiceTest.class, NumberRangeSummarizerTest.class})
public class AppTests {

	@Test
	public void contextLoads() {
	}
}
