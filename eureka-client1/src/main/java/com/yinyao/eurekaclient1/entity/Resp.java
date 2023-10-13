package com.yinyao.eurekaclient1.entity;

/**
 * @author yinyao
 * @title: Resp
 * @projectName eureka_demo
 * @description: TODO
 * @date 2023/10/1118:15
 */
public class Resp {

    private Object data;
    private String desc;
    private int code;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
