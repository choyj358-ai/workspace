// 조건문, 반복문

let n1= 10;

if(n1 == 10){
    console.log("10입니다.");
}else{
    console.log("10이 아닙니다.");
}
//////////

let list = [1,2,3,4];
for (let i = 0; i < 4; i++) {
    console.log(list[i])
}
console.log("--");

for (let i of list) {
    console.log(i)
}