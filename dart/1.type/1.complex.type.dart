void main(){
  // 6. List of specific type
  List<String> phoneBrand = ["OPPO", "Samsung", "Iphone", "Xiaomi"];
  print(phoneBrand);
  // Output: ["OPPO", "Samsung", "Iphone", "Xiaomi"]

  phoneBrand.forEach((element) {print(element);});
  /*Output: 
  OPPO
  Samsung
  Iphone
  Xiaomi
  */

  List<double> someNumbers = [2.0, 5.0, 3.5];
  var ints = someNumbers.map((e) => e.toInt());
  print(ints); 
  // Output: (2,5,3) --> ROUNDING

  // 7. Map of specific type
  Map<String, double> laptops = {
    "ASUS":123.5,
    "Macbook":110.7,
    "Levono":109.5,
  };

  print(laptops);

  // 8. Set 
  Set<double> doubleVals = {3.14, 4.5, 8.5};
  print(doubleVals);
}