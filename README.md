# springboot-sample-app

## Build:

```
./gradlew clean createVersionFile build buildDocker
```

## Test:

```
./gradlew test
```

## View Test Reports:

```
open build/reports/tests/index.html
```

## Run:

```
./gradlew createVersionFile bootRun
```

## Run with Docker:

```
docker run -d -p 9080:9080 --name springboot-sample-app rubenpulido/springboot-sample-app:<tagName>
```

## Stop and remove Docker Container:

```
docker rm -vf springboot-sample-app
```