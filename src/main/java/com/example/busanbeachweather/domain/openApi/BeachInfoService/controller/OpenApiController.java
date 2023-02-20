package com.example.busanbeachweather.domain.openApi.BeachInfoService.controller;

import com.example.busanbeachweather.domain.openApi.BeachInfoService.BeachInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/OpenApiController")
public class OpenApiController {

  private final BeachInfoService beachInfoService;

  public OpenApiController(BeachInfoService beachInfoService) {
    this.beachInfoService = beachInfoService;
  }

  @GetMapping
  public void getUltraSrtFcstBeach() {
    beachInfoService.getUltraSrtFcstBeach("304");

  }
}
