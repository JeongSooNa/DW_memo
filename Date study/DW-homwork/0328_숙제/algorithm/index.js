// 자바스크립트 or 자바 선택해서 풀 것!
// 버블정렬을 이용하여 오름차순으로 정렬하고 총 몇회전 했는지 알아내시오.
let array = [1, 10, 4, 3, 5];
let count = 0; //총 몇회전 했는지 알아내는 변수

// Bubble sort funtion
function bubble(array){
    var len = array.length;
    for(var i=0;i<len-1;i++){
        for(var j=0;j<len-i-1;j++){
            var tmp=0;
            if(array[j]>array[j+1]){
                tmp = array[j];
                array[j]=array[j+1];
                array[j+1]=tmp;
                count++;
            }
        }
    }
    return array;
}
var array1 = bubble(array);
console.log(array1);
console.log(count);


function bubbleResult(array){
    let len = array.length;
    let isSwap = null;
    for(let i=len; i>0;i--){
        isSwap = false;
        for(let j=0;j<(i-1);j++){
            let tmp=0;
            if(array[j]>array[j+1]){
                tmp = array[j];
                array[j]=array[j+1];
                array[j+1]=tmp;
                count++;
                isSwap = true;
            }    
        }
        if(!isSwap) break; // for문 닫기
    }
    return array;
}
var array2 = bubble(array);
console.log(array2);
console.log(count);0