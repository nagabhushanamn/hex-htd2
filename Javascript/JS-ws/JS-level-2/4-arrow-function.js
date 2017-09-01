


// function getPrice(){
//     return 100.00;
// }

// let getPrice=function(){
//     return 100.00;
// }

//-------------------------------------------------


// Arrow Function - syntax

// let getPrice = () => { return 100.00 }
// let getPrice = () => 100.00 + 10
// let getPrice = (count) => count * (100.00 + 10 )
// let getPrice = count => count * (100.00 + 10)
// let getPrice = (count,tax) => count * (100.00 + 10) + tax;

// let getPrice = (count,tax) => { 
//     let cost=count * (100.00 + 10);
//     let total=cost + tax;
//     return total
// };


// why we need ? 


// 1. simple in func-arg


let arr = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10];
// arr.sort();

// arr.sort(function(a,b){
//     return a-b;
// });

// arr.sort((a,b)=>a-b);


// 2. to invoke on creator ( no dyanamic func binding )  

/*

 limitation with regular-function:

    --> can bind to any object dynamically


 advantages of arrow-function:
 
   --> always bound to creator-obj

*/


// let tnr = {
//     name: 'Nag',
//     doTeach: function () {
//         console.log(this.name + " teaching .js");

//         //let self=this;

//         // let askQues = function (ques) {
//         //     console.dir(this);
//         //     console.log(this.name + " answering " + ques);
//         // }


//         let askQues = (ques) => {
//             console.dir(this);
//             console.log(this.name + " answering " + ques);
//         }


//         return askQues;

//     }
// };


// let askQuesFunc = tnr.doTeach();
// askQuesFunc('Q1');

// let newTnr = { name: 'Kannan' };
// askQuesFunc.call(newTnr, "Q2");


//--------------------------------------------------------


// Quiz


// let invoice={
//     num:123,
//     process:function(){
//         console.log('invoice '+this.num + " processed");
//     }
// };


// let invoice={
//     num:123,
//     process:()=>{
//         console.log('invoice '+this.num + " processed");
//     }
// };


// let invoice = {
//     num: 123,
//     process: function () {
//         console.log('invoice ' + this.num + " processed partially");
//         let completeProcess = function () {
//             console.log('invoice ' + this.num + " processed complete");
//         }
//         return completeProcess;
//     }
// };


// let invoice = {
//     num: 123,
//     process: function () {
//         console.log('invoice ' + this.num + " processed partially");
//         let completeProcess = () => {
//             console.log('invoice ' + this.num + " processed complete");
//         }
//         return completeProcess;
//     }
// };

// let completeProcess = invoice.process();
// completeProcess();

//---------------------------------------------






