// Java print
// FileSystem.out.println("Hello world");
// JavaScript print

// 기초
console.log('Hello World')
console.log('This is SPARTA!')
var x = 10
var y = 20
var z = '안녕하세요'
console.log('x = '+x)
console.log('y = '+y)
console.log('x+y = '+ (x+y))
console.log(z)

// if문
if(x+y == 40){
    console.log('합이 40입니다!')
}
else{
    console.log('합이 40이 아닙니다!')
}

// for문
for(var i=0;i<10;i++){
    console.log(i)
}
for(var i=0;i<=10;i++){
    if(i%2==0){
        console.log(i+'는 짝수입니다.')
    }
    else{
        console.log(i+'는 홀수입니다.')
    }
}

// funtion
function plus_ten(x){
    return x+10;
}
var p = plus_ten(10)
console.log(p)

const { table } = require('console')
// Read text file
// 'C:/Users/dw-012/Desktop/나정수 깃허브/Na_JavaScript/text.txt'
const fs = require('fs')
try{
    const data = fs.readFileSync('C:/Users/dw-012/Desktop/나정수 깃허브/Na_JavaScript/2022.02.28/text.txt','utf-8')
    console.log(data)
} catch(err){
    console.log(err)
}
// 아래와 같이 해도 되나 err없이 file을 불러오고 싶을 때.
// const fs = require('fs')
// const data = fs.readFileSync('C:/Users/dw-012/Desktop/text.txt','utf-8')
// console.log(data)

// data table
var dataSet = [
    {name:"Na",position:"Midfielder",date:"2022/02/28",sal:"$100"},
    {name:"Son",position:"Attacker",date:"2022/01/01",sal:"$200"}
]
console.log(dataSet)
var kane = {name:"Kane",position:"Attacker",date:"2021/12/31",sal:"$300"}
// 이걸 추가하고 싶은데 아직 배우게 많다..
// 궁금한 것도 많다


// 이런거도 하고싶다.
// var av = avg(x,y)
// console.log(avg)