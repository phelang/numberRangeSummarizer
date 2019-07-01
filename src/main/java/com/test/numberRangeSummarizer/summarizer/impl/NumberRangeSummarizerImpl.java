package com.test.numberRangeSummarizer.summarizer.impl;

import com.test.numberRangeSummarizer.summarizer.NumberRangeSummarizer;

import java.util.Collection;

/**
 * @author Qhu
 *
 * Implements NumberRangeSummarizer Interface. Accepts comma delimited list of numbers,
 * and groups the numbers into a range when they are sequential.
 *
 */

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    public final Collection<Integer> collect(String input) {
        return null;
    }

    public final String summarizeCollection(Collection<Integer> input) {
        return null;
    }

    public final String[] splitString(String string){

        return string.split("[,]");
    }

}