
/*
    this ==> current execution-context's Owner
*/


// why we need 'this' keyword ?


// let pName = "GLOBAL";

// let person = {
//     pName: 'Nag',
//     sayName: function () {
//         //let pName="LOCAL";
//         //console.log('im ' + pName); // context's hierarchy data
//         console.log('im ' + person.pName); // obj's data
//         console.log('im ' + this.pName);
//     }
// }

// // person.sayName();

// let oldPerson = person;
// person = { pName: 'Kannan' };

// oldPerson.sayName();

//----------------------------------------------------


// finction-binding

/*

    1. static function-binding
    2. dynamic function-binding

*/


// 1. static function-binding


// var p1 = { name: 'Nag', sayName: function () { console.log('im ' + this.name) } };
// var p2 = { name: 'Kannan', sayName: function () { console.log('im ' + this.name) } };


// function sayNameForAll() {
//     console.dir(this);
//     console.log('im ' + this.name);
// }
// var p1 = { name: 'Nag', sayName: sayNameForAll };
// var p2 = { name: 'Kannan', sayName: sayNameForAll };


// sayNameForAll(); // im ??     // function-invocation  : context's owner ==> global-obj 
// p1.sayName(); // im Nag       // method-invocation    : context's owner ==> invoker-obj
// p2.sayName(); // im Kannan


//---------------------------------------------------------

// 2. dynamic function-binding

// greet-lib
let greetLib = {
    sayName: function (message, from) {
        console.log(message + ' im ' + this.name + " - " + from);
    }
}

// data-obj
let p = { name: 'Nag' };
let e = { name: 'Kannan' };


// greetLib.sayName();

// // way-1
// greetLib.sayName.call(p,"Hello","AP");
// greetLib.sayName.call(e,"Hey","TN");

// // way-2
// greetLib.sayName.apply(p,["Hello","AP"]);
// greetLib.sayName.apply(e,["Hey","TN"]);


// way-3
// let personSayNameFunc = greetLib.sayName.bind(p, "Hello", "AP");
// personSayNameFunc();
// personSayNameFunc();


// let employeeSayNameFunc = greetLib.sayName.bind(e);
// employeeSayNameFunc("hey", "TN");
// employeeSayNameFunc("dude", "universe");

//-------------------------------------------------



// Constructor-Function  / Class


// 1000+ person objs..



function Person(name,age){
    this.name=name;
    this.age=age;
    this.sayName=function(){
        console.log('im '+this.name);
    }
    this.sayAge=function(){
        console.log('im '+this.age + ' old ');
    }
}

var p1=new Person('Nag',33);   // constructor invocation  : context's owner ==> new-obj
var p2=new Person('Kannan',32);

//------------------------------------------------

/*

  in .js-lang , we can invoke func kin 4 ways


  1. function invocation  ==> this -> global-obj
  2. method invocation ( static-function-binding ) => this -> invoker-obj
  3. call/apply/bind invocation ( dyanamic-function-binding) =>this -> arg-obj
  4. constructor invocation => this -> new-obj


*/