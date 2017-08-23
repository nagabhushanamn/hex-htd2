

let tnr = {
    name: 'Nag',
    doTeach: function () {
        console.log(this.name + " teaching .js");
        let self=this;
        function doLearn() {
            console.log(this.name + ' learning .js from ' + self.name);
        }
        //doLearn();
        let emp = { name: 'Hexaware' };
        doLearn.call(emp);
    }
}


tnr.doTeach();

let newTnr = { name: 'Kannan' };
tnr.doTeach.call(newTnr);