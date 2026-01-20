// 람다 표현식 (expression -> 값으로 평가될 수 있는 코드 조각)

let m11 = function(){ // 익명함수
    return 1;
}

let r1 = m11(); // 1. 실행이 되면 값이 되니까, 표현식(expression)
console.log(r1);

// 람다 표현식 (함수라는 값을 만들어내는 표현식)
let m22 = function(){}

// 변수에 함수를 담는 방법들
let m33 = () => {
    return 5;
}

let r3 = m33();
console.log(r3);


let m44 = () => 7;

let r4 = m44();
console.log(r4);
