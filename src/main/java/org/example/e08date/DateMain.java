package org.example.e08date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // 현재 시간 획득
        LocalDateTime targetDate = LocalDateTime.of(2026,11,20, 11, 30, 40);

        // ISO 표준 시게열 문자열 -> 날짜 객체
        LocalDateTime parsedDate = LocalDateTime.parse("2026-11-01T11:30:12");

        // ISO 표준 시계열 이외의 문자열 -> 날짜 객체 (포맷터를 이용)
        String date = "2026-11-01 11:30:12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDat2 = LocalDateTime.parse(date, dateTimeFormatter);

        System.out.println(now);
        System.out.println(parsedDat2);

        LocalDate now2 = LocalDate.now();
        System.out.println(now2);

        // 날짜 계산 (오늘로부터 하루 뒤 날짜)
        LocalDateTime addOneDayFromNow = now.plusDays(1L);
        System.out.println(now);
        System.out.println(addOneDayFromNow);


        // 상대적인 날짜 계산 (TemporalAdjusters)
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(firstDayOfMonth);
        System.out.println(lastDayOfMonth);
        System.out.println(firstDayOfMonth.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));


        // 두 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2025, 9, 10);
        System.out.println(d1.isBefore(d2)); // d1이 d2보다 과거냐 아니냐 =>false
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.isEqual(d2));


        // Period 객체 : 두 날짜를 연/월/일을 단위로 분해해서 각각의 차를 구하는 객체
        Period p1 = Period.between(d1,d2);
        System.out.println(Math.abs(p1.getYears()));
        System.out.println(Math.abs(p1.getMonths()));
        System.out.println(Math.abs(p1.getDays()));
        System.out.println(p1);

        // ChronoUnit 객체
        long untiDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untiDays));


        // LocalDateTime -> LocalDate 추출
        LocalDate extractLocalDateFromNow = now.toLocalDate();
        System.out.println(extractLocalDateFromNow);
    }
}
