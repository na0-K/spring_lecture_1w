# 자바 스프링 강의 1주차
## 스프링 프레임워크 (스프링 부트)
* **자바** 언어에서 **웹서버 구축**할때 사용
* 이 외에 다양하게 사용가능
	* API
	* 영속화
	* 테스트
	* 로그인 보안
	* MSA
	* 비동기

### 프로젝트 생성 (https://start.spring.io)
* 프로젝트 압축파일로 생성
	Project : Gradle
	Language : Java
	Spring Boot : 2.5.4
	Packaging : Jar
	Java : 11
	No dependency
* 압축 해제후 Toolbox - Intellij Community에서 open

## 의존
### 웹 의존성 추가
build.gradle (빌드 도구)
```java
//web 의존성 추가
implementation 'org.springframework.boot:spring-boot-starter-web'
```
끝 쪽에 **web**추가

### 의존성 관리의 필요성
* A가 B를 소유하고 있는경우 A가 B를 의존한다로 표현
```java
public class AComponent {
    BComponent bComponent;
}
```
* 의존성 관리가 필요한 이유
	1. 소스 중복 방지
	2. 메모리 낭비 방지
	3. 의존하는 객체들까지 모두 고려하여 구현할 필요가 없음

### 프로세스 만들때 ApplicationRunner
* 스프링 부트에서 제공하는 객체
```java
//implements ApplicationRunner 추가
@Component
public class Process implements ApplicationRunner {

}
```
* run 함수 오버라이딩 생성
```java
@Override
    public void run(ApplicationArguments args) throws Exception {

    }
```
* 스프링프레임워크가 처음 실행될때 hooking을 받음 (함수 호출)

### 스프링에서 제공하는 의존성 관리
* @Bean(=@Component) : 스프링 컨테이너에 등록된 객체
* @Component : 컨테이너에 등록
* @Autowired : 스프링 컨테이너에 등록된 객체 주입

## 의존성 주입 방법
1. 필드주입
```java
BComponent bComponent = new BComponent();
```

2. 생성자주입
```java
public AComponent(BComponent bComponent){
	this.bComponent = bComponent;
}
```
3. SETTER	주입
```java
public void setbComponent(BComponent bComponent) {
        this.bComponent = bComponent;
    }
```

* 순환참조 이슈때문에 **생성자 주입**을 주로 사용
	* *순환참조 이슈 - 의존성이 강해져서 나중에 변경하기가 어려워짐*
* A, B 서로 의존하는 상황이여만 한다면 interface를 추가해서 의존성이 약하게 만들어준다.

## 참고
* https://github.com/kidongYun/spring_lecture_week1