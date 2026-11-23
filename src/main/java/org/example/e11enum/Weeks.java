package org.example.e11enum;

public enum Weeks {
    // Enum : 상수의 집합은 편리하게 선언하고 사용하기위해서 만든 객체

    MONDAY("월요일", 1),
    TUESDAY("화요일", 2),
    WEDNESDAY("수요일", 3),
    THURSDAY("목요일", 4),
    FRIDAY("금요일", 5),
    SATURDAY("토요일", 6),
    SUNDAY("일요일", 7);

    private final String krDay;
    private final int dayNum;

    Weeks(String krDay, int dayNum){
        this.krDay = krDay;
        this.dayNum = dayNum;
    }

    public int getDayNum() {
        return dayNum;
    }

    // Getter
    public String getKrDay(){
        return this.krDay;
    }


}
