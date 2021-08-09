package com.bizpro.tmspda.webapi;

import retrofit2.Response;


/**
 * 呼叫的API都須實作
 **/
public interface ApiResponseCallBack<T> {
    void onResponseReceived(Response<T> response);
    void onFailedToGetResponse(Throwable t);
}
