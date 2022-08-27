void main(){
  // 1. List có số phần tử cố định
  var status = List.filled(2, 'on', growable: false); //[on, on]
  status[1] = 'off';
  print(status);
  // [on, off]
  // status.add('unknown') --> ERROR

  // 2. List có số phần tử thay đổi 
  // 2. add(): insert to end
  // 2. List.empty(): create empty list
  // 2. List.filled(): create filled list
  var dayOfWeek = List.empty(growable: true); 
  dayOfWeek.add('Monday');
  dayOfWeek.add('Tuesday');
  dayOfWeek.add('Wednesday');
  print(dayOfWeek);
  // [Monday, Tuesday, Wednesday]

  dayOfWeek.add('Thursday');
  print(dayOfWeek);
  // [Monday, Tuesday, Wednesday, Thursday]

  // 3. insert 
  // 3. insert(index, element)
  // 3. insertAll(index, [element1, element2 ... ])
  dayOfWeek.insert(2, "Sunday"); // --> Monday, Tuesday, Sunday, Wednesday
  print(dayOfWeek);

  dayOfWeek.insertAll(2, ["Saturday", "Friday"]);
  print(dayOfWeek);
  // [Monday, Tuesday, [Saturday, Friday], Sunday, Wednesday, Thursday] from index 2nd

  // 4. remove
  // 4. removeLast(): remove the last element
  // 4. removeAt(index): remove the element at index(ths)
  // 4. remove(obj): remove the first element == "obj"
  dayOfWeek.removeLast();
  print(dayOfWeek);
  // [Monday, Tuesday, [Saturday, Friday], Sunday, Wednesday] 

  dayOfWeek.removeAt(2);
  print(dayOfWeek);
  // [Monday, Tuesday, Friday, Sunday, Wednesday] 

  dayOfWeek.remove("Monday"); // first value == "Monday"
  print(dayOfWeek);
  // [Tuesday, Friday, Sunday, Wednesday] 


  // 5. fixed type
  List<double> specialConst = [3.14, 9.8]; 
  // specialConst.add("str"); // error type 
  specialConst.add(1.678); 
}