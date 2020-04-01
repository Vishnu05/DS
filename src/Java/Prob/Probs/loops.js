


let s = 'javascriptloops'
let v = 'aeiou'

let a = s.split('')
let vv = v.split('')

for (let i of a) {
    //console.log(i)
    //if (a[i] ==  )
}

console.log(a[0])
console.log( 'a' === 'a')

for (let i = 0; i < vv.length; i++) {

    for (let j = i; j < a.length; j++) {

        if (a[i] == vv[j]) {
            console.log('hiii')
            a[i] = ''
        }
    }
}

for (let i = 0; i < a.length; i++) {
    if (a[i] != '') {
        // console.log(a[i])
    }
}