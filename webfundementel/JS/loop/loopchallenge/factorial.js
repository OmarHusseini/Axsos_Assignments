function fact(n) {
    var result = 1;
    for (i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}
console.log(fact(12));