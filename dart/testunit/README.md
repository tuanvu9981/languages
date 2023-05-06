## testunit

### A. Instruction how to check async await call function
- [Instruciton url](https://docs.flutter.dev/cookbook/testing/unit/mocking)
- 1. Inside **get_album_test.dart** file: 
```
import 'package:http/http.dart' as http;
import 'package:mockito/annotations.dart';
import 'package:mockito/mockito.dart';

@GenerateMocks([http.Client])
void main(){

}
```

- 2. Second, run the command below to genenate new **get_album_test.mocks.dart**, which containing new class **MockClient()** extends **http.Client**
```
tuanvu81@host81:~/Desktop/basic_languages/dart/testunit$ flutter pub run build_runner build
```

- 3. Then, write unit test with **async**, **await** as usual
```
tuanvu81@host81:~/Desktop/.../testunit$ flutter test test/get_album_test.dart 
00:19 +2: All tests passed! 
```




