


function tngSessionStart() {

    function Employee(name) {
        this.name = name;
    }

    let e1 = new Employee('irshad'); // constructor invocation
    let e2 = new Employee('raja');


    function Trainer(name) {
        this.name = name;
        this.doTeach = function () {
            console.log(this.name + " teaching .js");
            let self = this;
            let doLearn = function () {
                console.log(this.name + " learning .js from " + self.name);
            }
            return doLearn;
        }
    }

    let tnr1 = new Trainer('Nag'); // constructor invocation
    let tnr2 = new Trainer('Kannan');


    let learnFunc1 = tnr2.doTeach(); // method-invocation


    learnFunc1.call(e1);  // call/apply/bind invocation
    learnFunc1.call(e2);



}


tngSessionStart();  // function-invocation