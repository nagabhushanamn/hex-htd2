



let name='Nag';
let age=33;

// Es5

let person1={
    name:name,
    age:age,
    staticProp:'some-value',
    sayName:function(){
        //..
    }
}

// Es6

let dynamicField='home';
let person2={
    name,
    age,
    [dynamicField+"-address"]:'some-value',
    sayName(){
        //..
    }
}