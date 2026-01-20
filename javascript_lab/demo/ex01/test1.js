// 변수 선언 (객체) : let
let n1; // undefined
console.log(n1);

// 변수의 초기화
let n2 = 1;
console.log(n2);

// 변수의 타입 (동적 타입 = 타입추론)실행 시에 이루어져. 힙
let n3 = 10; // number
console.log(typeof n3);

let n4 = 10.5; // number
console.log(typeof n4);

let n5 = "문자열"; // string
console.log(typeof n5);

let n6 = '문자열 "안녕"'; // string
console.log(n6);

let n7 = `문자열 ${n4}`; // string
console.log(n7);

let n8 = true; // boolean
console.log(typeof n8); 

let n9 = null; // object
console.log(typeof n9); 