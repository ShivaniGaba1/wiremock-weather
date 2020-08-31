# Wiremock code for weather aplication

## Introduction

This project aims to set up Wiremock server and explore different scenarios to stub APIs.

A [web-based weather application](https://github.com/ShivaniGaba1/weather-app) is implmented which calls OpenWeather API to display current weather.
This project stubs the response from [OpenWeather API](http://api.openweathermap.org/data/2.5/weather?q=Hamburg&appid=XXX&units=metrics)

## Pre-requisites

1. Install JDK 8 and Maven 
2. OpenWeather API key, follow instructions [here](http://github.com/ShivaniGaba1/weather-app/blob/master/README.md)

## Start wiremock server
 
 Run on the terminal:
 
 ```shell
 java -jar wiremock-jre8-standalone-2.27.0.jar
 ``` 

Wiremock would start on https://localhost:8080



