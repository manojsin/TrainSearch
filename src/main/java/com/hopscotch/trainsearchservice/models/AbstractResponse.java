package com.hopscotch.trainsearchservice.models;

import lombok.Data;

@Data
public abstract class AbstractResponse {
    private BaseResponse status;
}
