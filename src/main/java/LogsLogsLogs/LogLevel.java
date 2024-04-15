package main.java.LogsLogsLogs;

public enum LogLevel {
    UNKNOWN("UNK", 0),
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42);

    private String name;
    private int msgLevel;
    private LogLevel(String name, int msgLevel) {
        this.name = name;
        this.msgLevel = msgLevel;
    }

    public String getName() { return name; }
    public int getMsgLevel() { return msgLevel; }
}
