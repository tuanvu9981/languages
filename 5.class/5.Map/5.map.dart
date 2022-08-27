void main() {
  var student = new Map();
  student['name'] = 'Tuan Vu';
  student['CPA'] = 3.6;
  student['faculty'] = 'HEDSPI';

  // EQUIVALENT TO
  /*
  var student = {
    'name': 'Tuan Vu',
    'CPA': 3.6,
    'faculty': 'HEDSPI'
  }
   */

  // 1. Loop
  student.forEach((key, value) { 
    print("$key: $value");
  });

  // 2. getKeys
  print("Keys of student map: ${student.keys}");
  // Keys of student map: (name, CPA, faculty)

  // 3. check if key exists
  if (student.containsKey("name")){
    print("student contains \"name\"");
  } else print("student doesnt contain \"name\"");

  // 4. remove a key
  student.remove("CPA");
  print(student);
  // {name: Tuan Vu, faculty: HEDSPI}

  // 5. add new map
  var person = {
    "phone": "OPPO",
    "laptop": "ASUS"
  };
  student.addAll(person);
  print('New Student: $student');
  // New Student: {name: Tuan Vu, faculty: HEDSPI, hometown: Hung Yen, laptop: ASUS}

  // 6. Empty the map
  student.clear();
  print(student); //{}
}
