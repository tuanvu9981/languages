double sum(double a, double b) {
  return a + b;
}

// Equivalent to
double arrowSum(double a, double b) => (a + b);

var func1 = (var a, var b) {
  return a - b;
};

var var1 = (var a, var b) {
  return a * b;
}(5, 6);

// Callback function
void printSomething(var a, var b, var printMessage) {
  var c = a + b;
  printMessage(c);
}

void main() {
  print('Using as a function: ${func1(5, 2)}');
  print('Using as a variable: ${var1}');
  printSomething(9, 10, (z) => print('Sum of a & b: $z'));
}
