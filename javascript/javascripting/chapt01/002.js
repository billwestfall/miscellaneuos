function splat(fun) { return function(array) {
return fun.apply(null, array); };
}
var addArrayElements = splat(function(x, y) { print x + y });
addArrayElements([1, 2]);
