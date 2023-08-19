package org.example;

public class Address {
    String buildingNumber;
    String laneNo;

    public Address(String buildingNumber, String laneNo) {
        this.buildingNumber = buildingNumber;
        this.laneNo = laneNo;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getLaneNo() {
        return laneNo;
    }

    public void setLaneNo(String laneNo) {
        this.laneNo = laneNo;
    }
}
