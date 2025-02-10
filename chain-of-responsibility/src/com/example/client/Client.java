package com.example.client;

import com.example.logprocessor.DebugLogProcessor;
import com.example.logprocessor.ErrorLogProcessor;
import com.example.logprocessor.InfoLogProcessor;
import com.example.logprocessor.LogProcessor;

public class Client {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(LogProcessor.ERROR_LEVEL, "Failed to Find Enabled Organization application");
    }
}
