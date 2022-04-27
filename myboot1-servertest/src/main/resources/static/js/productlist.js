$(document).ready(function () {
    function getData() {
        $.ajax({
            url: "/productlist",
            type: "get",
            dataType: "json",
            success: function (result) {
                console.log(result);
                creatView(result);
            }
        });
    }

    function creatView(result) {
        let html = "";
        for (let i = 0; i < result.length; i++) {
            html = `
                <li>
                    <span>${result[i].productcode}</span>
                	<a href="/product?code=${result[i].productcode}">	
                    	<span>${result[i].productname}</span>
                	</a>
                    <span>${result[i].price}</span>
                    <span>${result[i].company}</span>
                    <span>${result[i].balance}</span>
                    <span>${result[i].regdate}</span>
                </li>
            `
            $("ul").append(html);
        }
    }

    getData();
});