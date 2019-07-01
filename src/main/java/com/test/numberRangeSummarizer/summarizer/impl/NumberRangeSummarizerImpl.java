package com.test.numberRangeSummarizer.summarizer.impl;

import com.test.numberRangeSummarizer.summarizer.NumberRangeSummarizer;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * @author Qhu
 *
 * Implements NumberRangeSummarizer Interface. Accepts comma delimited list of numbers,
 * and groups the numbers into a range when they are sequential.
 *
 */

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    @Override
    public final Collection<Integer> collect(String input) {

        return Arrays.stream(input.split("[,]"))
                .filter(val -> val.matches("^[0-9]*$"))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public final String summarizeCollection(Collection<Integer> input) {
        return "Hello World";
    }

    /* MAYBE OR NOT - Unnecessary repition create a separate file implementation for utils */
    private String[] splitInput(String input) {

        return input.split("[,]");
    }

    private boolean validate(String str) {
        return str.matches("^[0-9]*$");
    }
}