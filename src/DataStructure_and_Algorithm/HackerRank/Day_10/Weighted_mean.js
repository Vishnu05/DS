function processData(input) {
    //Enter your code here
    //console.log(  input.split("\n"));
    let inp = input.split("\n");


    //return e*inp[2]
    let down = inp[2].split(' ').map(Number);
    let upt = inp[1].split(' ');
    let up = [];
    upt.map((e, index) => {
        const coun = e * (down[index]);
        up.push(coun);
    })


    const upSum = up.reduce((a, b) => a + b, 0);
    const downSum = down.reduce((a, b) => a + b, 0);

    let mean = upSum / downSum;
    // console.log("mean", mean, upSum, downSum);
    return console.log(mean.toFixed(1));
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
    processData(_input);
});
