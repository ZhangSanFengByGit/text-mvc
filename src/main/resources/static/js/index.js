var url  = "/sendText";

var firstTime = true;
var sessionId = "None";

function sendText(){
    var interface=document.getElementById('div-responseText');
    var input = document.getElementById("input-text").value;
    document.getElementById("input-text").value = "";

    var client=document.createElement('div');
    client.class='div-clientText';
    client.id='clientText';
    client.innerHTML = input;
    client.style = "margin: 8px;text-align: left;";
    interface.appendChild(client);

    var server=document.createElement('div');
    server.class='div-serverText';
    server.id='serverText';
    server.innerHTML = "loading ...";
    server.style = "margin: 8px;text-align: right;";
    interface.appendChild(server);


    var request = new XMLHttpRequest();
    request.open("POST", url, true);
    request.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    body = JSON.stringify({ "sessionId": sessionId, "text": input });
    console.log(request);
    console.log(body);

    request.onload = function () {
        var response = JSON.parse(request.responseText);
        console.log(response)
        if (firstTime) {
            firstTime = false;
            sessionId = response.sessionId;
        }
        var responseText = response.text;
        let client = document.getElementById("serverText")
        client.innerHTML = responseText;
        client.removeAttribute("id");
    }
    //document.getElementById("serverText").innerHTML = "好的没问题哦";
    request.send(body);
}