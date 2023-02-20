package com.example.busanbeachweather.domain.openApi.BeachInfoService.dto;

public record Item(
  String beachNum,
  String baseDate,
  String baseTime,
  String category,
  String fcstDate,
  String fcstTime,
  String fcstValue,
  int nx,
  int ny
) {

}
