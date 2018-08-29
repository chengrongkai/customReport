package com.crk.custom_report.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(alphabetic = true)
public class JsonResult {
//    返回结果
    private String success;
//    返回数据
    private Object data;
//    错误信息
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String errorMsg;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public JsonResult(String success,Object data){
        this.success = success;
        this.data = data;
    }
    public JsonResult(String success,Object data,String errorMsg){
        this.success = success;
        this.data = data;
        this.errorMsg = errorMsg;
    }
}
