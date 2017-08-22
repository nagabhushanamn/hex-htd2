

let array = [];

for (var i = 0; i < 2; i++) {
    array.push(function () { console.log(i) });
}


array[0]();
array[1]();