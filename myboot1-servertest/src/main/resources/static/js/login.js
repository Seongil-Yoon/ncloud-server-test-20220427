$(document).ready(function () {
    let requestGetContextPath = "/mvc";

    $("#ajaxBtn").on("click", function () {
        $.ajax({
            url: `${requestGetContextPath}/ajax/login`,
            data: {
                id: $("#id").val(),
                password: $("#password").val()
            },
            type: "post",
            dataType: "json",
            success: function (result) {
                console.log(JSON.stringify(result));
                $("#loginResult").html("<h3>" + result.role + "로그인" + "</h3>");
                $("#loginResult").append("<h3> 관리자 역할로 " + result.process + "</h3>");
            }
        }); //end of ajax
    }); //end of onClick

    $("#ajaxBtn2").on("click", function () { //내정보 조회
        $.ajax({
            url: `${requestGetContextPath}/ajax/myinform`,
            data: {
                id: $("#id").val(),
                password: $("#password").val()
            },
            type: "get",
            dataType: "json",
            success: function (dto) { //MemberDTO객체를 json으로
                console.log(JSON.stringify(dto));
                if (dto.id == "new") {
                    $("#informResult").html("<h3> 회원 정보 찾지못함</h3>");
                } else if (dto.password == "new") {
                    $("#informResult").html("<h3> 회원 암호 불일치</h3>");
                } else {
                    $("#informResult").html("<h3> 회원아이디 : " + dto.id + "</h3>");
                    $("#informResult").append("<h3> 회원이름 : " + dto.userName + "</h3>");
                    $("#informResult").append("<h3> 회원폰 : " + dto.phone + "</h3>");
                    $("#informResult").append("<h3> 회원이메일 : " + dto.email + "</h3>");
                    $("#informResult").append("<h3> 회원주소 : " + dto.address + "</h3>");
                }

            }
        }); //end of ajax
    }); //end of onClick

    $("#alllistBtn").on("click", function () { //전체회원정보 조회
        $.ajax({
            url: `${requestGetContextPath}/ajax/memberlist`,
            // data: {
            // 	id: $("#id").val(),
            // 	password: $("#password").val()
            // },
            type: "get",
            dataType: "json",
            success: function (list) { // ArrayList<MemberDTO> => Json
                if (list.length < 1) {
                    $("#listResult").html("<h3>등록된 회원이 없습니다</h3>");
                } else {
                    let table = "<table border=3>"

                    for (let i = 0; i < list.length; i++) {
                        table += `
                            <tr>
                                <td>${list[i].id}</td>
                                <td>${list[i].userName}</td>
                                <td>${list[i].address}</td>
                            </tr>
                        `
                    };
                    table += "</table>";
                    $("#listResult").html(table);
                }
            }
        }); //end of ajax
    }); //end of onClick
});