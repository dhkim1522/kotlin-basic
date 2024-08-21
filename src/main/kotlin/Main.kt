package org.example

/**
 *  Kotlin 언어의 철학
 *  - Java 에서의 장황하고 반복되는 보일러 플레이트 코드를 최대한 걷어내고 직관적이고 간결한 코드 사용
 *  - 변수, 객체 등 대부분 불변을 기본으로 하고 있고, 변경이 필요한 경우 별도의 키워드를 작성하는 방식
 *      - ex) var, open 등
 *  - 함수형 프로그래밍 패러다임을 지향하고있고 함수를 1급 객체로 사용할 수 있다.
 */

/*
 * 코틀린에서도 자바와 마찬가지로 main 함수가 프로그램의 최초 진입점이 된다.
 * 자바와는 달리 간결한 함수 선언법이 사용되는데 하위 main 함수에는 다음과 같은 키워드가 생략되어 있다.
 * - 접근제어자 : 코틀린에서는 Visibility Modifier 라는 접근제어자가 있지만 기본적으로 생략하면 Public Default
 * - static : 코틀린에서는 자바의 static 과 같은 정적 변수/메소드를 선언하려면 Top-Level Function 이라는 클래스 상위에
 *            함수나 변수를 선언함으로 정적 변수/메소드를 사용할 수 있다.
 */
fun main() {
    println("Hello World!")
}