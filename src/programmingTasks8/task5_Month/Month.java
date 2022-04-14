package programmingTasks8.task5_Month;

import java.util.ArrayList;
import java.util.Arrays;

public class Month {

    private int monthNumber;
    private String monthName;

    ArrayList<String> monthsList = new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));

    Month() {
        monthNumber = 1;
    }

    Month(int monthNumber) {
        this.monthNumber = monthNumber;
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        }
    }

    Month(String monthName) {
        for (int i = 0; i < monthsList.size(); i++) {
            if (monthName.equalsIgnoreCase(monthsList.get(i))) {
                monthNumber = i;
                break;
            }
        }
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
        if (monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        }
    }


    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        return monthName;
    }


    public String toString() {
        return "The number of the month is " + getMonthNumber();
    }

    public boolean equals(Month object) {
        boolean status;
        if (monthNumber == object.monthNumber) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean greaterThan(Month object) {
        return monthNumber > object.monthNumber;
    }

    public boolean lessThan(Month object) {
        return monthNumber < object.monthNumber;
    }

}
