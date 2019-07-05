package com.test.numberRangeSummarizer.service.impl;

import com.test.numberRangeSummarizer.service.SummarizerService;
import com.test.numberRangeSummarizer.summarizer.NumberRangeSummarizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummarizerServiceImpl implements SummarizerService {

    @Autowired
    private NumberRangeSummarizer numberRangeSummarizer;

    @Override
    public String summarizeCollection(String input) {
        return numberRangeSummarizer.summarizeCollection(numberRangeSummarizer.collect(input));

    }
}
