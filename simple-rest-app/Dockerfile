FROM openliberty/open-liberty:kernel-java8-openj9-ubi

COPY --chown=1001:0 /src/main/liberty/config /config

COPY --chown=1001:0 target/*.war /config/apps

RUN configure.sh
