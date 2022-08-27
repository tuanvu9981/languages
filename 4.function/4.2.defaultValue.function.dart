double calculateSum(var a, {double b: 1, double c: 2}) {
  // b, c == null --> by default: b = 1, c = 2
  return a + b + c;
}

void main() {
  var result1 = calculateSum(4);
  print('Result 1: $result1'); // 4 + 1 + 2 = 7

  var result2 = calculateSum(4, b: 5);
  print('Result 2: $result2'); // 4 + 5 + 2 = 11
  // --> Syntax: <var_name>:<value>

  var result3 = calculateSum(4, b: 5, c: 6);
  print('Result 3: $result3'); // 4 + 5 + 6 = 15
}
