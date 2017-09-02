/**
 * 
 */


// using DOM-API


// Query DOM

let box = document.querySelector('.jumbotron');
let hideBtn = document.querySelector('.btn-danger');
let showBtn = document.querySelector('.btn-primary');

// Bind Events

hideBtn.addEventListener('click', function(e) {
	box.style.display = 'none';
})
showBtn.addEventListener('click', function(e) {
	box.style.display = '';
})

//---------------------------------------------