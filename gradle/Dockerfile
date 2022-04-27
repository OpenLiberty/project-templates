FROM icr.io/appcafe/open-liberty:kernel-slim-java8-openj9-ubi

COPY --chown=1001:0 /src/main/liberty/config /config

COPY --chown=1001:0 build/libs/*.war /config/apps

RUN configure.sh
