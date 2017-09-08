// console.log('hello , GM');

// function foo(b) {
//   var a = 10;
//   return a + b + 11;
// }

// function bar(x) {
//   var y = 3;
//   return foo(x * y);
// }

// console.log(bar(7));

//---------------------------------------


// function foo(){}
// function bar(){foo()}
// function baz(){bar()}
// baz();

//--------------------------------------



// function foo(){ throw new Error('oops')}
// function bar(){foo()}
// function baz(){bar()}
// baz();

//--------------------------------------

// function foo(){
//     foo();
// }
// foo();

//-------------------------------------


// function longRunning(){
//     var i=0;
//     while(i<10){
//         console.log('long.....');
//         i++;
//     }
// }

// function shortRunning(){
//     console.log('im quick...');
// }


// longRunning();
// shortRunning();


//-------------------------------------

console.log('start.....');

var vegBtn = document.querySelector('.veg');
vegBtn.addEventListener('click', function vegHandler(event) {
    console.log('serving veg food...');
})

var nonVegBtn = document.querySelector('.non-veg');
nonVegBtn.addEventListener('click', function nonVegHandler(event) {
    console.log('serving nonveg food...');
})

// or

// console.log('start.....');
// $.on('.veg','click',function vegHandler() {
//     console.log('serving veg food...');
// });
// $.on('.non-veg','click',function nonVegHandler() {
//     console.log('serving non-veg food...');
// });


// function longRunning(){
//     var i=0;
//     while(i<10){
//         console.log('long.....');
//         i++;
//     }
// }
// longRunning();

// console.log('cont.. with other work....');

//----------------------------------------------------------




console.log('start...');

// Event
setTimeout(function timeout(){
    console.log('after timeout...');
},1000);

console.log('cont.. with other work....');

function longRunning(){
    var i=0;
    while(i<10){
        console.log('long.....');
        i++;
    }
}
longRunning();

console.log('cont.. with other work....');