package com.example.logprocessor;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }

    @Override
    protected boolean canLog(int logLevel) {
        return this.getLogLevel() <= logLevel && LogProcessor.DEBUG_LEVEL == logLevel;
    }

    @Override
    protected String write(int logLevel, String msg) {
        return String.format("[DEBUG LOG], MSG: %s", msg);
    }
}
