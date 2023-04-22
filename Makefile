.PHONY: all
all: docker run

.PHONY: docker
docker: java
	docker build -t jaxrs-docker-example .   # put fat jar into container

.PHONY: java
java: target/forge-test-thorntail.jar

target/forge-test-thorntail.jar: $(shell find src/ -type f)
	mvn clean install             # create the "fat jar"

.PHONY: run
run:
	docker run -ti -p 8080:8080 --pull=never $(EXTRA_DOCKER_OPTS) jaxrs-docker-example
