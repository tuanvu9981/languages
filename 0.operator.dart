void main(){
  int a = 12;
  var b = null;

  // (exp) ? (exp1) : (exp2)
  String str = a > 10 ? "a > 10" : "a <= 10";
  print(str);

  // (exp1) ?? (exp2) 
  // --> exp1 == null return exp2, else return exp1
  var result1 = a ?? b;
  var result2 = b ?? a;
  print("result1: $result1"); // 12
  print("result2: $result2"); // 12

}