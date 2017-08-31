

// Model
let tnr = { name: 'Kannan' }

// Service
let service = {
    doTeach: function () {
        console.log(this.name + " teaching .js");
    }
}


let teachBtn = document.querySelector('.btn-primary');

// way-1

// teachBtn.addEventListener('click', function (event) {
//     service.doTeach.call(tnr);
// });



// way-2
teachBtn.addEventListener('click', service.doTeach.bind(tnr));
