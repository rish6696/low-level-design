package com.example.logprocessor;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    protected boolean canLog(int logLevel) {
        return this.getLogLevel() <= logLevel &&  logLevel == LogProcessor.INFO_LEVEL;
    }

    @Override
    protected String write(int logLevel, String msg) {
        return String.format("[INFO LOG], MSG: %s", msg);
    }

}
