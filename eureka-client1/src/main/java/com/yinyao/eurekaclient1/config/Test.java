package com.yinyao.eurekaclient1.config;

/**
 * @author yinyao
 * @title: Test
 * @projectName eureka_demo
 * @description: TODO
 * @date 2023/9/1415:09
 */
public class Test {

        private Integer stationId;      //电站ID
        private String stationName;     //站点名称
        private String operatorOrgCode; //所属运营商组织机构代码9位
        private String stationStatus;   //站点状态
        private String stationOperatorAttributeId;  //运营商经营类型ID

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getOperatorOrgCode() {
        return operatorOrgCode;
    }

    public void setOperatorOrgCode(String operatorOrgCode) {
        this.operatorOrgCode = operatorOrgCode;
    }

    public String getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(String stationStatus) {
        this.stationStatus = stationStatus;
    }

    public String getStationOperatorAttributeId() {
        return stationOperatorAttributeId;
    }

    public void setStationOperatorAttributeId(String stationOperatorAttributeId) {
        this.stationOperatorAttributeId = stationOperatorAttributeId;
    }
}
