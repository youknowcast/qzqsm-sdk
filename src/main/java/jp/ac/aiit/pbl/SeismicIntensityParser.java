package jp.ac.aiit.pbl;

import java.time.LocalDateTime;

public class SeismicIntensityParser {
    
    public SeismicIntensity parse(String qzMessage){
        SeismicIntensity seismicIntensity = new SeismicIntensity();
        
        //seismicIntensity.setOccurrenceTimeOfEarthquakeDay(toOccurrenceTime(qzMessage.substring(53, 58)));
        //seismicIntensity.setOccurrenceTimeOfEarthquakeHour(toOccurrenceTime(qzMessage.substring(58, 63)));
        //seismicIntensity.setOccurrenceTimeOfEarthquakeMinute(toOccurrenceTime(qzMessage.substring(63, 69)));
        
        seismicIntensity.setOccurrenceTime(toOccurrenceTime(qzMessage.substring(53, 69)));
        
        seismicIntensity.setSeismicIntensityRegion1(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(69, 72))));
        seismicIntensity.setSeismicIntensityPrefectureRegion1(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(72, 78))));
        
        seismicIntensity.setSeismicIntensityRegion2(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(78, 81))));
        seismicIntensity.setSeismicIntensityPrefectureRegion2(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(81, 87))));
        
        seismicIntensity.setSeismicIntensityRegion3(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(87, 90))));
        seismicIntensity.setSeismicIntensityPrefectureRegion3(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(90, 96))));
        
        seismicIntensity.setSeismicIntensityRegion4(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(96, 99))));
        seismicIntensity.setSeismicIntensityPrefectureRegion4(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(99, 105))));
        
        seismicIntensity.setSeismicIntensityRegion5(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(105, 108))));
        seismicIntensity.setSeismicIntensityPrefectureRegion5(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(108, 114))));
        
        seismicIntensity.setSeismicIntensityRegion6(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(114, 117))));
        seismicIntensity.setSeismicIntensityPrefectureRegion6(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(117, 123))));

        seismicIntensity.setSeismicIntensityRegion7(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(123, 126))));
        seismicIntensity.setSeismicIntensityPrefectureRegion7(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(126, 132))));
        
        seismicIntensity.setSeismicIntensityRegion8(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(132, 135))));
        seismicIntensity.setSeismicIntensityPrefectureRegion8(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(135, 141))));
        
        seismicIntensity.setSeismicIntensityRegion9(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(141, 144))));
        seismicIntensity.setSeismicIntensityPrefectureRegion9(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(144, 150))));
        
        seismicIntensity.setSeismicIntensityRegion10(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(150, 153))));
        seismicIntensity.setSeismicIntensityPrefectureRegion10(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(153, 159))));
        
        seismicIntensity.setSeismicIntensityRegion11(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(159, 162))));
        seismicIntensity.setSeismicIntensityPrefectureRegion11(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(162, 168))));
        
        seismicIntensity.setSeismicIntensityRegion12(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(168, 171))));
        seismicIntensity.setSeismicIntensityPrefectureRegion12(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(171, 177))));
        
        seismicIntensity.setSeismicIntensityRegion13(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(177, 180))));
        seismicIntensity.setSeismicIntensityPrefectureRegion13(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(180, 186))));
        
        seismicIntensity.setSeismicIntensityRegion14(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(186, 189))));
        seismicIntensity.setSeismicIntensityPrefectureRegion14(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(189, 195))));
        
        seismicIntensity.setSeismicIntensityRegion15(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(195, 198))));
        seismicIntensity.setSeismicIntensityPrefectureRegion15(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(198, 204))));
        
        seismicIntensity.setSeismicIntensityRegion16(SeismicIntensityWarning.getSeismicIntensity(Integer.parseInt(qzMessage.substring(204, 207))));
        seismicIntensity.setSeismicIntensityPrefectureRegion16(SeismicIntensityPrefecture.getRegionName(Integer.parseInt(qzMessage.substring(207,213))));
        
        return seismicIntensity;
    }
    
    private LocalDateTime toOccurrenceTime(String message){
        int day = Integer.parseInt(message.substring(0, 4),2);
        int hour = Integer.parseInt(message.substring(4, 9),2);
        int minute  = Integer.parseInt(message.substring(9, 15),2);
        return LocalDateTime.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),day,hour,minute);
    }
}
