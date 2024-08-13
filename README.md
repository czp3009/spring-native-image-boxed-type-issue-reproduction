# spring native image boxed type issue reproduction

steps:

```shell
./gradlew bootBuildImage
docker run --network=host issue-reproduction
```

test:

```shell
curl localhost:8080/nonnull
```

this test will return normally

```shell
curl localhost:8080/nullable
```

but this test will return internal error
