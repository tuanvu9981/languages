void main(){
  
  /* Từ khóa var: Chỉ được gán biến cho giá trị cùng kiểu */

  var number = 1;
  print(number.runtimeType); 
  // int

  var newVar = "string";
  print(newVar.runtimeType);
  // String

  var bool = false;
  print(bool.runtimeType);
  // bool

  var planets = ["Jupiter", "Saturn", "Earth", "Venus"];
  print(planets.runtimeType);
  // List<String>

  var randList = ["Jupiter", 123, false];
  print(randList.runtimeType);
  // List<Object>

  var image = {
    'type': 'planet',
    'countryCode': 133
  };
  print(image.runtimeType);
  // _InternalLinkedHashMap<String, Object>

  // image = 1; --> Compile Error

  /* Từ khóa dynamic: Gán thoải mái  */
  dynamic newImage = {
    'type': 'planet',
    'countryCode': 133
  };

  newImage = 1; // No Error
  

}