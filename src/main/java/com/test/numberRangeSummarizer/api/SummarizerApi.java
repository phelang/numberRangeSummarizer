package com.test.numberRangeSummarizer.api;


import com.test.numberRangeSummarizer.service.SummarizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SummarizerApi {

    @Autowired
    private SummarizerService service;

    /**
     * @request http://localhost:8888/summarizer/numbers?n=1,3,6,7,8,12,13,14,15,21,22,23,24,31
     * @param n
     * @return string
     */
    @GetMapping("/summarizer/numbers")
    @ResponseBody
    public String getSummarizedNumbers(@RequestParam String n) {
        return service.summarizeCollection(n);
    }

    @GetMapping("/")
    @ResponseBody
    public String welcomeMessage() {
        return "<h1>Sequential Number summarizer<h1>";
    }
}
