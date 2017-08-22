


/*

 2 data-types


 a. simple/primitive  ==> values

    1. string
    2. number
    3. boolean
    4. undefined
    5. symbol  ( es6 )

 b. complex/references ==> objects 



*/

//----------------------------------------------
// A. simple types
//----------------------------------------------


//----------------------------------------------

// a. string

var name = "Nag";
var myName = 'Nag';
var selection = 'a';

//----------------------------------------------

// b. number

var count = 12;
var cost = 12.12;

//----------------------------------------------

// c. boolean

var b = true;

// imp-note : .js-lang falsy vlues  ==> (false,0,"",null,undefined,NAN)


// ref : https://dorey.github.io/JavaScript-Equality-Table/


//----------------------------------------------

// d. undefined

var v;


//----------------------------------------------





//----------------------------------------------
// B. Reference types  ==> objects
//----------------------------------------------

/*
    How to create objects ?

    var ref=new Constructor();


    imp-note:

    ==> by default , all .js-objects are extensible/configurable

*/



// var config = new Object();
// config.url = "htpp://"
// config.method = "GET";
// config.success = function () {
//     console.log('req process is scuccess');
// }

// delete config.success;

//------------------------------------------------------------------


//------------------------------------------------------------------
// Literal-style objects
//------------------------------------------------------------------

//------------------------------------------------------------------
// A. Object

var config = new Object();
config.url = "htpp://"
config.method = "GET";
config.success = function () {
    console.log('req process is scuccess');
}


// litral-style
var config = {
    url: "http://",
    method: 'GET',
    success: function () {
        //...
    }
};

//------------------------------------------------------------------

// B. Array

var menu = new Array();
menu[0] = "Idly";
menu.push("Vada");
menu.push("Poori");


// literal-style 

var menu = ["Idly", "Vada", "Poori"];

//------------------------------------------------------------------

// C. RegExp

// ssn ==> 234-45-2345
// pattern ==> \d{3}-\d{2}-\d{4}


var ssnPattern = new RegExp('\\d{3}-\\d{2}-\\d{4}');


// literal-style 

var ssnPattern = /\d{3}-\d{2}-\d{4}/;

//------------------------------------------------------------------

// D. Function

/*

    imp-note : .js-lang , function is an object , then can have props & methods

*/


// var add=new Function("n1","n2","var result=n1+n2;return result");
// add.prop1=12345678;
// add.m=function(){}


// literal-style 

function add(n1, n2) {
    var result = n1 + n2;
    return result;
}
add.prop1 = 12345678;
add.m = function () { }




//--------------------------------------------


// how to access obj's properties ?

/*

    2-ways

    --> '.' , for valid obj identifer
    --> '[ ]' , for other indentifier ( i. any identifuers with '-') 

*/

var person = {
    name: 'Nag',
    'full-name': 'Nagabhushanam N'
};

// person.name="Nag N";
// console.log(person.name);


console.log(person['full-name']);