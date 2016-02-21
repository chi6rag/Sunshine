package net.chiragaggarwal.android.sunshine.models;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DayTest {
    @Test
    public void sundayShouldHaveMondayAsNextDay() {
        assertEquals(Day.MONDAY, Day.SUNDAY.next());
    }

    @Test
    public void mondayShouldHaveTuesdayAsNextDay() {
        assertEquals(Day.TUESDAY, Day.MONDAY.next());
    }

    @Test
    public void tuesdayShouldHaveWednesdayAsNextDay() {
        assertEquals(Day.WEDNESDAY, Day.TUESDAY.next());
    }

    @Test
    public void wednesdayShouldHaveThursdayAsNextDay() {
        assertEquals(Day.THURSDAY, Day.WEDNESDAY.next());
    }

    @Test
    public void thursdayShouldHaveFridayAsNextDay() {
        assertEquals(Day.FRIDAY, Day.THURSDAY.next());
    }

    @Test
    public void fridayShouldHaveSaturdayAsNextDay() {
        assertEquals(Day.SATURDAY, Day.FRIDAY.next());
    }

    @Test
    public void saturdayShouldHaveSundayAsNextDay() {
        assertEquals(Day.SUNDAY, Day.SATURDAY.next());
    }

    @Test
    public void knowsHowToParseMonday() {
        assertEquals(Day.MONDAY, Day.parse("Monday"));
    }

    @Test
    public void knowsHowToParseTuesday() {
        assertEquals(Day.TUESDAY, Day.parse("Tuesday"));
    }

    @Test
    public void knowsHowToParseWednesday() {
        assertEquals(Day.WEDNESDAY, Day.parse("Wednesday"));
    }

    @Test
    public void knowsHowToParseThursday() {
        assertEquals(Day.THURSDAY, Day.parse("Thursday"));
    }

    @Test
    public void knowsHowToParseFriday() {
        assertEquals(Day.FRIDAY, Day.parse("Friday"));
    }

    @Test
    public void knowsHowToParseSaturday() {
        assertEquals(Day.SATURDAY, Day.parse("Saturday"));
    }

    @Test
    public void knowsHowToParseSunday() {
        assertEquals(Day.SUNDAY, Day.parse("Sunday"));
    }

    @Test
    public void sundayShouldHaveSaturdayAsPreviousDay() {
        assertEquals(Day.SATURDAY, Day.SUNDAY.previous());
    }

    @Test
    public void mondayShouldHaveSaturdayAsPreviousDay() {
        assertEquals(Day.SUNDAY, Day.MONDAY.previous());
    }

    @Test
    public void tuesdayShouldHaveMondayAsPreviousDay() {
        assertEquals(Day.MONDAY, Day.TUESDAY.previous());
    }

    @Test
    public void wednesdayShouldHaveThursdayAsPreviousDay() {
        assertEquals(Day.TUESDAY, Day.WEDNESDAY.previous());
    }

    @Test
    public void thursdayShouldHaveFridayAsPreviousDay() {
        assertEquals(Day.WEDNESDAY, Day.THURSDAY.previous());
    }

    @Test
    public void fridayShouldHaveThursdayAsPreviousDay() {
        assertEquals(Day.THURSDAY, Day.FRIDAY.previous());
    }

    @Test
    public void saturdayShouldHaveFridayAsPreviousDay() {
        assertEquals(Day.FRIDAY, Day.SATURDAY.previous());
    }
}
