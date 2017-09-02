


// ES5

// function Person(name,age){
//     this.name=name;
//     this.age=age;
// }
// Person.prototype.sayName=function(){
//     console.log('im '+this.name);
// }
// Person.prototype.sayAge=function(){
//     console.log('im '+this.age);
// }

// var p1=new Person('Nag',33)
// var p2=new Person('Kannan',31)

//-----------------------------------------


// Es6

class Person {

    constructor(name, age) {
        console.log('Person :: constructor');
        this.name = name;
        this.age = age;
    }

    sayName() {
        console.log('im ' + this.name);
    }

    sayAge() {
        console.log('im ' + this.age);
    }

}

// let p1 = new Person('Nag', 33)
// let p2 = new Person('Kannan', 31)


class Employee extends Person {
    constructor(name, age, salary) {
        super(name, age);
        console.log('Employee :: constructor');
        this.salary = salary;
    }
    saySalary() {
        console.log('i get ' + this.salary + " only");
    }
    askForRaise() {
        return this.salary * 0.02;
    }
}

//let emp = new Employee('Nag', 33, 1000.00);

class Boss extends Employee {

    askForRaise() {
        return this.salary * 0.2;
    }

}

let boss = new Boss('Nag', 33, 1000);


class Abc{
    static staMethod(){
        console.log('Abc.stamethod()');
    }
}
Abc.staVar=12;

Abc.staMethod();



