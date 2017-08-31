
function Person(name,age){
    this.name=name;
    this.sayName=function(){
        console.log('im '+this.name);
    }
}

Person('Nag',33)