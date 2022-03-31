var x = Math.random(1,2)
console.log(x)

// how to use statistics in javascript
/*
var data = [
    { ID: 1, age: 33 },
	{ ID: 2, age: 42 },
	{ ID: 3, age: 27 }
]
var column = {
    ID: 'oridinal',
    age: 'interval'
}
var setting = {}

var stats = new Statistics(data, column, setting)

var meanAge = stats.arithmeticMean("age");
var stdDevAge = stats.standardDeviation("age");
*/


var information = {
    "name" : "Jeong Soo Na",
    "age" : 29,
    "adress" : "대전 중리동",
    "isMarry" : false
}
console.log(information)
var name = information.name
var age = information.age
if(age>=30){
    console.log(name+"는 30대입니다.")
}
else{
    console.log(name+"는 20대입니다.")
}

// 상수 선언(java에서의 final)
const pi = 3.14
// 배열 생성 및 index
var array = [1,2,3,4,5,10]
for(let i=0;i<array.length;i++){
    if(array[i]%2==0){
        var value = array[i]
        console.log(value+"는 짝수입니다.")  
    } 
}
var max = 0
for(let i=0;i<array.length;i++){
    var value = array[i]
    if(max<value) max = value
}
console.log("max : "+max)

// 배열로 table 만들기
var data = [
    {name : "son", position : "Forward", backNum : 7},
    {name : "Cha", position : "Forward", backNum : 10},
    {name : "Park", position : "Midfielder", backNum : 7}
]
console.log(data[0].name)
console.log(data[1].name)
console.log(data[2].name)
var name = []
for(let i=0;i<data.length;i++){
    name[i] = data[i].name
}
console.log(name)
console.log(data[0].name)

console.log(data[1])