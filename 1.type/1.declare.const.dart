import 'dart:io';

void main() {
  // 1 (const). Khi khai báo, bắt buộc phải biết giá trị của const.
  const PI = 3.14;
  // const PI; ERROR

  // 1 (final). Nhưng đối với final, chỉ cần biết giá trị trước lần sử dụng đầu tiên là được 
  final newPI;
  stdout.write("Hello, final's value is: ");
  newPI = 3.14;
  print(newPI);

  /************************************************************************************/

  // 2 (const). Mọi phần tử bên trong const đều là const, không được thay đổi dù 1 
  const arr = [1,2,3];
  // arr.add(4); ERROR
  // print(arr); ERROR

  const map = {
    'biggest': 'Jupiter',
    'second': 'Saturn'
  };
  // map['third'] = 'Neptune'; ERROR

  // 2 (final). Các phần tử bên trong final vẫn có thể update bình thường 
  final image = {
    'name': 'toyota',
    'takenBy': 'Andrew'
  };
  image['extension'] = 'png';
  print(image);
  // {name: toyota, takenBy: Andrew, extension: png}

  /************************************************************************************/

  // 3 (const) dùng trong class, const phải có giá trị khởi tạo + từ khóa static 
  // 3 (final) dùng như bình thường 
  
}





