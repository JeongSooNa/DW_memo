var x = "Hello World!"
console.log(x)

const { rmSync } = require('fs');
var http = require('http');

http.createServer(function(req,res){
    res.writeHead(200,{'Content-Type': '/html'});
    res.end(hello.html);
}
).listen(1337,'192.168.0.230');
console.log('Server running at http://192.168.0.230:1337/');
