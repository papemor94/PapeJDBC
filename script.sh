#!/bin/bash

mvn compile
mvn -q clean
mvn -q package

docker run -it --rm -d \
    --name postgres1 \
    -e POSTGRES_PASSWORD=mysecretpassword \
    -e POSTGRES_USER=postgres \
    -p 5432:5432 \
    -v data-jdbc-simple-docker-pg1:/var/lib/postgresql/data \
    postgres:12.2-alpine

docker build -t monappimage .
winpty docker run -it  --name appcontainer  --link postgres1 monappimage
