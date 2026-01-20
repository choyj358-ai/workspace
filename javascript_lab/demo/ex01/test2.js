// 컬렉션과 오브젝트

// 1. 컬렉션
let list = [1,2,"삼",4];
console.log(list);
console.log(list[0]);
console.log(list[1]);
console.log(list[2]);
console.log(list[3]);
list[2] = 3;
console.log(list);
console.log(typeof list);

// 2. 해시맵같은 오브젝트
let user = {
    no: 1,
    name: "길동",
    phone : "0102222",
    hobby: ["축구", "농구"]
};
console.log(typeof user);
console.log(user.no);
console.log(user.name);
console.log(user.phone);
console.log(user.hobby[0]);
console.log(user.hobby[1]);

user.no = 2;
console.log(user);
