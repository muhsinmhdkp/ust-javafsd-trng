class sba5{
    cnt:number;
    constructor(x:number){
        this.cnt = x;
    }
    checkfornum(arr:number[]):void{
        var flag = 0;
        for(var i=0;i<arr.length;i++)
        {
            if (this.cnt == arr[i])
            {
                flag = 1
                break
            }
            
        }
        if (flag ==1)
        {
            console.log(this.cnt+"is in the array")
        }
        else
        {
            console.log(this.cnt+"is not in the array")
        }
    }
}
var arr_values= new Array(1,2,3,4,5,6,7,8,9)
console.log("Check for the element in array:")
var ob1 = new sba5(1)
ob1.checkfornum(arr_values)
var ob2 = new sba5(12)
ob2.checkfornum(arr_values)