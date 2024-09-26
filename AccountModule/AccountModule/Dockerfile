# Use the official Maven image as the base image
FROM maven:3.9.2-eclipse-temurin-17

# Install required packages
RUN apt-get update && apt-get install -y \
    xvfb \
    zip \
    wget \
    ca-certificates \
    libnss3-dev \
    libasound2 \
    libxss1 \
    libappindicator3-1 \
    libindicator7 \
    gconf-service \
    libgconf-2-4 \
    libpango1.0-0 \
    xdg-utils \
    fonts-liberation \
    libgbm1

# Download and install Google Chrome
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb \
    && dpkg -i google-chrome*.deb || apt --fix-broken install -y

# Download and install ChromeDriver
COPY chromedriver /usr/local/bin
RUN chmod +x /usr/local/bin/chromedriver


COPY . .
RUN mvn clean install