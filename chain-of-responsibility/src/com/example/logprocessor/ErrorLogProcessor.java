package com.example.logprocessor;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    protected boolean canLog(int logLevel) {
        return this.getLogLevel() <= logLevel && LogProcessor.INFO_LEVEL == logLevel;
    }

    @Override
    protected String write(int logLevel, String msg) {
        return String.format("[ERROR LOG], MSG: %s", msg);
    }

}
