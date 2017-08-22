


/*

    Execution-context/scope
    -------------------------- 

    memory/stack-frame with given args & locals 
    to execute instructions.

    phases
    -------

    phase-1: creation

          "all variables declaed with 'var' keyword anywhere 
           in that context will get hoisted to top with default value(undefined)""

    phase-2: execution

        -> instructions will get execute in seq.

  --------------------------------------------------------------------


  by default , js-runtime always creates one global-context & global-object


      global-object


      browser-envi   ==> window
      Node.js envi   ==> global/process

 --------------------------------------------------------------------  
 
 every function-invocation , 
 also creates new-context which child of in which context function has declared

--------------------------------------------------------------------  

*/




// console.log(v);
// var v=12;

//---------------------------------------------

// var v = 12;

// function f1() {
//     console.log(v);
//     var v = 13;
// }

// f1(); // f1-context  <=== global-context 

//---------------------------------------------



// var v = 12;

// function f1() {
//     function f2() {
//         console.log(v);
//     }
//     //f2();  // f2-context  <=== f1-context
//     var v = 13;
//     return f2;
// }


// var f2 = f1(); // f1-context <=== global-context

// f2();// f2-context  <=== f1-context

//---------------------------------------------


// var v=100;

// if(true){
//     var v=200;
//     console.log(v);
// }

// console.log(v);

//---------------------------------------------

// var v=12;
// var v=13;


//---------------------------------------------


/*

     bad things about 'var' keyword


     -> always will get hoist

        best-practice:

        ==> always declare variables at top

     -> no block-scope 
     -> can re-declare same variable multiple times within context



     soln :
     
       using 'let' & 'const' keywords  ( from ES6 version )
     

*/

//---------------------------------------------

// console.log(v);  // Reference Error
// let v=12;
// console.log(v);

//---------------------------------------------

// var v=100;

// if(true){
//     let v=200;
// }

// console.log(v);

//---------------------------------------------

// let v=12;
// let v=13; // Error, cant re-declare

//---------------------------------------------


/*

    with 'let' keyword, we can mutate reference of variables

*/


// const v=12;
// v=13;


// const trainer={
//     name:'Nag'
// };

// trainer.name="Kannan";


