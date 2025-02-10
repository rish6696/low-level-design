package com.example.logprocessor;

public abstract class LogProcessor {
    private LogProcessor nextLogProcessor;

    private int logLevel;

    public void setLogLevel(int logLevel) {
        this.logLevel = logLevel;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public static final int INFO_LEVEL = 2;
    public static final int DEBUG_LEVEL = 1;
    public static final int ERROR_LEVEL = 3;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
        this.logLevel = DEBUG_LEVEL;
        // set Default log level as DEBUG Which is lowest priority.
    }

    protected abstract boolean canLog(int logLevel);

    protected abstract String write(int logLevel, String msg);

    public void log(int logLevel, String msg) {
        if (this.canLog(logLevel)) {
            System.out.println(this.write(logLevel, msg));
            return;
        }

        if (this.nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, msg);
        }
    }

}