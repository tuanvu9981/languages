void main() {
  const countries = [
    {'name': 'Vietnam', 'language': 'Vietnamese', 'area': 331000},
    {'name': 'Japan', 'language': 'Japanese', 'area': 373000},
    {'name': 'Korea', 'language': 'Korean', 'area': 110000},
    {'name': 'China', 'language': 'Mandarin', 'area': 9597000}
  ];

  // while
  int i = 0;
  while (i < countries.length) {
    print("Country name: ${countries[i]['name']}");
    print("\t+ Official language: ${countries[i]['language']}");
    print("\t+ Total Area: ${countries[i]['area']} km(2)\n");
    i++;
  }

  // do ... while
  i = 0;
  do {
    print("Country name: ${countries[i]['name']}");
    print("\t+ Official language: ${countries[i]['language']}");
    print("\t+ Total Area: ${countries[i]['area']} km(2)\n");
    i++;
  } while (i < countries.length);
}
