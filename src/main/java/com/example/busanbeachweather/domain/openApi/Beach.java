package com.example.busanbeachweather.domain.openApi;

public enum Beach {
  HEAWOONDAE("해운대", 304, new Forecast(99,75), "11H20000", "11H20201", 2635051000L, "BCH001", 221192),
  SONGDO("송도", 268, new Forecast(97,73), "11H20000", "11H20201", 2614068000L, "BCH012", 221202),
  SONGJUNG("송정", 305, new Forecast(100,76), "11H20000", "11H20201", 2635056000L, "BCH010", 221192),
  GUANGANLEE("광안리", 306, new Forecast(99,75), "11H20000", "11H20201", 2650077000L, "BCH002", 221271),
  DADAEPO("다대포", 308, new Forecast(96,73), "11H20000", "11H20201", 2638060100L, "BCH013", 221202),
  IMLANG("임랑", 307, new Forecast(101,79), "11H20000", "11H20201", 2671025300L, "BCH172", 221231),
  ILGUANG("일광", 309, new Forecast(101,78), "11H20000", "11H20201", 2671025900L, "BCH008", 221231);

  private final String ko;
  private final int beach;
  private final Forecast forecast;
  private final String regidrain;
  private final String regidmedium;
  private final long areano;
  private final String oceancode;
  private final int areaindex;

  Beach(String ko, int beach, Forecast forecast, String regidrain, String regidmedium, long areano,
      String oceancode, int areaindex) {
    this.ko = ko;
    this.beach = beach;
    this.forecast = forecast;
    this.regidrain = regidrain;
    this.regidmedium = regidmedium;
    this.areano = areano;
    this.oceancode = oceancode;
    this.areaindex = areaindex;
  }

  public String getKo() {
    return ko;
  }

  public int getBeach() {
    return beach;
  }

  public Forecast getForecast() {
    return forecast;
  }

  public String getRegidrain() {
    return regidrain;
  }

  public String getRegidmedium() {
    return regidmedium;
  }

  public long getAreano() {
    return areano;
  }

  public String getOceancode() {
    return oceancode;
  }

  public int getAreaindex() {
    return areaindex;
  }
}
