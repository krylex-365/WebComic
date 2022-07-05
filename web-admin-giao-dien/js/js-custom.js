function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('.your_picture_image')
                .attr('src', e.target.result);
        };

        reader.readAsDataURL(input.files[0]);
    }
}

function capphattaikhoan() {
    $('#taikhoan').val('123456');
}

function checkDel() {
    if ($("#checkBoxAll").is(":checked")) {
        $(".chkCheckBoxId").prop("checked", true);
        $("#btnDel").prop("disabled", false);
    }
    else {
        $(".chkCheckBoxId").prop("checked", false);
        $("#btnDel").prop("disabled", true);
    }
}
function checkSingleDel() {
    if ($(".chkCheckBoxId").is(":checked")) {
        $("#btnDel").prop("disabled", false);
    }
    else {
        $("#btnDel").prop("disabled", true);
    }
}
$(document).keypress(
    function (event) {
        if (event.which == '13') {
            //console.log('abc');
            event.preventDefault();
        }
    });
$(document).on('change', 'input', function () {
    console.log($(this).attr('id'));
    switch ($(this).attr('id')) {
        case "authorInput": {
            $('#authorName').html('Tác giả <span class="text-danger">*</span>');
            var val = $(this).val();
            var listItems = $("#authorsList").find("li");
            if (listItems.length > 0) {
                for (j = 0; j < listItems.length; j++) {
                    if ($(listItems[j]).text() === val) {
                        $("#authorInput").val("");
                        return;
                    }
                }
            }
            $("#authorsList").append('<li class="remove-Author">' + val + '<input type="hidden" name="authors[]" value="' + val + '"/></li>');
            //<li>Banana<input type='hidden' name='fruits[]' value='Banana' /></li>
            $("#authorInput").val("");
            break;
        }
        case "categoryInput": {
            $('#categoryName').html('Thể loại <span class="text-danger">*</span>');
            var val = $(this).val();
            var listItems = $("#categoriesList").find("li");
            if (listItems.length > 0) {
                for (j = 0; j < listItems.length; j++) {
                    if ($(listItems[j]).text() === val) {
                        $("#categoryInput").val("");
                        return;
                    }
                }
            }
            $("#categoriesList").append('<li class="remove-Category">' + val + '<input type="hidden" name="categories[]" value="' + val + '"/></li>');
            //<li>Banana<input type='hidden' name='fruits[]' value='Banana' /></li>
            $("#categoryInput").val("");
            break;
        }
        case "comicInput": {
            var val = $(this).val();
            var listItems = $("#comicsList").find("li");
            if (listItems.length > 0) {
                for (j = 0; j < listItems.length; j++) {
                    if ($(listItems[j]).text() === val) {
                        $("#comicInput").val("");
                        return;
                    }
                }
            }
            $("#comicsList").append('<li class="remove-Comic">' + val + '<input type="hidden" name="comics[]" value="' + val + '"/></li>');
            //<li>Banana<input type='hidden' name='fruits[]' value='Banana' /></li>
            $("#comicInput").val("");
            break;
        }
        case "chapterAddComicInput": {
            var val = $(this).val();
            var options = $('#chapterAddComicSelect')[0].options;
            for (var i = 0; i < options.length; i++) {
                if (options[i].text == val) {
                    console.log(options[i].text);
                    console.log(options[i].value);
                    $("#chapterAddComicSelect").val(options[i].value);
                    $("#chapterAddComicInput").val("");
                    return;
                }
            }
            break;
        }
    }
    /*if ($(this).is("#authorInput")) {
        //console.log($(this));
        $('#authorName').html('Tác giả <span class="text-danger">*</span>');
        var val = $(this).val();
        var listItems = $("#authorsList").find("li");
        if (listItems.length > 0) {
            for (j = 0; j < listItems.length; j++) {
                if ($(listItems[j]).text() === val) {
                    $("#authorInput").val("");
                    return;
                }
            }
        }
        $("#authorsList").append('<li class="remove-Author">' + val + '<input type="hidden" name="authors[]" value="' + val + '"/></li>');
        //<li>Banana<input type='hidden' name='fruits[]' value='Banana' /></li>
        $("#authorInput").val("");
    } else if ($(this).is("#categoryInput")) {
        $('#categoryName').html('Thể loại <span class="text-danger">*</span>');
        var val = $(this).val();
        var listItems = $("#categoriesList").find("li");
        if (listItems.length > 0) {
            for (j = 0; j < listItems.length; j++) {
                if ($(listItems[j]).text() === val) {
                    $("#categoryInput").val("");
                    return;
                }
            }
        }
        $("#categoriesList").append('<li class="remove-Category">' + val + '<input type="hidden" name="categories[]" value="' + val + '"/></li>');
        //<li>Banana<input type='hidden' name='fruits[]' value='Banana' /></li>
        $("#categoryInput").val("");
    } else if ($(this).is("#comicInput")) {
        //console.log($(this));
        var val = $(this).val();
        var listItems = $("#comicsList").find("li");
        if (listItems.length > 0) {
            for (j = 0; j < listItems.length; j++) {
                if ($(listItems[j]).text() === val) {
                    $("#comicInput").val("");
                    return;
                }
            }
        }
        $("#comicsList").append('<li class="remove-Comic">' + val + '<input type="hidden" name="comics[]" value="' + val + '"/></li>');
        //<li>Banana<input type='hidden' name='fruits[]' value='Banana' /></li>
        $("#comicInput").val("");
    } else if ($(this).is("#chapterAddComicInput")) {
        //console.log($(this));
        var val = $(this).val();
        var options = $('#chapterAddComicSelect')[0].options;
        for (var i = 0; i < options.length; i++) {
            if (options[i].text == val) {
                console.log(options[i].text);
                console.log(options[i].value);
                $("#chapterAddComicSelect").val(options[i].value);
                $("#chapterAddComicInput").val("");
                break;
            }
        }
    }*/
    /*var options = $('#authorsRecommence')[0].options;

    for (var i = 0; i < options.length; i++) {
        if (options[i].value === val) {

            break;
        }
    }*/
});
$("body").on("click", ".remove-Author", function () {
    $(this).remove();
});
$("body").on("click", ".remove-Category", function () {
    $(this).remove();
});
$("body").on("click", ".remove-Comic", function () {
    $(this).remove();
});
$('form[name="comicAdd"]').on('submit', function () {
    var listItemsCate = $("#categoriesList").find("li");
    if (listItemsCate.length < 1) {
        $('#categoryName').html('Thể loại <span class="text-danger">*</span>  <span class="errors">Hãy chọn thể loại</span>');
        //e.preventDefault();
    }
    var listItemsAuth = $('#authorsList').find('li');
    if (listItemsAuth.length < 1) {
        $('#authorName').html('Tác giả <span class="text-danger">*</span>  <span class="errors">Hãy chọn tác giả</span>');
        //e.preventDefault();
    }
    /*console.log($('.errors').length);
    if ($('.errors').length > 0) {
        console.log($('.errors').length);
        e.preventDefault();
        return false;
    }*/
});
$("form[name='comicAdd']").validate({
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
        /*lastname: "required",
        email: {
            required: true,
            // Specify that email should be validated
            // by the built-in "email" rule
            email: true
        },
        password: {
            required: true,
            minlength: 5
        }*/
    },
    messages: {
        comicName: "Tên truyện không được bỏ trống",
        status: "Hãy chọn tình trạng truyện",
        description: "Nội dung truyện không được bỏ trống",
        dateFrom: "Ngày phát hành không được bỏ trống",
        thumbnail: "Ảnh bìa không được bỏ trống",
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


