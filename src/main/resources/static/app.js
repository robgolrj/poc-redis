var stompClient = null;

function entrar() {
    $.get( "/fila/entrar", {nome: $("#name").val() } )
        .done(function( data ) {
            //$("#greetings").text("<tr><td>" + data[0].nome + "</td></tr>");
            fila();
        });
}

function fila(){
    $.get( "/fila", { } )
        .done(function( data ) {
            //$("#greetings").text("<tr><td>" + data[0].nome + "</td></tr>");
            $("#greetings").text(JSON.stringify(data));
    });
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#entrar" ).click(function() { entrar(); });
    $( "#atualiza" ).click(function() { fila(); });
});

