package com.hopscotch.trainsearchservice.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public interface BasicResponseStatus {
    boolean isStatus();
    String getMessage();
    String getHttpCode();
    String getDeveloperMessage();
}