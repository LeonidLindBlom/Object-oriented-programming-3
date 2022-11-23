package com.company;

public enum Months {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private Months(String monthName) {
        this.monthName = monthName;
    }

    private int index;
    private String monthName;

    public String getMonthName() {
        return monthName;
    }
}
