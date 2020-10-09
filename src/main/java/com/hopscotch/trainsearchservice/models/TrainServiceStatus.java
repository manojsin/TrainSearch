package com.hopscotch.trainsearchservice.models;

public enum TrainServiceStatus implements BasicResponseStatus {
    DATA_NOT_AVAILABLE("200","data not available",null,false),
    SUCCESS("200","Successfully data fetched","",true);
    private boolean status;
    private String message;
    private String httpCode;
    private String developerMessage;

    TrainServiceStatus(String httpCode, String message, String developerMessage, boolean status){
        this.status = status;
        this.message = message;
        this.httpCode= httpCode;
        this.developerMessage= developerMessage;
    }

    public boolean isStatus() {
        return status;
    }
    public String getMessage() {
        return message;
    }
    public String getHttpCode() {
        return httpCode;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }
}
