# AchievementStatus

Progress towards the goal

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.AchievementStatus;

AchievementStatus value = AchievementStatus.IN_PROGRESS;

// Open enum: use .of() to create instances from custom string values
AchievementStatus custom = AchievementStatus.of("custom_value");
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `IN_PROGRESS`    | IN_PROGRESS      |
| `IMPROVING`      | IMPROVING        |
| `WORSENING`      | WORSENING        |
| `NO_CHANGE`      | NO_CHANGE        |
| `ACHIEVED`       | ACHIEVED         |
| `SUSTAINING`     | SUSTAINING       |
| `NOT_ACHIEVED`   | NOT_ACHIEVED     |
| `NO_PROGRESS`    | NO_PROGRESS      |
| `NOT_ATTAINABLE` | NOT_ATTAINABLE   |
| `OTHER`          | OTHER            |