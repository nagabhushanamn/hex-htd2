


// 1. Array destructuring


// let salaries = [10, 20, 30];

// let min = salaries[0];
// let avg = salaries[1];
// let max = salaries[2];


// let [min,avg,max]=salaries;
// let [min, , max] = salaries;

// let salaries = [10, 20];
// let [min, avg, max] = salaries;
// let [min, avg, max=50] = salaries;


// let salaries = [10, 20,[30,40]];
// let [min,avg,[max1,max2]]=salaries;


// let salaries = [10, 20, 30];

// let min, avg, max;
// [min, avg, max] = salaries;



// 1. Object destructuring


let person={
    name:'Nag',
    age:33
}

// let name=person.name;
// let age=person.age;


// let {name,age}=person;
// let {name:myName,age:myAge}=person;


let myName;
let myAge;

({name:myName,age:myAge}=person);




