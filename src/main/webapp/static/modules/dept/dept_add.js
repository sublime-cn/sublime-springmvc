/**
 * Created by gavin on 25/09/2016.
 */
$(function () {
alert('olllllll');
    initTreeView();


})


function initTreeView() {
    alert("ent");
    $("#jsTreeParentUnit").jstree({
        plugins: ["wholerow", "json_data"],
        core: {
            data: {
                dataType: "json",
                url: function (node) {
                    return node.id === "#" ? "${base}/dept/tree/''" : "${base}/dept/tree/" + node.id
                }
            },
            multiple: false
        }
    }).on("dblclick.jstree", function (node) {
        selectParentMenu();
    });
}