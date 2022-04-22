// 자바스크립트 or 자바 선택해서 풀 것!
// 선택정렬을 이용해서 오름차순으로 정렬해보자.
// 선택정렬 관련해서 서치는 좋지만 코드는 직접 풀어봐요! 과정을 중요시 생각합니다 :)
let array = [9, 6, 7, 3, 5];
// array의 최댓값 찾기
var max=0;
for(var i=0;i<array.length;i++) {
    if(max<i) max=i;
}
for(var i=0;i<array.length-1;i++){ // 최소값을 넣을 index
    var min = max;
    var minIndex = 0;
    for(var j=i;j<array.length;j++){ // 최솟값
        if(array[j]<min){
            min = array[i];
            minIndex = j;
        }
    }
    // 자리 찾아가기
    var tmp = array[i];
    array[i] = array[minIndex];
    array[minIndex] = tmp;
}
console.log(array)