

function func(a, b, c) {
    console.log(a);
    console.log(b);
    console.log(c);
}

let nums = [1, 2, 3];

// func(nums[0], nums[1], nums[2]);
func(...nums);


// let maxNum=Math.max(nums[0],nums[1],nums[2]);

// let maxNum=Math.max(...nums);


let arr1=[1,2,3];
let arr2=[7,8,9];
let str="NAG";

let arr=[...arr1,4,5,6,...arr2,...str];



