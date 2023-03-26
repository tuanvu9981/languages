double calculateSum(double a, [double? b, double? c]) {
  double sum = a;
  if (b != null) {
    sum += b;
  }
  return (c != null) ? sum += c : sum;
}

void main() {
  var result1 = calculateSum(4);
  print('Result 1: $result1'); // 4 

  var result2 = calculateSum(4, 5);
  print('Result 2: $result2'); // 4 + 5 = 9

  var result3 = calculateSum(4, 5, 6);
  print('Result 3: $result3'); // 4 + 5 + 6 = 15
}
