package main.java.BookingUpForBeauty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        String[] date = appointmentDateDescription.split(" ")[0].split("/");
        String[] time = appointmentDateDescription.split(" ")[1].split(":");
        int day, month, year, hour, minute, second;
        day = Integer.parseInt(date[1]);
        month = Integer.parseInt(date[0]);
        year = Integer.parseInt(date[2]);
        hour = Integer.parseInt(time[0]);
        minute = Integer.parseInt(time[1]);
        second = Integer.parseInt(time[2]);
        return LocalDateTime.of(year, month, day, hour, minute, second);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String dayOfWeek = Character.toUpperCase(appointmentDate.getDayOfWeek().name().charAt(0)) +
                appointmentDate.getDayOfWeek().name().toLowerCase().substring(1);
        String month = Character.toUpperCase(appointmentDate.getMonth().name().charAt(0)) +
                appointmentDate.getMonth().name().toLowerCase().substring(1);
        int date = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear();
        int hour = appointmentDate.getHour() > 12 ? appointmentDate.getHour() - 12 : appointmentDate.getHour();
        int minute = appointmentDate.getMinute();
        String amPm = appointmentDate.getHour() > 12 ? "PM" : "AM";
        return String.format("You have an appointment on %s, %s %s, %s, at %s:%s %s.",
                dayOfWeek, month, date, year, hour, minute > 10 ? minute : "0" + minute, amPm);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}