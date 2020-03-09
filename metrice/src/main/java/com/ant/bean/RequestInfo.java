package com.ant.bean;

/**
 * <p>
 * 数据信息类
 * </p>
 *
 * @author Ant
 * @since 2020/3/9 9:16 上午
 */
public class RequestInfo {
    private String apiName;
    private double responseTime;
    private long timestamp;

    private RequestInfo() {

    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public double getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(double responseTime) {
        this.responseTime = responseTime;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
