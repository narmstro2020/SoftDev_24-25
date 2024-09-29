
# Java's Time and Date API

## 1. `LocalDate`
**`LocalDate`** represents a date without a time zone in the ISO-8601 calendar system (e.g., 2024-09-29).

### Key Methods:
- `now()`: Gets the current date from the system clock.
- `of(int year, int month, int dayOfMonth)`: Creates an instance of `LocalDate` with the specified year, month, and day.
- `parse(CharSequence text)`: Converts a `String` representation of a date to a `LocalDate`.
- `plusDays(long daysToAdd)`, `minusDays(long daysToSubtract)`: Adds or subtracts days.
- `getYear()`, `getMonth()`, `getDayOfMonth()`: Retrieves year, month, and day from the `LocalDate`.

### Code Example:

```java
import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        
        // Create a specific date
        LocalDate specificDate = LocalDate.of(2023, 9, 28);
        System.out.println("Specific Date: " + specificDate);
        
        // Parse a string to create a LocalDate
        LocalDate parsedDate = LocalDate.parse("2024-09-29");
        System.out.println("Parsed Date: " + parsedDate);
        
        // Add 5 days to the date
        LocalDate futureDate = currentDate.plusDays(5);
        System.out.println("Future Date: " + futureDate);
        
        // Get year, month, and day
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);
    }
}
```

[Java 21 LocalDate API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/LocalDate.html)

## 2. `LocalTime`
**`LocalTime`** represents a time without a date in the ISO-8601 calendar system (e.g., 12:34:56).

### Key Methods:
- `now()`: Gets the current time from the system clock.
- `of(int hour, int minute)`: Creates an instance of `LocalTime` with the specified hour and minute.
- `parse(CharSequence text)`: Converts a `String` representation of a time to a `LocalTime`.
- `plusHours(long hoursToAdd)`, `minusMinutes(long minutesToSubtract)`: Adds or subtracts hours or minutes.
- `getHour()`, `getMinute()`, `getSecond()`: Retrieves the hour, minute, and second from the `LocalTime`.

### Code Example:

```java
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        
        // Create a specific time
        LocalTime specificTime = LocalTime.of(12, 30);
        System.out.println("Specific Time: " + specificTime);
        
        // Parse a string to create a LocalTime
        LocalTime parsedTime = LocalTime.parse("15:45:30");
        System.out.println("Parsed Time: " + parsedTime);
        
        // Add 2 hours to the time
        LocalTime futureTime = currentTime.plusHours(2);
        System.out.println("Future Time: " + futureTime);
        
        // Get hour, minute, and second
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        System.out.println("Hour: " + hour + ", Minute: " + minute + ", Second: " + second);
    }
}
```

[Java 21 LocalTime API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/LocalTime.html)


## 3. `LocalDateTime`
**`LocalDateTime`** represents both a date and time, but without a time zone (e.g., 2024-09-29T12:34:56).

### Key Methods:
- `now()`: Gets the current date-time from the system clock.
- `of(int year, int month, int dayOfMonth, int hour, int minute)`: Creates an instance of `LocalDateTime`.
- `plusDays(long daysToAdd)`, `minusHours(long hoursToSubtract)`: Adds or subtracts days and hours.
- `toLocalDate()`, `toLocalTime()`: Extracts the date or time component from `LocalDateTime`.
- `parse(CharSequence text)`: Converts a `String` representation of a date and time to `LocalDateTime`.

### Code Example:

```java
import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDateTime);
        
        // Create a specific date-time
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 9, 29, 14, 30);
        System.out.println("Specific DateTime: " + specificDateTime);
        
        // Parse a string to create a LocalDateTime
        LocalDateTime parsedDateTime = LocalDateTime.parse("2024-09-29T14:30:00");
        System.out.println("Parsed DateTime: " + parsedDateTime);
        
        // Add 3 days and 4 hours to the date-time
        LocalDateTime futureDateTime = currentDateTime.plusDays(3).plusHours(4);
        System.out.println("Future DateTime: " + futureDateTime);
        
        // Extract date and time components
        System.out.println("Date: " + currentDateTime.toLocalDate());
        System.out.println("Time: " + currentDateTime.toLocalTime());
    }
}
```

[Java 21 LocalDateTime API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/LocalDateTime.html)

## 4. `Instant`
**`Instant`** represents a point on the timeline (e.g., a timestamp).

### Key Methods:
- `now()`: Gets the current timestamp.
- `ofEpochSecond(long epochSecond)`: Creates an instance of `Instant` from the epoch second (1970-01-01T00:00:00Z).
- `plusSeconds(long secondsToAdd)`: Adds seconds to the instant.
- `minusMillis(long millisToSubtract)`: Subtracts milliseconds from the instant.
- `toEpochMilli()`: Converts the instant to the number of milliseconds since the epoch.

### Code Example:

```java
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        // Get the current timestamp
        Instant currentInstant = Instant.now();
        System.out.println("Current Instant: " + currentInstant);
        
        // Create an instant from epoch seconds
        Instant epochInstant = Instant.ofEpochSecond(0);
        System.out.println("Epoch Instant: " + epochInstant);
        
        // Add 10 seconds to the instant
        Instant futureInstant = currentInstant.plusSeconds(10);
        System.out.println("Future Instant: " + futureInstant);
        
        // Get the number of milliseconds since the epoch
        long epochMilli = currentInstant.toEpochMilli();
        System.out.println("Milliseconds since epoch: " + epochMilli);
    }
}
```

[Java 21 Instant API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html)

## 5. `Period`
**`Period`** represents a period of time in terms of years, months, and days (e.g., 1 year, 2 months, and 3 days).

### Key Methods:
- `between(LocalDate startDateInclusive, LocalDate endDateExclusive)`: Gets the period between two dates.
- `ofYears(int years)`, `ofMonths(int months)`: Creates a period of a specified number of years or months.
- `plusDays(long daysToAdd)`: Adds days to the period.
- `getYears()`, `getMonths()`, `getDays()`: Gets the number of years, months, or days in the period.

### Code Example:

```java
import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        // Calculate the period between two dates
        LocalDate startDate = LocalDate.of(2023, 9, 28);
        LocalDate endDate = LocalDate.of(2024, 9, 29);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period);
        
        // Create a period of 2 years, 3 months, and 10 days
        Period specificPeriod = Period.of(2, 3, 10);
        System.out.println("Specific Period: " + specificPeriod);
        
        // Get years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("Years: " + years + ", Months: " + months + ", Days: " + days);
    }
}
```

[Java 21 Period API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Period.html)


## 6. `Duration`
**`Duration`** represents a time span in terms of seconds and nanoseconds.

### Key Methods:
- `between(Temporal startInclusive, Temporal endExclusive)`: Calculates the duration between two temporal objects.
- `ofHours(long hours)`, `ofMinutes(long minutes)`: Creates a `Duration` representing the number of hours or minutes.
- `plusSeconds(long secondsToAdd)`: Adds seconds to the duration.
- `toHours()`, `toMinutes()`, `toMillis()`: Converts the duration to hours, minutes, or milliseconds.

### Code Example:

```java
import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        // Calculate the duration between two times
        LocalTime startTime = LocalTime.of(12, 0);
        LocalTime endTime = LocalTime.of(14, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration);
        
        // Create a duration of 2 hours and 15 minutes
        Duration specificDuration = Duration.ofHours(2).plusMinutes(15);
        System.out.println("Specific Duration: " + specificDuration);
        
        // Convert duration to minutes and seconds
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();
        System.out.println("Minutes: " + minutes + ", Seconds: " + seconds);
    }
}
```

[Java 21 Duration API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html)

## 7. `ZoneId`
**`ZoneId`** represents a time zone (e.g., "America/New_York").

### Key Methods:
- `of(String zoneId)`: Creates a `ZoneId` from a string (e.g., "Europe/Paris").
- `getId()`: Gets the unique identifier of the `ZoneId`.
- `getAvailableZoneIds()`: Returns all available zone IDs.

### Code Example:

```java
import java.time.ZoneId;
import java.util.Set;

public class ZoneIdExample {
    public static void main(String[] args) {
        // Get the system default time zone
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println("Default Zone ID: " + defaultZone);
        
        // Create a specific ZoneId
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        System.out.println("New York Zone ID: " + newYorkZone);
        
        // Get all available Zone IDs
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("Available Zone IDs: " + allZoneIds.size());
    }
}
```

[Java 21 ZoneId API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/ZoneId.html)


## 8. `ZonedDateTime`
**`ZonedDateTime`** represents a date and time with a time zone.

### Key Methods:
- `now()`: Gets the current date-time from the system clock in the default time zone.
- `of(LocalDateTime localDateTime, ZoneId zone)`: Creates a `ZonedDateTime` with a specific date-time and zone.
- `withZoneSameInstant(ZoneId zone)`: Adjusts the date-time to a different time zone, maintaining the same instant.
- `getZone()`: Gets the `ZoneId` associated with this `ZonedDateTime`.
- `toLocalDateTime()`: Extracts the `LocalDateTime` part from a `ZonedDateTime`.

### Code Example:

```java
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // Get the current ZonedDateTime in the default time zone
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println("Current ZonedDateTime: " + currentZonedDateTime);
        
        // Create a ZonedDateTime with a specific date-time and zone
        LocalDateTime localDateTime = LocalDateTime.of(2024, 9, 29, 14, 30);
        ZonedDateTime newYorkZonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("America/New_York"));
        System.out.println("New York ZonedDateTime: " + newYorkZonedDateTime);
        
        // Change the zone, maintaining the same instant
        ZonedDateTime tokyoZonedDateTime = newYorkZonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokyo ZonedDateTime (same instant): " + tokyoZonedDateTime);
    }
}
```

[Java 21 ZonedDateTime API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/ZonedDateTime.html)

## 9. `ChronoUnit.between()`
The **`ChronoUnit`** class provides standard units of time (such as `DAYS`, `HOURS`, `MINUTES`, etc.).

### Key Method:
- `ChronoUnit.between(Temporal startInclusive, Temporal endExclusive)`: Calculates the amount of time between two temporal objects (e.g., `LocalDate`, `LocalDateTime`, `Instant`).

### Code Example:

```java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {
    public static void main(String[] args) {
        // Calculate the number of days between two dates
        LocalDate startDate = LocalDate.of(2023, 9, 28);
        LocalDate endDate = LocalDate.of(2024, 9, 29);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days between: " + daysBetween);
        
        // Calculate the number of months between two dates
        long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate);
        System.out.println("Months between: " + monthsBetween);
    }
}
```

[Java 21 ChronoUnit API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/temporal/ChronoUnit.html)

