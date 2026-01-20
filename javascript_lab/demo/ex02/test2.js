// 추가, 수정, 삭제, 검색

let list = [1,2,3,4,5];

// 1. 수정
// for문을 돌면서 새로운 리스트를 만들어주는 함수
let newList = list.map((i)=>i*2);
console.log("list", list);
console.log("newList",newList);
console.log("----------------------");

// 2. 추가 (전개 연산자 -> 자기의 타입을 버리고, 알맹이만 뿌린다)
let addList = [0,...list,9];
console.log("list", list);
console.log("addList",addList);
console.log("----------------------");

// 3. 검색
let searchList = list.filter((i)=>i==3);
console.log("list", list);
console.log("searchList", searchList);
console.log("----------------------");

// 4. 삭제
let delList = list.filter((i)=>i!=3);
console.log("list", list);
console.log("delList", delList);
console.log("----------------------");
