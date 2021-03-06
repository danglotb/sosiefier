var paper = Snap(document.getElementById("svg"));

var classWidth = 150;
var marginX = 10;
var marginY = 10;
var claseeNameSize = 15;
var stroke_Width = 3;
var maxNumberOfClassPerLine = 4;
var maxNumberOfPackagePerLine = 3;
var jsonData;
var dataDir;
var steroid = true, reaction = true, wittgenstein = true, random = true, mutation = true, cvl = true;

buildVisu = function (jsonArray, dataPath) {
        jsonData = jsonArray;
        paper.clear();
        var visu = new Visu(jsonData);
        visu.draw();
        dataDir = dataPath;
    console.log(dataPath)
};

$(document).find('#random-button').click(function () {
    if ($(this).hasClass("btn-success")) {
        random = false;
        $(this).attr("class", "btn btn-danger");
    } else {
        random = true;
        $(this).attr("class", "btn btn-success");
    }
    paper.clear();

    var visu = new Visu(jsonData);
    visu.draw();
});

$(document).find('#reaction-button').click(function () {
    if ($(this).hasClass("btn-success")) {
        reaction = false;
        $(this).attr("class", "btn btn-danger");
    } else {
        reaction = true;
        $(this).attr("class", "btn btn-success");
    }
    paper.clear();
    var visu = new Visu(jsonData);
    visu.draw();
});

$(document).find('#steroid-button').click(function () {
    if ($(this).hasClass("btn-success")) {
        steroid = false;
        $(this).attr("class", "btn btn-danger");
    } else {
        steroid = true;
        $(this).attr("class", "btn btn-success");
    }
    paper.clear();
    var visu = new Visu(jsonData);
    visu.draw();
});

$(document).find('#wittgenstein-button').click(function () {
    if ($(this).hasClass("btn-success")) {
        wittgenstein = false;
        $(this).attr("class", "btn btn-danger");
    } else {
        wittgenstein = true;
        $(this).attr("class", "btn btn-success");
    }
    paper.clear();
    var visu = new Visu(jsonData);
    visu.draw();
});


function Visu(JSONObject) {
    this.JSONObject = JSONObject;
    this.group = paper.g();
    this.package;

    this.draw = function () {
        this.package = [];
        for (var i = 0; i < this.JSONObject.length; i++) {
            this.package[i] = new VisuPackage(this.JSONObject[i], paper);
            this.package[i].draw(0, 0);
        }
        this.package = this.package.sort(function (i, j) {
            return j.height - i.height;
        });

        var maxSize = 0;
        var currentY = marginY;
        var currentX = marginX;
        var w = 0 , h = 0;
        var i = 0;
        var line = 0;
        while (i < this.package.length) {
            if (line == maxNumberOfPackagePerLine) {
                line = 0;
                currentY += maxSize + 2 * marginY;
                currentX = marginX;
            }
            if (line == 0) {
                this.package[i].translate(currentX, currentY);
                this.group.add(this.package[i].group);
                maxSize = (this.package[i]).height;
                h = Math.max(h, maxSize + marginX);
                i++;
            } else {
                cl = this.packageToDraw(maxSize, i);
                var y = currentY;

                for (var j = 0; j < cl.length; j++) {
                    this.package[i + j].translate(currentX, y);
                    this.group.add(this.package[i + j].group);
                    y += (this.package[i + j]).height + 2 * marginY;
                }
                h = Math.max(h, y);
                i = i + cl.length;
            }

            currentX = currentX + (this.package[i - 1]).width + marginX;
            w = Math.max(w, currentX + (this.package[i - 1]).width + marginX);
            line++;
        }
        this.resizeDiv(h, w);
    };

    this.packageToDraw = function (maxSize, j) {
        var cl = [];
        var i = j;
        var currentSize = 0;
        while (i < this.package.length && currentSize <= maxSize - ((this.package[i]).height)) {
            cl.push(this.package[i]);
            currentSize += this.package[i].height + marginY;
            i++;
        }
        return cl;
    };

    this.resizeDiv = function (height, width) {
        var svg = $("#svg");
        svg.width(width);
        svg.height(height);
    };
}









