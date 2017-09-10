

let swiggy = {
    getFood: function () {
        let promise = new Promise((resolve, reject) => {
            setTimeout(function () {
                console.log('swiggy resolving/rejecting promise..');
                resolve('Biryani....');
                //reject('sorry, delivery boys busy..');
            }, 5000);
        });
        return promise;
    }
}


let bar = {
    getBeer: function () {
        let promise = new Promise((resolve, reject) => {
            setTimeout(function () {
                console.log('bar resolving/rejecting promise..');
                resolve('KF beer....');
                //reject('sorry, delivery boys busy..');
            }, 1000);
        });
        return promise;
    }
}


let trainer = {
    doWork: function () {
        console.log('tnr working.....');
        console.log('feels hungry.. requesting food on swiggy');
        let promise1 = swiggy.getFood();
        let promise2 = bar.getBeer();
        console.log('tnr got promise from swiggy & bar , deferring actions with callbacks');
        Promise.race([promise1, promise2]).then(function (items) {
            console.log('yummy ' + items);
        }, function (error) {
            console.log('i hate swiggy/bar , gng outside to have party..');
        });
        console.log('tnr cont.. with other work...... finished');
    }
};

trainer.doWork();