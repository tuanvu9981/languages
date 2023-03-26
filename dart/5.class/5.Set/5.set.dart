void main(){
  Set<int> s = new Set();
  // var s = new Set(); --> optional type
  s.add(1);
  s.add(2);
  s.add(1);
  print(s); // {1,2}

  s.add(4);
  s.add(3);
  print(s.contains(3)); // true
  print(s.contains(199)); // false

  print("Before: $s");
  // Before: {1, 2, 4, 3}
  s.remove(4);
  print("After: $s");
  // After: {1, 2, 3}

}
