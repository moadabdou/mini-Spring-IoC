# Issue 7: Resource Loading Strategy

## Goal
Abstract the way we read configuration files.

## Requirements
- Interface `Resource` (methods like `getInputStream`).
- Implementations: `ClassPathResource`, `FileSystemResource`, `UrlResource`.
- Interface `ResourceLoader`.
- Implementation `DefaultResourceLoader`.

## Acceptance Criteria
- Can load a file from classpath or filesystem uniformly.
