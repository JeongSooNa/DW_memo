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
