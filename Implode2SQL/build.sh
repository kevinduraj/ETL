#!/bin/bash

clear; mvn clean compile assembly:single
java -jar target/Implode2SQL-1.0.0-jar-with-dependencies.jar

