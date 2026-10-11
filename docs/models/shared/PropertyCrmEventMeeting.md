# PropertyCrmEventMeeting

The meeting object, when type = meeting


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `description`                                                                             | *Optional\<String>*                                                                       | :heavy_minus_sign:                                                                        | The event meeting's agendadescription                                                     |
| `endAt`                                                                                   | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | The event meeting's end datetime (ISO-8601 / YYYY-MM-DDTHH:MM:SSZ format)                 |
| `startAt`                                                                                 | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | The event meeting's start datetime (ISO-8601 / YYYY-MM-DDTHH:MM:SSZ format)               |
| `title`                                                                                   | *Optional\<String>*                                                                       | :heavy_minus_sign:                                                                        | The event meeting's topicsubject                                                          |