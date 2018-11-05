
//插入排序
var arr = [1,2,6,3,0,4,7];

/*for (var i = 1;i < arr.length; i++){
    var mi = i;
    //mi-1>=0,表示前一个数字存在
    //a[mi-1]>a[mi]，表示前一个数字更大
    while(mi-1 >= 0 && a[mi-1] > a[mi]){
        [arr[mi],arr[mi-1]] = [arr[mi-1],arr[mi]];
        mi--;
    }
}*/

for(var i = 1;i< arr.length;i++) {
    var j, t;
    if(arr[i]<arr[i-1]){
        t = arr[i];
        j = i - 1;
        while(j >= 0 && arr[j] > t){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j+1] = t;
    }
}


console.log(arr);