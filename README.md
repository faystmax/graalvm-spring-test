# GraalVM Spring App
[![GitHub license](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/faystmax/graalvm-spring-test/blob/master/LICENSE.md)

This project was created in order to learn how to use [GraalVM](https://www.graalvm.org/) native image builds.

## Build
```console
docker build -t graalvm-spring-test .
```
Remember you will need [docker](https://www.docker.com/) installed on your OS!

## Run

```console
docker run -p 80:8080 graalvm-spring-test
```
After this you can open http://localhost:80/ in your browser.

## License

This project is licensed under the terms of the MIT license - see the [LICENSE.md](LICENSE.md) file for details