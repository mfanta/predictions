#!/bin/bash

set -e

cd predictions-frontend
webpack

cd ..
mvn clean install && java -jar predictions-core/target/predictions-core-*-SNAPSHOT.jar
