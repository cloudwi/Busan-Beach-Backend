package com.example.busanbeachweather.domain.openApi;

public class Forecast {

  private int nx;
  private int ny;

  protected Forecast() {
  }

  public Forecast(int nx, int ny) {
    this.nx = nx;
    this.ny = ny;
  }

  public int getNx() {
    return nx;
  }

  public int getNy() {
    return ny;
  }
}
