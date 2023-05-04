# Бизнес-сущность стоматолог

### Documentation

Для запуска требуется наличие java 8, maven

Чтобы развернуть приложение в контейнере:

1. Собрать jar
2. Сборка образа: docker build --build-arg JAR_FILE=target/*.jar -t zub-dentist-image-tag .
3. Запуск контейнера: docker run -p 8080:8080 --name zub-dentist-service 9aac7e5a0b13 




