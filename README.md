Project make to study
===================

My project](https://github.com/huygct/myWeb).
You can compile and run the app using the commands below (You will need npm, maven and grunt installed):

```bash
npm install && bower install
grunt
mvn tomcat7:run
```

And open [http://localhost:8080/happyToStudy](http://localhost:8080/happyToStudy)

![Image](http://imagizer.imageshack.us/a/img537/8286/EBBZOM.png)

You can also simply generate a war file to deploy on your own tomcat instance

```bash
npm install && bower install 
grunt && mvn package
```
