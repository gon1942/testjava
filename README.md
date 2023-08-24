
# Simple Web Application With Spring Boot Configuration

A simple web app shows the default configuration for Spring MVC with Thymeleaf with Spring Boot, and a little rest endpoint with Spring Rest Controller

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You must have installed on your machine

- JDK 1.8 or later
- Maven 3 or later
- Git 2 or later

### Clone and Install

```
git clone https://github.com/eddy16/simple-springboot-webapp.git

cd simple-springboot-webapp

mvn clean install
```

### Run

```
mvn spring-boot:run
```

### Test
There are two URL mapped, the first one is a simple rest endpoint and you can get with:
```
curl localhost:8080/hello/yourname
```
Or simply put it in the browser.

The another one is a simple hello world page built with Thymeleaf, just put the url in the browser:
```
localhost:8080
```



## References

* [Spring Boot](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) - The official Spring Boot Documentation
* [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/) - A official example 


### 프로젝트 생성:

Maven 기반의 Spring Boot 프로젝트를 생성하십시오. Spring Initializr를 사용하여 간편하게 생성할 수 있습니다.

### git-commit-id-plugin 추가:

프로젝트의 pom.xml 파일에 git-commit-id-plugin 플러그인을 추가합니다:


<build>
    <plugins>
        <plugin>
            <groupId>pl.project13.maven</groupId>
            <artifactId>git-commit-id-plugin</artifactId>
            <version>4.0.5</version>
            <executions>
                <execution>
                    <goals>
                        <goal>revision</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

### Git 훅 설정:

Git 레포지토리의 .git/hooks 디렉토리에 commit-msg 파일을 생성하고 실행 권한을 부여합니다:


touch .git/hooks/commit-msg
chmod +x .git/hooks/commit-msg

commit-msg 파일에 다음 내용을 추가하여 커밋 메시지가 "feature:", "fix:", "docs:" 등의 접두어로 시작하는지 확인합니다:


### #!/bin/sh

COMMIT_MSG_FILE=$1
COMMIT_MSG_CONTENT=$(cat $COMMIT_MSG_FILE)

if [[ ! "$COMMIT_MSG_CONTENT" =~ ^(feature|fix|docs|style|refactor|perf|test): ]]; then
    echo "Invalid commit message format!"
    echo "Your commit message should start with one of the following prefixes: feature:, fix:, docs:, style:, refactor:, perf:, test:"
    exit 1
fi