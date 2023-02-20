package com.example.busanbeachweather.domain.openApi.BeachInfoService;

import com.example.busanbeachweather.domain.openApi.BeachInfoService.dto.GetUltraSrtFcstBeachResponseDto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class BeachInfoService {

  private final WebClient webClient;
  private final String secrtKey;

  public BeachInfoService(@Value("${openApi.BeachInfoservice.key}") String secrtKey) {
    this.secrtKey = secrtKey;
    this.webClient = WebClient.create("https://apis.data.go.kr/1360000/BeachInfoservice");
  }

  public void getUltraSrtFcstBeach(String beachNum) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dateDayFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HHmm");

    String formatedDay = now.format(dateDayFormatter);
    String formatedTime = now.minusMinutes(30).format(dateTimeFormatter);

    String uri = "/getUltraSrtFcstBeach"
        + "?"
        + secrtKey
        + "&numOfRows=60"
        + "&pageNo=1"
        + "&dataType=JSON"
        + "&base_date="
        + formatedDay
        + "&base_time="
        + formatedTime
        + "&beach_num="
        + beachNum;

    GetUltraSrtFcstBeachResponseDto getUltraSrtFcstBeachResponseDto = webClient
        .get()
        .uri(uri)
        .retrieve()
        .bodyToMono(GetUltraSrtFcstBeachResponseDto.class)
        .block();

  }

  public void getTwBuoyBeach(String beachNum) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dateDayFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HHmm");

    String formatedDay = now.format(dateDayFormatter);
    String formatedTime = now.minusMinutes(30).format(dateTimeFormatter);

    String uri = "/getTwBuoyBeach"
        + "?"
        + secrtKey
        + "&numOfRows=60"
        + "&pageNo=1"
        + "&dataType=JSON"
        + "&base_date="
        + formatedDay
        + "&base_time="
        + formatedTime
        + "&beach_num="
        + beachNum;

    GetUltraSrtFcstBeachResponseDto getUltraSrtFcstBeachResponseDto = webClient
        .get()
        .uri(uri)
        .retrieve()
        .bodyToMono(GetUltraSrtFcstBeachResponseDto.class)
        .block();

  }

}
