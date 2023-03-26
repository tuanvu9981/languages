import 'dart:ffi';

double devide(int d1, int d2){
  if (d2 == 0){
    throw IntegerDivisionByZeroException();
  } else return (d1/d2);
}

void main() {
  try {
    int a = int.parse("Hallo");
  } on FormatException {
    print("FormatException: String \"Hallo\" is not an integer");
  } catch (e) {
    print(e.toString());
  } finally {
    print("Warning: Continue to work ... ");
  }

  print(devide(1,0));
}
