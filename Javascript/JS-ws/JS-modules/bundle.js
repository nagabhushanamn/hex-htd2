(function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({1:[function(require,module,exports){
console.log('-main.js-');


// var hex = hex || {};
// hex.mod1.doWork();


//----------------------------

// let mod1 = require('./pack1');
// mod1.greet('es');
// mod1.gm();

//----------------------------

let hexGreet = require('hexaware-greet');
hexGreet.greet('en');
hexGreet.gm();


},{"hexaware-greet":2}],2:[function(require,module,exports){

// var hex = hex || {};

// (function () {

//     var i = 10;

//     hex.mod2.doWork();
//     hex.mod3.doWork();

//     var o = {
//         doWork: function () {
//             console.log('im mod1');
//         }
//     }

//     hex.mod1 = o;  // export

// })();

//----------------------------------------------------


console.log('-mod1.js-');

let message = "good-morining";

function sayGM() {
    console.log(message);
}

let en = require('./mod2');
let es = require('./mod3');

function greet(lang) {
    if (lang === 'en') en();
    if (lang === 'es') es();
}

module.exports = {
    gm: sayGM,
    greet
};

},{"./mod2":3,"./mod3":4}],3:[function(require,module,exports){


// var hex=hex || {};

// (function () {

//     var o = {
//         doWork: function () {
//             console.log('im mod2');
//         }
//     }

//     hex.mod2=o;

// })();

//----------------------------------------------------

function greet() {
    console.log('Hello..');
}

module.exports=greet;
},{}],4:[function(require,module,exports){

// var hex = hex || {};

// (function () {

//     var o = {
//         doWork: function () {
//             console.log('im mod3');
//         }
//     }

//     hex.mod3 = o;

// })();

//----------------------------------------------------

function greet() {
    console.log('Ola..');
}

module.exports=greet;

},{}]},{},[1]);
