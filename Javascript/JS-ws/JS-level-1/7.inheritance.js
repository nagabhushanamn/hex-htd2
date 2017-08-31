
/*

    Inheritance
    ---------------

    how to implement inheritance in .js-lang ?

     using 'prototypes'

     chil-obj  ===> parent-obj( prototype ) 


*/

function Person(name, age) {
    this.name = name;
    this.age = age;
    // this.sayName = function () {
    //     console.log('im ' + this.name);
    // }
    // this.sayAge = function () {
    //     console.log('im ' + this.age + " old");
    // }
}
Person.prototype.sayName = function () {
    console.log('im ' + this.name);
}
Person.prototype.sayAge = function () {
    console.log('im ' + this.age + " old");
}

// let p1 = new Person('Nag', 33);
// let p2 = new Person('Kannan', 31);

//-----------------------------------------------


function Employee(name, age, salary) {
    Person.call(this, name, age);
    this.salary = salary;
}

Employee.prototype=new Person();

Employee.prototype.saySalary = function () {
    console.log('i get ' + this.salary);
}


let emp = new Employee('Nag', 33, 1000.00);

//----------------------------------------------


// 


// var o1={a:1};
// var o2=Object.create(o1);


// let e=Object.create(emp);
// 
