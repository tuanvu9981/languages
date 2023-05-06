import 'package:flutter/material.dart';
import 'package:testunit/album.model.dart';
import 'package:http/http.dart' as http;

class Home extends StatefulWidget {
  const Home({super.key});

  @override
  HomeState createState() => HomeState();
}

class HomeState extends State<Home> {
  late Future<Album> futureAlbum;

  @override
  void initState() {
    super.initState();
    futureAlbum = fetchAlbum(http.Client());
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Fetch albums'),
      ),
      body: SafeArea(
        child: Center(
          child: FutureBuilder(
            future: futureAlbum,
            builder: (context, snapshot) {
              if (snapshot.hasData) {
                return Text(snapshot.data!.title!);
              } else if (snapshot.hasError) {
                return Text('${snapshot.error}');
              }
              // default
              return const CircularProgressIndicator(
                color: Colors.lightBlue,
              );
            },
          ),
        ),
      ),
    );
  }
}
