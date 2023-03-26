void main() {
  const countries = [
    {'name': 'Vietnam', 'language': 'Vietnamese', 'area': 331000},
    {'name': 'Japan', 'language': 'Japanese', 'area': 373000},
    {'name': 'Korea', 'language': 'Korean', 'area': 110000},
    {'name': 'China', 'language': 'Mandarin', 'area': 9597000}
  ];

  // traditional for style
  for (var i = 0; i < countries.length; i++) {
    print("Country name: ${countries[i]['name']}");
    print("\t+ Official language: ${countries[i]['language']}");
    print("\t+ Total Area: ${countries[i]['area']} km(2)\n");
  }

  // "in" style
  for (var obj in countries) {
    print("Country name: ${obj['name']}");
    print("\t+ Official language: ${obj['language']}");
    print("\t+ Total Area: ${obj['area']} km(2)\n");
  }

  // foreach
  countries.forEach((element) {
    print("Country name: ${element['name']}");
    print("\t+ Official language: ${element['language']}");
    print("\t+ Total Area: ${element['area']} km(2)\n");
  });
}
