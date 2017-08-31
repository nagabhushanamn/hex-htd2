
"use strict"

// let person = {
//     name: 'Nag',
//     age: 32
// };
// Object.defineProperty(person, 'name',
//     {
//         configurable: false,
//         writable: false,
//         enumerable: false
//     });

// // delete person.name;
// // person.name="Kannan"

// for (let prop in person) {
//     if (person.hasOwnProperty(prop)) {
//         console.log(person[prop])
//     }
// }

//--------------------------------------------------------------


// let person = {
//     name: 'Nag',
//     age: 32
// };

// Object.preventExtensions(person);   
// Object.seal(person);
// Object.freeze(person);

// person.newProp="new value";
// delete person.name;
// delete person.age;
// person.age = -1;

//--------------------------------------------------------------



let person = {
    name: 'Nag',
    _age: 32,  // data property

    // acessor property
    set age(age) {
        if (age > 0) {
            this._age = age;
        }
    },
    get age() {
        return this._age;
    }

};


person.age = 34; // set
console.log(person.age); // get

