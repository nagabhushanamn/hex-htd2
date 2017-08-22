

/*

 functional-programming
 ------------------------

 ==> .js-lang , every function is an object


we can create function-obj in 2-ways

    way-1 : function declaration

        --> Named functions
        --> func-obj created at context creation-phase
        --> always get hoisted with func-obj

    way-2 : function expression

        --> Anonymous function
        --> func-obj created at context execution-phase
        --> we can invoke after expression


*/

//---------------------------------------------------------

// way-1 : function-declaration

// console.log(add(12, 13));

// function add(n1, n2) {
//     return n1 + n2;
// }

// console.log(add(12,13));

//---------------------------------------------------------

// way-2 : function expression

// console.log(add(12, 13));

// var add = function (n1, n2) {
//     return n1 + n2
// };

// console.log(add(12,13));

//---------------------------------------------------------

// var isAdmin = true;
// var action;

// function doLogin() {
//     //..
// }

// if (isAdmin) {
//     action = function () {
//         console.log("Hello Admin");
//     }
// } else {
//     action = function () {
//         console.log("Hello User..");
//     }
// }

// action();

//---------------------------------------------------------

// function as values

// function sayHello() {
//     console.log("Hello...");
// }
// var sayHi = sayHello;
// sayHi();

//---------------------------------------------------------

// function as args

// function greet(f) {
//     if (f) {
//         f();
//         return;
//     };
//     console.log('Hello..');
// }

// greet();
// greet(function () { console.log('Ola....') });



// e.g

// let nums = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10];
// nums.sort();
// nums.sort(function (a, b) { return a - b; });
// nums.sort(function (a, b) { return b - a; });

// console.log(nums);



//---------------------------------------------------------

// function as return values

// function teach() {
//     console.log('teaching.....');
//     let learn = function () { console.log('learning...') }
//     return learn;
// }

// let learnFunc=teach();
// learnFunc();
// learnFunc();

//---------------------------------------------------------

// function args & params


// function reflect(a) {
//     console.dir(arguments);
//     return a;
// }

// console.log(reflect(12,13));



//e.g


// function sum(){
//     let r=0,
//         len=arguments.length,
//         i=0;

//     while(i<len){
//         r+=arguments[i];
//         i++;
//     }    
//     return r;
// }

//--------------------------------------------


// function getFood() {
//     return "No Food";
// }

// function getFood(pay) {
//     if (arguments.length === 0) {
//         return "No Food";
//     }
//     if (arguments.length === 1) {
//         return "Idly, Vada, Poori";
//     }
// }

// console.log(getFood());

//--------------------------------------------


//  ES6 New Features

// a.default function params


// function func(a, b) {

//     // we must validate & assign default values

//     // if (!a) {
//     //     a = 1;
//     // }
//     // if (!b) {
//     //     b = 2;
//     // }

//     // or

//     a = a || 1;
//     b = b || 2;

//     console.log(a);
//     console.log(b);
// }

// func(undefined, 20);


// or


// function func(a=1, b=2) {
//     console.log(a);
//     console.log(b);
// }

// func(undefined, 20);



//--------------------------------------------


// b. Rest Params


// function func(a,...rest){
//     console.log(a);
//     console.log(Array.isArray(rest));
//     console.log(rest);
// }

// func(12,13,14,15);

//--------------------------------------------

// function func(){} // obj

// func.prop1=12;
// func.prop2="hello";
// func.m=function(){}

//--------------------------------------------