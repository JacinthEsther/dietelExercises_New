package chapter3.targetHeartRate;

import java.time.LocalDateTime;

public class HeartRate {

    private String firstName;
    private String lastName;
    private DateOfBirth dateOfBirth;

    public HeartRate(String firstName, String lastName, DateOfBirth dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        LocalDateTime localDate = LocalDateTime.now();

        return localDate.getYear() - dateOfBirth.getYear();
    }

    public int getMaximumHeartRate() {
        return 220-getAge();
    }

    public String getTargetHeartRate() {
        return String.format("%.1f - %.1f", (0.50 * getMaximumHeartRate()),(0.85 * getMaximumHeartRate()));
    }
}
