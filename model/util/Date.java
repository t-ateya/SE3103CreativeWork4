package model.util;

public class Date implements Comparable<Date> {
	private int day;
	private int month;
	private int year;

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Date(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if ((day > 0) && (day <= daysPerMonth[month])) {
			this.day = day;
			// leap year
		} else if ((month == 2) && (day == 29) && (year % 4 == 0 || year % 100 != 0)) {
			this.day = day;
		} else {
			throw new IllegalArgumentException("day is out of range");
		}

	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if ((month > 0) && (month <= 12)) {
			this.month = month;
		} else {
			throw new IllegalArgumentException("month must be 1-12");
		}

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if ((year > 1950) && (year < 2100)) {
			this.year = year;
		} else {
			throw new IllegalArgumentException("year must be 1950-2100");
		}

	}

	@Override
	public String toString() {
		return String.format("%d/%d/%d", day, month, year);
	}

	@Override
	public int compareTo(Date date) {
		if (this.getYear() != date.getYear()) {
			return this.getYear() - date.getYear();
		} else if (this.getMonth() != date.getMonth()) {
			return this.getMonth() - date.getMonth();
		} else {
			return this.getDay() - date.getDay();
		}

	}
}
