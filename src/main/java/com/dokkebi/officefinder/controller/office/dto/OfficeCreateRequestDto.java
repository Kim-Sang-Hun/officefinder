package com.dokkebi.officefinder.controller.office.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OfficeCreateRequestDto {

  String officeName;
  Integer maxCapacity;
  Long leaseFee;
  Integer remainRoom;

  // address
  String legion;
  String city;
  String town;
  String village;
  String bungi;
  String street;
  String buildingNumber;
  Integer zipcode;
  Double latitude;
  Double longitude;

  // option
  Boolean haveAirCondition;
  Boolean haveCafe;
  Boolean havePrinter;
  Boolean packageSendServiceAvailable;
  Boolean haveDoorLock;
  Boolean faxServiceAvailable;
  Boolean havePublicKitchen;
  Boolean havePublicLounge;
  Boolean havePrivateLocker;
  Boolean haveTvProjector;
  Boolean haveWhiteBoard;
  Boolean haveWifi;
  Boolean haveShowerBooth;
  Boolean haveStorage;
  Boolean haveHeater;
}
