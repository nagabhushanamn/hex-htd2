


// symbol

// let s1=Symbol.for('key1');
// let s2=Symbol.for('key1');



// let emp1 = { name: 'A', [Symbol.for('java')]: 'java,spring' }
// let emp2 = { name: 'B', [Symbol.for('js')]: '.js,NG' }
// let emp3 = { name: 'C', [Symbol.for('java')]: 'java,jee' }


// if (emp1[Symbol.for('java')]) {
//     console.log('this emp is java-employe...');
// }

//-------------------------------------------


// let menu = ['idly', 'vada', 'poori'];


// for(let item of menu){
//     console.log(item);
// }

//-------------------------------------------


let idMaker = {
    [Symbol.iterator]: function () {
        let id = 0;
        return {
            next: function () {
                return {
                    done: id <= 10 ? false : true,
                    value: ++id > 10 ? undefined : id
                }
            }
        }
    }
};


// for(let id of idMaker){
//     console.log(id);
// }

// let ids = [...idMaker];

let [id1,id2,id3]=idMaker;