package main.java.LogsLogsLogs;

public class LogLine {
    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        for (LogLevel l: LogLevel.values())
            if (l.getName().equals(logLine.split("]")[0].substring(1)))
                return l;
        return LogLevel.UNKNOWN;
    }

    public String getOutputForShortLog() {
        return String.format("%s:%s", getLogLevel().getMsgLevel(), logLine.split(": ")[1]);
    }
}
