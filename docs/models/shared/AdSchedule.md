# AdSchedule


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `bidModifier`                                 | *Optional\<Double>*                           | :heavy_minus_sign:                            | 0.1-10.0                                      |
| `dayOfWeek`                                   | [DayOfWeek](../../models/shared/DayOfWeek.md) | :heavy_check_mark:                            | N/A                                           |
| `endHour`                                     | *double*                                      | :heavy_check_mark:                            | 0-24 (24 = end of day)                        |
| `endMinute`                                   | *Optional\<Double>*                           | :heavy_minus_sign:                            | 0, 15, 30, 45                                 |
| `startHour`                                   | *double*                                      | :heavy_check_mark:                            | 0-23                                          |
| `startMinute`                                 | *Optional\<Double>*                           | :heavy_minus_sign:                            | 0, 15, 30, 45                                 |