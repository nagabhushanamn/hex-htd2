
// imp-note :

/*

event handlers always executed 
by an obj who emitted that event

*/

function Person(name,age){
    this.name=name;
    this.age=age;

    // browser's Timer API
    let self=this;
    setInterval(function(){
        //console.dir(this)
        //console.log('after 1s interval');
        self.age++;
        console.log(self.name +" --> "+self.age);
    },1000);

}

let p1=new Person('Nag',33);
let p2=new Person('Kannan',31);