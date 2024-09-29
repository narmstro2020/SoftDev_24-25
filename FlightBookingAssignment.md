
# Assignment: Java Flight Booking System - Working with Temporal Classes

## Objective:
In this assignment, you will create a basic flight booking system. You'll use Java’s Date and Time API to handle operations such as booking dates, calculating flight durations, handling time zones, and more. Each part will focus on a specific class (e.g., `LocalDate`, `LocalTime`, `ZonedDateTime`, etc.), with comments guiding you on what tasks to perform.

## Instructions:
1. Download and complete the starter code provided.
2. Implement the required functionality in each section using the appropriate Java classes and methods.
3. Test the system with different flight schedules, departure/arrival times, and time zones.
4. Ensure that the output matches the expected results specified in each comment.

---

## Starter Code (with Instructions):

```java
import java.time.*;
import java.time.temporal.ChronoUnit;

public class FlightBookingSystem {

    public static void main(String[] args) {
        // TODO 1: Flight Booking Date (LocalDate)
        // - Create a LocalDate object representing the flight booking date (today's date).
        // - Print the booking date.
        // - Simulate a user booking a flight for a specific future date (e.g., 2024-12-15).
        // - Print the flight booking date and the days until the flight.
        LocalDate bookingDate;  // Initialize booking date (today)
        LocalDate flightDate;   // Initialize future flight date
        long daysUntilFlight;   // Calculate days between booking and flight

        // TODO 2: Flight Time (LocalTime)
        // - Create a LocalTime object for the flight departure time (e.g., 14:30).
        // - Print the departure time.
        // - Simulate the flight duration (e.g., 5 hours and 45 minutes) and calculate the arrival time.
        // - Print the arrival time.
        LocalTime departureTime;
        LocalTime arrivalTime;
        Duration flightDuration;

        // TODO 3: Full Flight Schedule (LocalDateTime)
        // - Create a LocalDateTime object for the full flight schedule (departure date and time).
        // - Print the departure date and time.
        // - Calculate the flight's estimated arrival date and time.
        LocalDateTime departureDateTime;
        LocalDateTime arrivalDateTime;

        // TODO 4: Instant for Exact Flight Event
        // - Create an Instant object for the exact moment of takeoff (current UTC time).
        // - Print the flight takeoff moment in UTC.
        // - Simulate a delay of 10 minutes and print the updated takeoff time.
        Instant takeoffInstant;
        Instant updatedTakeoffInstant;

        // TODO 5: Flight Layover Period (Period)
        // - Create a Period representing a layover between connecting flights (e.g., 1 day layover).
        // - Add this layover to the arrival date-time of the first flight to get the departure date-time of the next flight.
        Period layoverPeriod;
        LocalDateTime nextFlightDeparture;

        // TODO 6: Flight Duration (Duration)
        // - Create a Duration representing the total flight time (e.g., 8 hours).
        // - Print the flight duration.
        // - Calculate the total travel time, including the layover period.
        Duration totalFlightDuration;
        Duration totalTravelTime;

        // TODO 7: Time Zones for International Flights (ZonedDateTime)
        // - Get the ZoneId for the departure airport (e.g., "America/New_York").
        // - Get the ZoneId for the destination airport (e.g., "Europe/Paris").
        // - Create ZonedDateTime objects for the departure and arrival times at the respective airports.
        // - Print the departure time in the departure time zone and the arrival time in the destination time zone.
        ZoneId departureZone;
        ZoneId arrivalZone;
        ZonedDateTime zonedDepartureTime;
        ZonedDateTime zonedArrivalTime;

        // TODO 8: Time Between Flights (ChronoUnit.between)
        // - Use ChronoUnit to calculate the number of hours between the arrival of one flight and the departure of the next.
        // - Print the number of hours between the flights.
        long hoursBetweenFlights;
    }
}
```

---

## Detailed Breakdown of Tasks:

### 1. **Flight Booking Date (LocalDate):**
   - Create the flight booking date using `LocalDate.now()`.
   - Create another `LocalDate` object representing the flight date (e.g., 2024-12-15).
   - Calculate the number of days between the booking date and the flight date using `ChronoUnit.DAYS.between()`.

### 2. **Flight Time (LocalTime):**
   - Create the departure time using `LocalTime.of(hour, minute)`.
   - Simulate a flight duration (e.g., 5 hours and 45 minutes) using `Duration.ofHours()` and `Duration.ofMinutes()`.
   - Calculate the arrival time by adding the flight duration to the departure time.

### 3. **Full Flight Schedule (LocalDateTime):**
   - Create a `LocalDateTime` object combining the flight date and time for the departure.
   - Calculate the arrival date and time by adding the flight duration to the `LocalDateTime` of the departure.

### 4. **Exact Flight Event (Instant):**
   - Capture the exact takeoff moment using `Instant.now()`.
   - Simulate a delay of 10 minutes by adding `Duration.ofMinutes(10)` to the takeoff time.

### 5. **Layover Period (Period):**
   - Use `Period.ofDays(1)` to represent a 1-day layover between two connecting flights.
   - Add the layover to the arrival time of the first flight to get the departure time for the second flight.

### 6. **Flight Duration (Duration):**
   - Create a `Duration` for the flight time (e.g., 8 hours).
   - Calculate the total travel time by adding the flight duration and the layover period.

### 7. **Time Zones for International Flights (ZonedDateTime):**
   - Create `ZonedDateTime` objects for the departure and arrival times, using the time zones of the airports.
   - Use `ZoneId.of()` to specify the time zones (e.g., "America/New_York" for departure and "Europe/Paris" for arrival).

### 8. **Time Between Flights (ChronoUnit.between()):**
   - Use `ChronoUnit.HOURS.between()` to calculate the number of hours between two flights (e.g., arrival of the first flight and departure of the second flight).

---

## Expected Output Example:

Here’s an example of how the output might look for the flight booking system:

```bash
Booking Date: 2024-09-29
Flight Date: 2024-12-15
Days Until Flight: 77

Departure Time: 14:30
Arrival Time (after 5 hours 45 minutes): 20:15

Flight Departure: 2024-12-15T14:30
Flight Arrival: 2024-12-15T20:15

Takeoff Time (UTC): 2024-12-15T14:30:00Z
Updated Takeoff Time (after 10-minute delay): 2024-12-15T14:40:00Z

Layover Period: 1 day
Next Flight Departure: 2024-12-16T20:15

Flight Duration: PT8H
Total Travel Time (including layover): PT32H

Departure Time (New York): 2024-12-15T14:30-05:00[America/New_York]
Arrival Time (Paris): 2024-12-16T08:15+01:00[Europe/Paris]

Time Between Flights: 22 hours
```

---

## Submission:
- Implement the required functionality in each method.
- Test the system with various flight schedules, time zones, and durations.
- Upload your solution to github and paste the link to the file in Canvas

---

This assignment offers hands-on experience with a real-world scenario where Java’s Date and Time API is essential for handling time zones, flight durations, and scheduling.
