# DatastoreFieldType

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.DatastoreFieldType;

DatastoreFieldType value = DatastoreFieldType.TEXT;

// Open enum: use .of() to create instances from custom string values
DatastoreFieldType custom = DatastoreFieldType.of("custom_value");
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `TEXT`            | TEXT              |
| `NUMBER`          | NUMBER            |
| `DATE`            | DATE              |
| `BOOLEAN`         | BOOLEAN           |
| `FILE`            | FILE              |
| `TEXTAREA`        | TEXTAREA          |
| `SINGLE_SELECT`   | SINGLE_SELECT     |
| `MULTIPLE_SELECT` | MULTIPLE_SELECT   |
| `CURRENCY`        | CURRENCY          |
| `URL`             | URL               |
| `EMAIL`           | EMAIL             |
| `PHONE`           | PHONE             |
| `LINKED_RECORD`   | LINKED_RECORD     |
| `RELATION`        | RELATION          |