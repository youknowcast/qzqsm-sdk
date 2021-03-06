package jp.ac.aiit.pbl;

import java.util.List;

public class Weather {
    private Prefix prefix;
    private WarningState warningState;
    private List<WeatherSubcategoryAndRegion> weatherSubcategoryAndRegions;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public WarningState getWarningState() {
        return warningState;
    }
    public void setWarningState(WarningState warningState) {
        this.warningState = warningState;
    }

    public List<WeatherSubcategoryAndRegion> getWeatherSubcategoryAndRegions() {
        return weatherSubcategoryAndRegions;
    }
    public void setWeatherSubcategoryAndRegions(List<WeatherSubcategoryAndRegion> weatherSubcategoryAndRegions) {
        this.weatherSubcategoryAndRegions = weatherSubcategoryAndRegions;
    }
}