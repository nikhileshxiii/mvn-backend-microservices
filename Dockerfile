FROM maven as mvn
WORKDIR /app
COPY ./ /app

RUN mvn clean install


# FROM openjdk
# WORKDIR /mvnapp
# COPY --from=mvn */target/*.jar ./

