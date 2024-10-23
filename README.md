# 🚗 자동차 경주 💭

## 자동차는 움직일 수 있다.

- [ ] 무작위 값이 4 이상인 경우 자동차는 움직인다.
- [ ] 주어진 횟수동안 움직이거나 멈춰있을 수 있다.

## 자동차는 이름을 가질 수 있다.

- [x] 이름은 5자 이하만 가능하다.

## 숫자는 무작위로 구해질 수 있다.

- [ ] 0에서 9 사이까지 무작위로 구해진다.

## 자동차는 우승할 수 있다.

- [ ] 가장 멀리 나간 자동차는 우승자가 된다.

## 사용자는 입력할 수 있다.

### 사용자는 자동차의 이름과 시도할 횟수를 입력할 수 있다.

- [x] 경주할 자동차 이름은 쉼표(,) 로 구분된다.
  ```pobi,woni,jun```

- [x] 시도할 횟수를 입력할 수 있다.
  ```5```

### 사용자는 잘못된 형태를 입력할 수 없다.

다음과 같은 경우들에는 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.

- [ ] 자동차의 이름을 5자를 초과해서 입력해서는 안된다.

## 사용자는 결과를 볼 수 있다.

### 우승자를 확인할 수 있다.

- [ ] 단독 우승자인 경우에는 다음과 같이 출력되어야 한다.
  ```최종 우승자 : pobi```
- [ ] 공동 우승자가 존재하는 경우에는 다음과 같이 출력되어야 한다.
  ```최종 우승자 : pobi, jun```

## 차수마다 자동차의 이동 결과를 확인할 수 있다.

- [ ] 다음과 같은 형태로 차수마다의 이동 결과가 출력되어야 한다.
  ```
  pobi : --
  woni : ----
  jun : ---
  ```

# 프로그래밍 요구사항

- [ ] JDK 21 버전에서 실행 가능해야 한다.
- [ ] 프로그램 실행의 시작점은 Application의 main()이다.
- [ ] build.gradle 파일은 변경할 수 없으며, 제공된 라이브러리 이외의 외부 라이브러리는 사용하지 않는다.
- [ ] 프로그램 종료 시 System.exit()를 호출하지 않는다.
- [ ] 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 등의 이름을 바꾸거나 이동하지 않는다.
- [ ] 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- [ ] 기본적으로 Java Style Guide를 원칙으로 한다.

# 프로그래밍 요구사항 2

- [ ] indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
- [ ] 3항 연산자를 쓰지 않는다.
- [ ] 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- [ ] JUnit 5와 AssertJ를 이용하여 정리한 기능 목록이 정상적으로 작동하는지 테스트 코드로 확인한다.
