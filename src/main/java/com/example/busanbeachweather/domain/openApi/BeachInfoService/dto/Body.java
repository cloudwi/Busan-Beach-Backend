package com.example.busanbeachweather.domain.openApi.BeachInfoService.dto;

public record Body(
    String dataType,
    Items items,
    int pageNo,
    int numOfRows,
    int totalCount
) {

}
