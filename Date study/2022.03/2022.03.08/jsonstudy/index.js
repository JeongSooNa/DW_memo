const { strictEqual } = require("assert")
const { start } = require("repl")

var name = "홍길동"
var age = 23
// json
var information = {
    name : '홍길동',
    age : 23
}
console.log(information.age)

var dwAcademy = {
    students : [
        '오승택','류근환','강인석','김보겸','이인서',
        '나정수','정지유','김민영','이규성','이승섭',
        '이상협','홍준호','유영준','박종수','이재호'
    ],
    students_count : 15,
    teacher : '현상원',
    today : '2022-03-08',
    subject : ['SQL','JAVA','HTML']
}
console.log("DW Academy 학생 수 : "+dwAcademy.students_count)
console.log(`1번째 학생 : ${dwAcademy.students[1]}`) //이렇게 출력값을 지정할 때 사용할 수 있다.

/* 문제 */
// 문제 1. count가 15 이하면 학생 수 부족, 15 초과하면 학생 수 정상 
var count = dwAcademy.students_count
if(count <= 15) console.log("학생 수 부족")
else console.log("학생 수 정상")
// 문제 2. 학생 중 이 씨 count
var name = dwAcademy.students
var lee_count = 0
var searchWord = '이'
// for(var i=0;i<count;i++){
//     if(name[i].startsWith(serchWord,[,0])) lee_count++
// }
for(var i=0; i<count; i++){
    if(name[i].substring(0,1) == searchWord) lee_count++;
}
console.log(`성씨가 ${searchWord}인 사람은 ${lee_count}명 입니다.`)

// json 구조 이해
var array = [2,5,7,8]
console.log(array[1])
var arrayJson = {
    array : [2,5,7,8]
}
console.log(arrayJson.array[1])
// json 만드는 법
// 주제 : 영화
// 영화명, 장르, 감독, 배우, 개봉일, 배급사, 상영시간, 평점 ect.
var 영화1 = {
    영화명 : ['바람','범죄와의 전쟁','신세계','어바웃타임','라라랜드'],
    장르 : ['로맨스','액션','판타지'],
    배우 : ['라이언고슬링','엠마스톤']
} // 이렇게 하면 어떤 영화에 어떤 배우, 장르가 오는지 모른다!
var 영화2 = {
    영화이름 : [{영화명 : '라라랜드', 배우 : ['라이언고슬링','엠마스톤']}]
} // 이런 식으로 json을 사용해 묶는다.
var movie = {
    company : 'CJ',
    nations : 'Korea',
    movie_information : [
        {movie_name : 'Lala land', movie_actor : ['Rian gosling','Emma Stone'], movie_time : 130},
        {movie_name : 'Spider Man', movie_actor : ['Tom Holand','Gen Deia'], movie_time : 148},
        {movie_name : 'Interstella',movie_actor : ['En Heserwei','Meshu Mackernerhi'],movie_time : 169}
    ]
}
console.log("***영화시간 140분 이상인 영화 이름 출력하기***")
var len = movie.movie_information.length
var run_time = []
for(var i=0;i<len;i++){
    if(movie.movie_information[i].movie_time > 140) run_time[i] = movie.movie_information[i].movie_name;
}
const run = run_time.filter(
    (element, i) => element !== undefined
  ); // 값이 null인 배열값 삭제
console.log("상영시간이 140분 이상인 영화는 "+run+"입니다.")

// 문제
/*
    사원 ID가 3450인 사원이름은 SMITH고,
    급여는 3400 받는다.
    SMITH의 부서는 개발팀과 영업팀이다.
    SMITH의 입사날짜는 21-12-31 이고
    SMITH의 상사는 BRIAN과 KING이다.
*/
var emp = {
    empno : 3450,
    ename : 'SMITH',
    sal : 3400,
    dname : [{name : 'Developer',count : 5},'Sales'],
    hiredate : '21-12-31',
    상사이름 : ['BRIAN','KING']
}


// 함수(function)이용해서 method처럼 parameter값 받아 return하기
var x = [1,2,3,4,5]
console.log("***function을 이용하여 return값 구하기***")
function sum(x){
    var sum = 0
    for(var i=0;i<x.length;i++){
        sum += x[i]
    }
    return sum
}
console.log("합 : "+sum(x))
function max(x){
    var max = 0;
    for(var i=0;i<x.length;i++){
        if(max<x[i]) max=x[i]
    }
    return max
}
console.log("최댓값 : "+max(x))
function jjak(x){
    var jjak=[]
    for(var i=0;i<x.length;i++){
        if(x[i]%2==0) jjak.push(x[i])
    }
    return jjak
}
console.log(x+"중 짝수는 "+jjak(x)+"입니다.") 