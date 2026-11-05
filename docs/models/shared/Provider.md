# Provider

## Example Usage

```java
import to.unified.unified_java_sdk.models.shared.Provider;

Provider value = Provider.MEETING_CAPTIONS;

// Open enum: use .of() to create instances from custom string values
Provider custom = Provider.of("custom_value");
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `MEETING_CAPTIONS` | MEETING_CAPTIONS   |
| `AWS_TRANSCRIBE`   | AWS_TRANSCRIBE     |
| `GOOGLE_SPEECH`    | GOOGLE_SPEECH      |
| `ASSEMBLYAI`       | ASSEMBLYAI         |
| `DEEPGRAM`         | DEEPGRAM           |
| `CUSTOM`           | CUSTOM             |