package com.test.numberRangeSummarizer.api;

import com.test.numberRangeSummarizer.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@AutoConfigureMockMvc
public class SummarizerApiTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testThatRequestAndResponseIsSuccessfull() throws Exception {

        String inputNumbers = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        String expectedSummary = "1,3,6-8,12-15,21-24,31";

        mvc.perform(get("/summarizer/numbers?n="+ inputNumbers))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedSummary));
    }
}
