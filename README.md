# AlgoTrade

AlgoTrade is an algorithmic trading platform that allows users to create, backtest, and simulate trading strategies using real-time and historical market data. The platform is built with a Spring Boot backend and a React frontend, leveraging Docker for containerization and Kubernetes for orchestration.

## Features

- **User Authentication**: Secure sign-up, login, and profile management.
- **Algorithm Management**: Create, read, update, and delete user-defined trading algorithms.
- **Market Data Handling**: Fetch and display simulated real-time and historical market data.
- **Backtesting**: Run trading algorithms against historical data to evaluate performance.
- **Simulated Trading**: Execute trades with simulated funds based on user-defined algorithms.
- **Performance Tracking**: Monitor and analyze the performance of trading algorithms over time.

## Tech Stack

- **Backend**: Spring Boot, Java
- **Frontend**: React, JavaScript
- **Database**: PostgreSQL with TimescaleDB extension
- **Containerization**: Docker
- **Orchestration**: Kubernetes
- **CI/CD**: GitHub Actions

## HOW TO START APP

- **Backend**: set up .env file with relevant properties -> mvn clean install -> run "docker compose -f ./docker-compose.yml up" at the root directory