var count = 0;
var countImage = 0;
var map = new Map();
const listImages = new Map();
/*const setMarks = new Set();
var mapMarks = new Map();*/

$("body").on("click", ".btn-images-width", function () {
    console.log($(this).val());
    $(".container-image").children("img").css("width", "" + $(this).val() + "");
});

$("body").on("click", "#btn-reset", function () {
    console.log('abc');
    //var form = new FormData();
    var files = document.getElementById("chapterImages").files;
    var List = [].slice.call(files);
    // var list = document.getElementById("chapter-image");
    console.log(files);
    console.log(List);
    // console.log(list.item(0).files);
    List.splice(1, 1);
    console.log('abc');
    console.log(files);
    console.log(List);
    /*for (var i = 0; i < List.length; i++) {
        console.log(List[i]);
        //form.append("image", List[map.get(i)]);
    }*/
    console.log('abc');
    $(".text-block").remove();
    count = 0;
    map.clear();
});

/*$("body").on("click", ".container-image", function () {
    console.log($(this));
    console.log('def456');
    //$(this).remove();
    var v = $(this).attr('value');
    //console.log(v);
    //$('.li-' + v).remove();
    var divMark = $('.li-' + v).find("div");
    if ($(divMark).is('.text-block')) {
        $('.li-' + v).children('div:last-child').remove();
        return;
    }
    $('.li-' + v).append('<div class="text-block">'+ count +'</div>');
    map.set(count, $(this).val);
    count++;
});*/

$("body").on("click", ".del-img-block", function () {
    //console.log($(this));
    console.log('abc123');
    console.log(listImages);
    var v = $(this).attr('value');
    console.log(v);
    $('.li-' + v).remove();
    listImages.delete('file-' + v);
    console.log(listImages);
    /*var divMark = $(this).find("div");
    if ($(divMark).is('.text-block')) {
        $(this).children('div:last-child').remove();
        return;
    }
    $(this).append('<div class="text-block">' + count + '</div>');
    map.set(count, $(this).val);
    count++;*/
});

/*var mark = (self) => {
    // var files = document.getElementById("file").files;
    // var innerdiv = document.createElement("div");
    // innerdiv.setAttribute("class","text-block");
    //
    // var h1 = document.createElement("h1");
    // var textNode = document.createTextNode(count);
    // h1.appendChild(textNode);
    // innerdiv.appendChild(h1);
    // self.appendChild(innerdiv);
    var div = self.getElementsByClassName('container-image');
    console.log(div);
    if (self.getElementsByClassName('text-block') != null) {
        var listItemsCate = $(div).find("div");
        if ($(listItemsCate).is('.text-block')) {
            return;
        }
        var innerdiv = document.createElement("div");
        innerdiv.setAttribute("class", "text-block");

        var h1 = document.createElement("h1");
        var textNode = document.createTextNode(count);
        h1.appendChild(textNode);
        innerdiv.appendChild(h1);
        div.append(innerdiv);
    }

    //console.log(self.getElementsByClassName('text-block'));



    //console.log(listItemsCate);

    // if(self.hasClass("text-block"))console.log()

    // if(files.length<map.size){
    //
    // }

    map.set(count, div.getAttribute("value"));
    count++;
}*/
var loadFile = function (input) {
    // var image = document.getElementById('output');
    // image.src = URL.createObjectURL(event.target.files[0]);
    var file = input.files;
    //var files = document.getElementById("chapterImages").files;
    var list = [].slice.call(file);
    /*for (let i = 0; i < list.length; i++) {
        console.log(list[i]);
        listImages.set('file-' + (i + 1), list[i]);
        //form.append("image", List[map.get(i)]);
    }*/
    console.log(file);
    console.log(listImages);
    for (var i = 0; i < file.length; i++) {
        countImage++;
        listImages.set('file-' + (countImage), list[i]);
        var li = document.createElement("li");
        //li.setAttribute("onclick", "mark(this)");
        var div = document.createElement("div");
        li.setAttribute("class", "li-" + countImage);
        li.setAttribute("value", countImage);
        //div
        div.setAttribute("class", "container-image");
        div.setAttribute("value", countImage);

        var image = document.createElement("img");
        image.src = URL.createObjectURL(file.item(i));
        image.setAttribute("style", "width:300px");
        // images.id="chapter-image";
        // images.setAttribute("onclick","mark(this)");
        // imgaes.value=i;
        var element = document.getElementById("container-images");
        var divDel = document.createElement("div");
        divDel.setAttribute("class", "del-img-block");
        divDel.setAttribute("value", countImage);
        var iDel = document.createElement("i");
        iDel.setAttribute("class", "fa fa-close");
        divDel.appendChild(iDel);
        div.appendChild(image);
        li.appendChild(div);
        li.append(divDel);
        element.appendChild(li);
    }
    $('#chapterImage').html('Chọn ảnh của chương <span class="text-danger">*</span>');
    $('#chapterImages').val('');
    // for(var i = 0; i < file.length; i++){
    //     var images = document.createElement("img");
    //     images.src=URL.createObjectURL();
    //     var element = document.getElementById("image-container");
    //     element.appendChild(images);
    // }
};
var submit = () => {
    var form = new FormData();
    var files = document.getElementById("chapterImages").files;


    var List = [].slice.call(files);


    // var list = document.getElementById("chapter-image");

    // console.log(list.item(0).files);

    for (var i = 0; i < List.length; i++) {
        console.log(map.get(i));
        form.append("image", List[map.get(i)]);
    }


    // for(var i = 0; i < map.length; i++){
    //     form.append("image",map.get(i));
    // }



    // console.log("keys",form.keys());
    //
    // console.log(files.length);
    // fetch('/upload/image/1/1', {method: "POST",body: form})
}
$('form[name="chapterAdd"]').on('submit', function () {
    var listItemsCate = $("#container-images").find("li");
    console.log(listItemsCate.length);
    if (listItemsCate.length < 1) {
        $('#chapterImage').html('Chọn ảnh của chương <span class="text-danger">*</span>  <span class="errors">Hãy chọn ảnh</span>');
        //e.preventDefault();
    }
});
$("form[name='chapterAdd']").validate({
    // Specify validation rules
    rules: {
        // The key name on the left side is the name attribute
        // of an input field. Validation rules are defined
        // on the right side
        /*comicName: {
            required: true,
            minlength: 1
        },*/
        //"authors[]": "required",
        /*lastname: "required",*/
        "comicId": {
            required: true
        },
        "chapterNum": {
            required: true,
            min: 0,
            max: 20000
        }
    },
    messages: {
        "comicId": "Hãy chọn truyện muốn thêm chương",
        "chapterNum": {
            required: "Hãy nhập số",
            min: "Số chương không nhỏ hơn 0",
            max: "Số chương không lớn hơn 20000"
        }
        //"authors[]": "Please choose comic author",
        /*lastname: "Please enter your lastname",
        password: {
            required: "Please provide a password",
            minlength: "Your password must be at least 5 characters long"
        },
        email: "Please enter a valid email address"*/
    },
    submitHandler: function (form) {
        if ($('.errors').length > 0) {
            console.log($('.errors').length);
            isValid = 0;
        } else {
            form.submit();
        }
    }
});