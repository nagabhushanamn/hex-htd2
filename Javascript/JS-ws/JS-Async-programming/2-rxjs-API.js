

var Rx = require('rxjs/Rx');

var observableStream = Rx.Observable.create(function (observer) {
    let count = 0;
    let intervalId=setInterval(() => {
        count++;
        console.log('emitting new element/event into stream');
        observer.next(count);
        if (count === 10) {
            observer.complete();
            clearInterval(intervalId);
        }
    }, 1000);
});

var evenNumberStream = observableStream.filter(x => {
    if (x % 2 === 0) return x
});


var oddNumberStream = observableStream.filter(x => {
    if (x % 2 !== 0) return x
});


//----------------------------------------------------------------

// UI
evenNumberStream
    .subscribe(function (ele) {
        console.log("subscrbing " + ele);
    }, function (error) {
        console.log('error..');
    }, function () {
        console.log('completed..');
    });


// UI

oddNumberStream
    .subscribe(function (ele) {
        console.log("subscrbing " + ele);
    }, function (error) {
        console.log('error..');
    }, function () {
        console.log('completed..');
    });