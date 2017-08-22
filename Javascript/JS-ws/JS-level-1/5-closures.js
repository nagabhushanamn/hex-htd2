
/*
    - A closure is a function having access to the parent scope,
      even after the parent function has closed.

    why/where we need ?

    1. to abstract public behav of any module to other modules
    2. to executing func async, to access parenct-scoped data.

*/


// function teach(sub) {
//     console.log("teaching " + sub);
//     let notes = sub + " - notes";
//     let stories = "bla bla bla";
//     function learn() {
//         console.log('learning with - ' + notes);
//     }
//     //learn();
//     console.log('teaching end.');
//     return learn;
// }

// let learnFunc = teach('.js'); // teach-context with given args & locals

// learnFunc();
// learnFunc();

//------------------------------------------------------------

// 1. to abstract public behav of any module to other modules



// e.g counter-module

/*

    count=0;

    doCount  ==> +1
    getCount ==> 

*/




// function doCount() {
//     var count = 0;
//     count += 1;
// }
// function getCount() {
//     return count;
// }

//------------------------------------------

// function init() {

//     var count = 0; // private

//     // public
//     function doCount() {
//         count += 1;
//     }
//     function getCount() {
//         return count;
//     }

//     return {
//         inc: doCount,
//         get: getCount
//     };

// }

// var counter = init();

//----------------------------------------

// self-executable / IIFE function  ( js-module pattern)

/*

    why we need?

    --> to execute functions one-time on module load

*/

const counter = (function () {

    var count = 0; // private

    // public
    function doCount() {
        count += 1;
    }
    function getCount() {
        return count;
    }

    return {
        inc: doCount,
        get: getCount
    };

})();